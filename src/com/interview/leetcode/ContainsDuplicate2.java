package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1-----------------");
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		boolean hasDuplicate = containsNearbyDuplicate(nums, k);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();
		
		System.out.println("---------------Test Case 2-----------------");
		int[] nums2 = { 1, 2, 3, 1 ,2 , 3};
		k = 2;
		hasDuplicate = containsNearbyDuplicate(nums2, k);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();
		
		System.out.println("---------------Test Case 3-----------------");
		int[] nums3 = { 1,0,1,1};
		k = 1;
		hasDuplicate = containsNearbyDuplicate(nums3, k);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k)
				return true;
			map.put(nums[i], i);
		}
		return false;
	}
}
/*
 * 
 * ---------------Test Case 1-----------------
Has duplicate : true

---------------Test Case 2-----------------
Has duplicate : false

---------------Test Case 3-----------------
Has duplicate : true


 * */