package com.staticInterface;

public class Binary {
    public static void main(String[] args) {

     String stringTestCases = args[0];
     int testCase = Integer.parseInt(stringTestCases);
     for (int i = 1; i <= testCase; i++) {
         String byteValue = Long.toBinaryString(Long.parseLong(args[i]));
         System.out.println(substringGenerator(byteValue));
        }
    }

    private static String substringGenerator(String byteStringValue) {
        int size = byteStringValue.length();
     int zeroCounter = 0, oneCounter = 0;
     char zero = '0';
     for (int i = 0; i < size; i++) {
         for (int j = i; j < size; j++) {
             int zeroCount = 0, oneCount = 0;
             for (int k = i; k <= j; k++) {
                 if (byteStringValue.charAt(k) == zero)
                     zeroCount++;
                 else
                     oneCount++;
            }
         if (zeroCount % 2 != 0)
             zeroCounter++;
         if (oneCount % 2 != 0)
             oneCounter++;
        }
     }
    return zeroCounter + " " + oneCounter;
    }
}

