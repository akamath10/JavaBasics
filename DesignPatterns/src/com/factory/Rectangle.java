package com.factory;

public class Rectangle implements Shape {

	private int length;
	private int breadth;

	@Override
	public void draw() {
		System.out.println("Drawing rectangle with length " + length + " and breadth " + breadth + "!");
	}

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

}
