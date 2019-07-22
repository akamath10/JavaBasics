package com.compare;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {

		Student[] students ={
				new Student("cs21", "Chris", 3.1),
				new Student("cs12", "Robert", 2.7),
				new Student("cs11", "Scarlet", 3.4),
				new Student("cs22", "Robin", 2.5),
		};
		//Using Comparable interface -> gets by default selected 
		Arrays.sort(students);
		
		System.out.println("List sorted according to Id:");
		System.out.println("Student ID Name CGPA");
		System.out.println(Arrays.toString(students));
		
		//Using Comparator interface -> the class implementing the interface needs to be explicitly passed
		Arrays.sort(students, new CGPAComparator());
		
		System.out.println("List sorted according to CGPA:");
		System.out.println("Student ID Name CGPA");
		System.out.println(Arrays.toString(students));
		
		
	}

}
