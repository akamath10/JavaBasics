package com.staticInterface;

public class StaticInterfaceClass extends AbstractClass implements StaticInterface{

	public static void main(String[] args) {
		StaticInterfaceClass obj = new StaticInterfaceClass();
		obj.print("");
		obj.isNull("Value");
		
		//Cannot instantiate abstract classes...
		//AbstractClass ab = new AbstractClass();
	}
	public boolean isNull(String str){
		System.out.println("Inside the Class's method");
		return str==null?true:false;
	}
	
	//Abstract class's abstract methods need to be implemented...
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}
