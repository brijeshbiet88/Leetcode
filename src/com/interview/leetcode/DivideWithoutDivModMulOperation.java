package com.interview.leetcode;

public class DivideWithoutDivModMulOperation {

	public static void main(String[] args) {
		System.out.println("-------Test Case 1-------");
		int a = 8 , b = 3;
		System.out.println("Quotient of : "+a+"/"+b+" is : "+divide(a, b));
		
		System.out.println("------Test Case 2--------");
		a = 0 ; b = 5;
		System.out.println("Quotient of : "+a+"/"+b+" is : "+divide(a, b));
		
		System.out.println("------Test Case 3-------");
		a = 10 ; b = 5;
		System.out.println("Quotient of : "+a+"/"+b+" is : "+divide(a, b));

	}

	/* only for positive numbers */
	public static int divide(int dividend, int divisor) {
		int quotient = 0;
		int addition = 0;
			addition = divisor;
			while(addition <= (dividend)) {
				quotient++;
				addition += divisor;
			}
		return quotient;
        
    }
}
/*
-------Test Case 1-------
Quotient of : 8/3 is : 2
------Test Case 2--------
Quotient of : 0/5 is : 0
------Test Case 3-------
Quotient of : 10/5 is : 2
 
 * */
