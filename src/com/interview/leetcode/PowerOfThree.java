package com.interview.leetcode;

public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println("---------------Test Case1----------------------");
		int num = 81;
		System.out.println("Is Number "+num+" power of 3 : "+isPowerOfThree(num));
		System.out.println();
		
		System.out.println("---------------Test Case2----------------------");
		num = 1;
		System.out.println("Is Number "+num+" power of 3 : "+isPowerOfThree(num));
		System.out.println();
		
		System.out.println("---------------Test Case3----------------------");
		num = 11;
		System.out.println("Is Number "+num+" power of 3 : "+isPowerOfThree(num));
		System.out.println();
		
		System.out.println("---------------Test Case4----------------------");
		num = 12;
		System.out.println("Is Number "+num+" power of 3 : "+isPowerOfThree(num));
		System.out.println();
		
		System.out.println("---------------Test Case5----------------------");
		num = 27;
		System.out.println("Is Number "+num+" power of 3 : "+isPowerOfThree(num));
		System.out.println();

	}
	
	public static boolean isPowerOfThree(int n) {
		String strNum = Integer.toString(n, 3);
		return strNum.matches("^10*$");
    }
	
}
/*
---------------Test Case1----------------------
Is Number 81 power of 3 : true

---------------Test Case2----------------------
Is Number 1 power of 3 : true

---------------Test Case3----------------------
Is Number 11 power of 3 : false

---------------Test Case4----------------------
Is Number 12 power of 3 : false

---------------Test Case5----------------------
Is Number 27 power of 3 : true


 * 
 * */