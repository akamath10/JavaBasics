package com.example.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OverLoading {
	public static void main(String args[]){
		String str = "HELLO";
		String str1 = null;
		char c = 'H';
		str = String.valueOf(str);
		System.out.println(str);
		
		str1 = String.valueOf(c);
		System.out.println(str1);
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i=-3; i<3; i++){
			list.add(i);
			set.add(i);
		}
		
		for(int i=0;i<3;i++){
			list.remove(i); // remove(E) where E = Integer -> Does autoboxing and removes the correct element
			set.remove(i);  // remove(int) where int = index of element -> removes the element at i th position
			// use set.remove((Integer) i) or set.remove(Integer.valueOf(i);
		}
		System.out.println(set + "" + "" +list);
	}
}
