package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;


public class DoubleTargetInArray {

	public static void main(String[] args) {
		System.out.println("-------Test Case 1 --------------");
		int [] a = {10 , 2 , 5 , 3};
		System.out.println("Is there m and n such that m = 2*n : "+isDouble(a));
		System.out.println();
		
		System.out.println("-------Test Case 2 --------------");
		int [] b = {};
		System.out.println("Is there m and n such that m = 2*n : "+isDouble(b));
		System.out.println();
		
		System.out.println("-------Test Case 3 --------------");
		int [] c = {1 , 3};
		System.out.println("Is there m and n such that m = 2*n : "+isDouble(c));
		System.out.println();

	}

	private static boolean isDouble(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < a.length ; i++) {
			if(set.contains(2*a[i])) {
				return true;
			}
			else {
				set.add(a[i]);
			}
		}
		
		return false;
	}

}
/**
 * -------Test Case 1 --------------
Is there m and n such that m = 2*n : true

-------Test Case 2 --------------
Is there m and n such that m = 2*n : false

-------Test Case 3 --------------
Is there m and n such that m = 2*n : false


 * /
