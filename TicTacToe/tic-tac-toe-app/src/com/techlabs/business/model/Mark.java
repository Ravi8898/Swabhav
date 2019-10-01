package com.techlabs.business.model;

public enum Mark {

	X, O, E;

	@Override
	public String toString() {

		switch (this) {
		case X:
			return "X";

		case O:
			return "O";
		case E:
			return "E";

		default:
			return null;
		}

	}
}
