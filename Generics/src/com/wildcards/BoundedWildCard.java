package com.wildcards;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCard {

	public static void main(String args[]){
		List<Number> list = new ArrayList<Number>();
		list.add(new Integer(10));
		list.add(new Double(10.0));
		list.add(new Byte ((byte)10)); //Byte takes byte as the input value and not int.
		list.add(new Float(10.0f));
		System.out.println(addition(list));
	}
	// Any element that is a subtype of Number should be considered as a valid entry...
	static Double addition(List<? extends Number> list){
		Double total = new Double(0);
		for(Number element : list){
			total = total + element.doubleValue();
		}
		return total;
	}

	
}
