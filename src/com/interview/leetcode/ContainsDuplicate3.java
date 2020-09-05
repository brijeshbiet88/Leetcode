package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ContainsDuplicate3 {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1-----------------");
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		int t = 0;
		boolean hasDuplicate = containsNearbyAlmostDuplicate(nums, k, t);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();

		System.out.println("---------------Test Case 2-----------------");
		int[] nums2 = { 1, 0 ,1 , 1 };
		k = 1;
		t = 2;
		hasDuplicate = containsNearbyAlmostDuplicate(nums2, k, t);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();

		System.out.println("---------------Test Case 3-----------------");
		int[] nums3 = { 1, 5, 9, 1 ,5 , 9};
		k = 2;
		t = 3;
		hasDuplicate = containsNearbyAlmostDuplicate(nums3, k, t);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();
		
		System.out.println("---------------Test Case 4-----------------");
		int[] nums4 = {-2147483648,-2147483647};
		k = 3;
		t = 3;
		hasDuplicate = containsNearbyAlmostDuplicate(nums4, k, t);
		System.out.println("Has duplicate : " + hasDuplicate);
		System.out.println();
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length == 0 || k == 0) {
			return false;
		}

		TreeSet<Long> set = new TreeSet<Long>();
		for(int i = 0 ; i < nums.length ; i++) {
			Long floor = set.floor(new Long(1L * nums[i] + t ));
			Long ceil = set.ceiling(new Long(1L * nums[i] - t ));
			
			if(floor != null && floor >= 1L * nums[i] || ceil != null  && ceil <= 1L * nums[i]) {
				return true;
			}
			
			set.add(new Long(nums[i]));
			if(i >= k) {
				set.remove(new Long(nums[i-k]));
			}
		}
		return false;
	}

}

/*
 ---------------Test Case 1-----------------
Has duplicate : true

---------------Test Case 2-----------------
Has duplicate : true

---------------Test Case 3-----------------
Has duplicate : false

---------------Test Case 4-----------------
Has duplicate : true



 * */
