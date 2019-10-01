package com.techlabs.business.model;

public class Cell {

	private Mark mark;

	public Cell() {

		mark = Mark.E;
	}

	public boolean isEmpty() {

		if (mark.equals(Mark.E))
			return true;
		else
			return false;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public boolean checkDuplicateLocation() {
		
		if(!isEmpty()) {
			throw new CellIsAlreadyMarkedException("This cell is already marked...please choose another cell");
		}
		return false;
	}

}
