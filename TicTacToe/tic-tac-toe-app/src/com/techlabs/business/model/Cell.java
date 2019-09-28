package com.techlabs.business.model;

public class Cell {

	private MarkType mark;

	public Cell() {

		mark = MarkType.E;
	}

	public boolean isEmpty() {

		if (mark.equals(MarkType.E))
			return true;
		else
			return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		this.mark = mark;
	}

//	public void checkDuplicateLocation(Cell cell) {
//		
//		try {
//		if(cell.isEmpty()==false) {
//			throw new cellIsAlreadyMarkedException("This cell is already marked...please choose another cell");
//		}
//		}catch(cellIsAlreadyMarkedException e) {
//			
//			System.out.println("This cell is already marked...please choose another cell");
//		}
//		
//	}

}
