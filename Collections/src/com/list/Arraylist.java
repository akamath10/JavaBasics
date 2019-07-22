package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	public static void main(String args[]){
		List<String> arrayList = new ArrayList<>();
		arrayList.add("H");
		arrayList.add("L");
		arrayList.add("L");
		arrayList.add("O");
		arrayList.add(1,"E");
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i));
		}
		List<String> list = Collections.unmodifiableList(arrayList);
		//list.remove("O"); -> Gives error -> UnsupportedOperationException!!
		//list.add("O"); -> Gives error -> UnsupportedOperationException!!
		list.forEach(entry->System.out.println(entry));
		List<List<String>> list2= new LinkedList<>(
				Arrays.asList(list,arrayList));
		List<List<String>> listOfList = Collections.unmodifiableList(list2);
		//listOfList.get(0).add(0, "O"); -> Gives error -> UnsupportedOperationException!!
	}
}
