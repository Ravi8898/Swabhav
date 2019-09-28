package com.techlabs.business.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.MarkType;

class BoardTest {

	Board board = new Board();

	@Test
	void testIsBoardFull() {
		
		boolean mark = board.isBoardFull();
		assertEquals(mark, MarkType.E);

	}

}
