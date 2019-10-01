package com.techlabs.business.model;

public class Game {

	Player[] players;
	Board board;
	private Result status;
	ResultAnalyzer resultAnalyzer;
	Player currentPlayer;

	public Game(Player[] players, Board board, ResultAnalyzer resultAnalyzer) {
		this.players = players;
		currentPlayer = this.players[0];
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		this.status = resultAnalyzer.getResult();
	}

	public void switchPlayer() {
		if (currentPlayer == players[0])
			currentPlayer = players[1];
		else if (currentPlayer == players[1])
			currentPlayer = players[0];
	}

	public void play(int location) {

		if (!board.getCells()[location].checkDuplicateLocation()) {
			board.setMarkAtLocation(location, currentPlayer);
			switchPlayer();
		} else
			throw new CellIsAlreadyMarkedException("Cell is already Marked");
		resultAnalyzer.analyzeResult();
		status = resultAnalyzer.getResult();

	}

	public Result getStatus() {
		return status;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

}
