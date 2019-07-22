package com.factory;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw method of Circle invoked with radius " + radius + "!");
	}

}
