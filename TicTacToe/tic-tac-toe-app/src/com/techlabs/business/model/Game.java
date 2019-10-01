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
		if (currentPlayer == this.players[0])
			currentPlayer = this.players[1];
		else if (currentPlayer == this.players[1])
			currentPlayer = this.players[0];
	}

	public void play(int location) {

		if (!board.getCells()[location].checkDuplicateLocation()) {
			board.setMarkAtLocation(location, currentPlayer);
			switchPlayer();
		}
	}

	public Result getStatus() {
		status = resultAnalyzer.getResult();
		return status;
	}

	public Player[] getPlayers() {
		return players;
	}

	public Board getBoard() {
		return board;
	}

	public ResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

}
