package com.techlabs.business.model;

public class ResultAnalyzer {

	private Board board;
	private Result result;

	public ResultAnalyzer(Board board) {
		this.board = board;
		this.result = Result.PROGRESS;
	}

	public void analyzeResult() {

		getColoumnResult();
		getRowResult();
		getLeftDiagonalResult();
		getRightDiagonalResult();
		getDrawResult();
	}

	public void getRowResult() {
		int i = 0;
		while (i <= 6) {
			if (!board.getCells()[i].getMark().equals(Mark.E)
					&& board.getCells()[i].getMark().equals(board.getCells()[i + 1].getMark())
					&& board.getCells()[i + 1].getMark() == board.getCells()[i + 2].getMark()) {
				result = Result.WIN;
				break;
			}
			i += 3;
		}
	}

	public void getColoumnResult() {
		int i = 0;
		while (i <= 2) {
			if (!board.getCells()[i].getMark().equals(Mark.E)
					&& board.getCells()[i].getMark() == board.getCells()[i + 3].getMark()
					&& board.getCells()[i + 3].getMark() == board.getCells()[i + 6].getMark()) {
				result = Result.WIN;
				break;
			}
			i++;
		}
	}

	public void getLeftDiagonalResult() {
		int i = 0;
		if (!board.getCells()[i].getMark().equals(Mark.E)
				&& board.getCells()[0].getMark() == board.getCells()[i + 4].getMark()
				&& board.getCells()[i + 4].getMark() == board.getCells()[i + 8].getMark()) {
			result = Result.WIN;
		}
	}

	public void getRightDiagonalResult() {
		int i = 2;
		if (!board.getCells()[i].getMark().equals(Mark.E)
				&& board.getCells()[i].getMark() == board.getCells()[i + 2].getMark()
				&& board.getCells()[i + 2].getMark() == board.getCells()[i + 4].getMark()) {
			result = Result.WIN;
		}
	}

	public void getDrawResult() {
		if (board.isBoardFull() && result.equals(Result.PROGRESS)) {
			result = Result.DRAW;
		}
	}

	public Board getBoard() {
		return board;
	}

	public Result getResult() {
		return result;
	}

}
