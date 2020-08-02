package com.interview.leetcode;

public class PrefixSum {

	public static void main(String[] args) {
		int [] a = {1 , 3 , 0 , -2 , 5};
		prefixSum(a);
		System.out.println("Array After Prefix Sum");
		for(int num : a)
			System.out.print(num+" ");

	}

	private static void prefixSum(int[] a) {
		for(int i = 1; i < a.length ; i++) {
			a[i] += a[i-1];
		}
	}
}
