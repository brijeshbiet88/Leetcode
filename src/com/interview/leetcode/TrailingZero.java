package com.interview.leetcode;

public class TrailingZero {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1 ---------------");
		int n = 100;
		int trailingZeroes = trailingZeroes(n);
		System.out.println("Trailing Zeroes in fact of "+n+" : "+trailingZeroes);
		System.out.println("--------------Test Case 2 ---------------");
		n = 100000;
		trailingZeroes = trailingZeroes(n);
		System.out.println("Trailing Zeroes in fact of "+n+" : "+trailingZeroes);
		System.out.println("--------------Test Case 3 ---------------");
		n = 1000000;
		trailingZeroes = trailingZeroes(n);
		System.out.println("Trailing Zeroes in fact of "+n+" : "+trailingZeroes);

	}
	
	public static int trailingZeroes(int n) {
        int result = 0;
        int power = 1;
        int tempResult = 1;
        while(tempResult != 0) {
        	tempResult = (int) (n/(Math.pow(5, power++)));
        	result += tempResult;
        } 
       
        return result;
    }

}
/*
--------------Test Case 1 ---------------
Trailing Zeroes in fact of 100 : 24
--------------Test Case 2 ---------------
Trailing Zeroes in fact of 100000 : 24999
--------------Test Case 3 ---------------
Trailing Zeroes in fact of 1000000 : 249998

 */
 