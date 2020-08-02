package com.interview.leetcode;

public class PrefixSum {

	public static void main(String[] args) {
		System.out.println("--------Test Case 1----------");
		int [] a = {1 , 3 , 0 , -2 , 5};
		prefixSum(a);
		System.out.println("Array After Prefix Sum");
		for(int num : a)
			System.out.print(num+" ");
		
		System.out.println();
		
		System.out.println("--------Test Case 2----------");
		int [] b = {10 , 20 , 30 , 40 , 50};
		prefixSum(b);
		System.out.println("Array After Prefix Sum");
		for(int num : b)
			System.out.print(num+" ");

	}

	private static void prefixSum(int[] a) {
		for(int i = 1; i < a.length ; i++) {
			a[i] += a[i-1];
		}
	}
}
/*
--------Test Case 1----------
Array After Prefix Sum
1 4 4 2 7 
--------Test Case 2----------
Array After Prefix Sum
10 30 60 100 150 
 */
