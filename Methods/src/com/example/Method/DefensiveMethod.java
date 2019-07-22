package com.example.Method;

import java.util.Date;

public class DefensiveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		end.setYear(2099);
		System.out.println(p.end());
	}
final static class Period{
	private final Date start;
	private final Date end;
	public Period(Date start, Date end){
		if(start.compareTo(end)>0)
			throw new IllegalArgumentException();
		this.start = start;
		this.end = end;	
		System.out.println(this.end);
	}
	public Date start(){
		return start;
	}
	public Date end(){
		return end;
	}
}
}
