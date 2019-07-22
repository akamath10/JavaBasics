package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("Test.txt"));
		
		try(BufferedReader reader2 = reader){
			System.out.println("Hello World!");
		}
	}
}
