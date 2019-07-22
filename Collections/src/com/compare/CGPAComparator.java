package com.compare;

import java.util.Comparator;

public class CGPAComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.cgpa.compareTo(s2.cgpa);
	}
	

}
