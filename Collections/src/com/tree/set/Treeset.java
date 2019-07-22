package com.tree.set;

import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author ashwini.kamath
 * Use TreeSet to get the list of alphabets from an pangram sentence in a sorted order
 * Pangram : Sentence in which all the alphabets appear atleast once.
 * Sentence : the quick brown fox jumps over the lazy dog
 * O/P Expected : [ , a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z] -> In Sorted Order only
 */
public class Treeset {

	public static void main(String[] args) {
		String pangram = "the quick brown fox jumps over the lazy dog";
		//TreeSet stores the values in a sorted way without duplicates
		Set<Character> aToZee = new TreeSet<>();
		for(char gram : pangram.toCharArray()){
			aToZee.add(gram);
		}
		System.out.println("The pangram is : " + pangram);
		System.out.println("Sorted pangram Characters are : " + aToZee);
	}

}
