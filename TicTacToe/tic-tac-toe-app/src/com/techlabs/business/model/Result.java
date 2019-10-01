package com.techlabs.business.model;

public enum Result {

	WIN, DRAW, PROGRESS;

	@Override
	public String toString() {
		switch (this) {

		case WIN:
			return "WIN";
		case DRAW:
			return "DRAW";
		case PROGRESS:
			return "PROGRESS";

		}
		return null;
	}
}
