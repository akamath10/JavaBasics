package com.hash.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ashwini.kamath
 * Use HashSet to give the unique words mentioned in a sentence
 * Scenarios:
 * Sentence 1 : I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel I feel, I feel the feel you feel
 * O/P 1 : [the, a, I, feel, if, funny, you] -> in any order
 * Sentence 2 : I had a good day
 * O/P 2 : [a, I, had, good, day] -> in any order
 */
public class Hashset {
	public static void main(String args[]){
		String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel,"
				+ "if you feel the feel I feel, I feel the feel you feel";
		
		//Used HashSet because it does not contain duplicates...
		Set<String> words = new HashSet<>();
		//Regular expression \\W = words, which takes only the words from a sentence ignoring the punctuations.
		for(String word : tongueTwister.split("\\W+")){
			words.add(word);
		};
		System.out.println("The original sentence was : " + tongueTwister);
		System.out.println("The unique words in the sentence were : " + words);
	}
}
