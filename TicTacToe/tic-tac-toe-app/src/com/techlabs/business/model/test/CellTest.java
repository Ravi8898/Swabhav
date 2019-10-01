package com.techlabs.business.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.business.model.Cell;
import com.techlabs.business.model.Mark;

class CellTest {

	Cell[] cell = new Cell[3];

	@Test
	void testIsEmpty() {

		cell[0] = new Cell();
		cell[0].setMark(Mark.E);
		cell[1] = new Cell();
		cell[1].setMark(Mark.O);
		cell[2] = new Cell();
		cell[2].setMark(Mark.X);
		assertEquals(true, cell[0].isEmpty());
		assertEquals(false, cell[1].isEmpty());
		assertEquals(false, cell[2].isEmpty());
	}

	@Test
	void testCheckDuplicateLocation() {
		
		
		
	}
}
