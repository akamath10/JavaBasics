package com.factory;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Shape> shapeObjList = new ArrayList<>();
		//Code need not know how the object is created and invoked... 
		shapeObjList.add(ShapeFactory.getShape(ShapeType.CIRCLE));
		shapeObjList.add(ShapeFactory.getShape(ShapeType.RECTANGLE));
		
		for(Shape shapeObj :shapeObjList){
			shapeObj.draw();
		}
	}

}
