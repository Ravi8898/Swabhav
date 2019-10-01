package com.techlabs.business.model;

public class Board {

	private Cell[] cells = new Cell[9];

	public Board() {

		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}

	public boolean isBoardFull() {

		for (Cell cell : cells)
			if (cell.isEmpty())
				return false;
			else
				continue;
		return true;
	}

	public void setMarkAtLocation(int location, Player player) {

		
		try {
			cells[location].setMark(player.getMark());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Enter position between 0-8");

		}
	}

	public Cell[] getCells() {
		return cells;
	}

}
