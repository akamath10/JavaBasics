package com.staticInterface;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryValidator {

	public static void main(String[] args) {
		String stringTestCases = args[0];
		int testCase = Integer.parseInt(stringTestCases);
		//Scanner sc = new Scanner(System.in);
		//sc.nex
		for (int i = 1; i <= testCase; i++) {
			BigInteger b = new BigInteger(args[i]);
			String byteValue = b.toString(2);
			System.out.println(substringGenerator(byteValue));

		}

	}

	private static String substringGenerator(String byteStringValue) {
		// byte[] byteValue = byteStringValue.getBytes();

		int size = byteStringValue.length();
		int zeroCounter = 0;
		int oneCounter = 0;
		int zeroCount = 0, oneCount = 0;
		char zero = '0';
		for (int i = 0; i < size; i++) {
//			System.out.println("Value of i " + i);
			for (int j = i; j < size; j++) {
				zeroCount = 0;
				oneCount = 0;
				//System.out.println("Value of i " + i +"Value of j " + j);
				
				for (int k = i; k <= j; k++) {
					//System.out.println("Value of byteValue  : " + byteStringValue.charAt(k) + "value of k " + k);
					if (byteStringValue.charAt(k) == zero) {
						zeroCount++;
						//System.out.println("ZeroCount : " + zeroCount);
					} else {
						oneCount++;
						//System.out.println("oneCount " + oneCount);
					}
				}
				if (zeroCount % 2 != 0) {
					zeroCounter++;
//					System.out.println("Value of zeros : " + zeroCounter);
				}
				if (oneCount % 2 != 0) {
					oneCounter++;
//					System.out.println("Value of Ones : " + oneCounter);
				}
			}
			
		}
		return zeroCounter+" "+oneCounter;
	}

}
