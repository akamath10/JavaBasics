package com.need.fr.generics;

import java.util.Vector;

public class UnsafeTypeCasting {
	public static void main(String args[]){
		Vector floatValues = new Vector();
		floatValues.add(10.0);
		floatValues.add(10.0f);
		for(int i=0; i<floatValues.size();i++){
			System.out.println(floatValues.get(i));
			//System.out.println((Float)floatValues.get(i));
			//-> Gives error as Vector has converted 1st obj to double and 2nd obj to float.
			//-> Double cannot be casted to float... Unsafe casting due to Object
			
			
			// Exception in thread "main" java.lang.ClassCastException:
			// java.lang.Double cannot be cast to java.lang.Float
			// at
			// com.need.fr.generics.UnsafeTypeCasting.main(UnsafeTypeCasting.java:11)

		}
	}
}
