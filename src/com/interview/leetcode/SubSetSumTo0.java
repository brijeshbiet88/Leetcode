package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubSetSumTo0 {

	public static void main(String[] args) {
		System.out.println("----------Test Case 1-----------");
		int [] a = {4, 2, -3, 1, 6 , 5 ,7 , 2};
		boolean hasSubset = ifSubsetSumExists(a);
		System.out.println("Does Subset Exists ? "+hasSubset);
		
		System.out.println("----------Test Case 2-----------");
		int [] b = {4, 2, 7, 0, 6 , 5 ,7 , 2};
		hasSubset = ifSubsetSumExists(b);
		System.out.println("Does Subset Exists ? "+hasSubset);
		
		System.out.println("----------Test Case 3-----------");
		int [] c = {4, 2, 7, 3, 6 , 5 ,7 , 2};
		hasSubset = ifSubsetSumExists(c);
		System.out.println("Does Subset Exists ? "+hasSubset);

	}

	private static boolean ifSubsetSumExists(int[] a) {
		Set<Integer> hashSet = new HashSet<>();
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			sum = sum + a[i];
			
			if(a[i] == 0 || sum == 0 || hashSet.contains(sum)) {
				return true;
			}
			
			hashSet.add(sum);
		}
		
		return false;
	}

}
/*
 ----------Test Case 1-----------
Does Subset Exists ? true
----------Test Case 2-----------
Does Subset Exists ? true
----------Test Case 3-----------
Does Subset Exists ? false
 */
