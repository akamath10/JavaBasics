package com.scanner.token;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author ashwini.kamath 
 * Use Case : Scan a file get the words excluding punctuation and spaces in an alphabetical order.
 */
public class ScannerTokenTest {
	public static void main(String args[]){
		
		String fileName = "C:/Users/ashwini.kamath/Documents/TextDocument.txt";
		
		try(Scanner tokenScanner = new Scanner(new FileReader(fileName))){
			Set<String> words = new TreeSet<>();
			tokenScanner.useDelimiter("\\W");
			while(tokenScanner.hasNext()){
				String word = tokenScanner.next();
				if(!word.equals(" ")){
					words.add(word.toLowerCase());
				}
			}
			for(String word : words){
				System.out.print(word + "\t");
			}
		}catch(FileNotFoundException fnfe){
			System.err.println("Cannot read the input file - pass a valid file name");
		}
	}
}
