package com.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	public static void main(String args[]){
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		printList(integerList);
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		stringList.add("World");
		printList(stringList);
	}
	
	//Wild card excepts all types of values...
	static void printList(List<?> list){
		for(Object listElement : list){
			System.out.println(listElement.toString());
		}
	}
}
