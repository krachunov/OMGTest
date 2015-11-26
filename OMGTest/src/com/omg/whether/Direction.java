package com.omg.whether;

public enum Direction {
	EAST, WEST, NORTH, SOUTH;

	public static Direction getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}
}
