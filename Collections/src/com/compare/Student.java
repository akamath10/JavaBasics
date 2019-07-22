package com.compare;
/**
 * 
 * @author ashwini.kamath
 * The Student class is the entity which needs to be sorted according to parameters mentioned by the user
 * The fields owned by Student class are : Id, Name, CGPA
 */
public class Student implements Comparable<Student> {
	String id;
	String name;
	Double cgpa;
	public Student(String id, String name, Double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public String toString(){
		return " \n " + id + " " + name + " " + cgpa; 
	}
	
	public int compareTo(Student that){
		return this.id.compareTo(that.id);
		
	}
}
