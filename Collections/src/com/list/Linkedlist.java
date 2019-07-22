package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ashwini.kamath
 * Use of Linked List to check if the input given is a palindrome
 * Scenarios: 
 *  abcba = true
 *  abcab = false
 */
public class Linkedlist {
	public static void main(String args[]){
		String input = "abcba";
		
		//Character instead of char -> because Collections take Objects and not primitives.
		//Stored in List instead of LinkedList in order to give flexibility of choosing/updating the collection in future
		List<Character> palindrome = new LinkedList<>();
		
		for(char c : input.toCharArray()){
			//Auto boxing comes into picture -> char converted to Character
			palindrome.add(c);
		}
		
		ListIterator<Character> charIterator = palindrome.listIterator();
		//Points head at the last element
		ListIterator<Character> revCharIterator = palindrome.listIterator(palindrome.size());

		boolean result = true;
		
		while(charIterator.hasNext() && revCharIterator.hasPrevious()){
			if(charIterator.next() != revCharIterator.previous()){
				result = false;
				break;
			}
		}
		if(result){
			System.out.println("The given string is a palindrome");
		}
		else{
			System.out.println("The given string is not a palindrome");
		}
	}
}
