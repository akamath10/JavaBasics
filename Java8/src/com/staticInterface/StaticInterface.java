package com.staticInterface;

public interface StaticInterface {
	default void print(String str){
		if(isNull(str)){
			System.out.printf("String value : %s ", str);
		}
	}

	static boolean isNull(String str){
		System.out.println("Inside the Interface method");
		return str==null?true:"".equals(str)?true:false;
	}
}
