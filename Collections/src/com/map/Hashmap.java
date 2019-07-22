package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		//map.put(1,null);
		String now = map.putIfAbsent(1, "First");
		System.out.println(now);
		String value = map.get(1);
		System.out.println(value);
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getValue());
		}
		
	}

}
