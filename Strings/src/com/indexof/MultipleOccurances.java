package com.indexof;
/**
 * 
 * @author ashwini.kamath
 * Used the indexOf() method of String to check multiple occurrences of a substring within the main string.
 */
public class MultipleOccurances {
	public static void main(String args[]){
		String str ="I am a student. I am preparing for my exams.";
		int fromIndex = 0;
		//Checks the occurrence of the substring Starting from the index mentioned as parameter(fromIndex)
		while(str.indexOf("am", fromIndex)>-1){
			fromIndex = str.indexOf("am", fromIndex);
			System.out.println("Substring \"am\" occurs at the index of " + fromIndex);
			fromIndex++;
		}
	}
}
