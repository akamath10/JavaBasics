package com.factory;

public class ShapeFactory {
	public static Shape getShape(ShapeType shape) {
		Shape shapeObj = null;
		//Prefer enums over constants or string values. As they are fixed and cannot change...
		switch (shape) {
		case CIRCLE:
			shapeObj = new Circle(10);
			break;
		case RECTANGLE:
			shapeObj = new Rectangle(20, 10);
			break;
		}
		return shapeObj;
	}
}
