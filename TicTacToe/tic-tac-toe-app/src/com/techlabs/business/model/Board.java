package com.techlabs.business.model;

public class Board {

	private Cell[] cells = new Cell[9];

	public Board() {

		for(int i=0; i<cells.length; i++) {
			cells[i]=new Cell();
		}
	}

	public boolean isBoardFull() {

		for (Cell cell : cells)
			if (cell.getMark().equals(MarkType.E))
				return false;
			else
				continue;

		return true;
	}

	public void setMarkAtLocation(int location, int player) {

		if (player == 0)
			cells[location].setMark(MarkType.O);
		if (player == 1)
			cells[location].setMark(MarkType.X);
	}

	public Cell[] getCells() {
		return cells;
	}

}
