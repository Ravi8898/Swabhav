package com.techlabs.business.model;

public class CellIsAlreadyMarkedException extends RuntimeException {

	public CellIsAlreadyMarkedException(String message) {
		super(message);
	}
}
