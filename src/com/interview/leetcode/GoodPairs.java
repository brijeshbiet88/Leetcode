package com.interview.leetcode;

public class GoodPairs {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1----------");
		int nums [] = {1,2,3,1,1,3};
		System.out.println("Number Of Good Pairs : "+numIdenticalPairs(nums));
		System.out.println();
		
		System.out.println("--------------Test Case 2----------");
		int nums2 [] = {1,1,1,1,1,1};
		System.out.println("Number Of Good Pairs : "+numIdenticalPairs(nums2));
		System.out.println();
		
		System.out.println("--------------Test Case 3----------");
		int nums3 [] = {1,2,3,7,4,5};
		System.out.println("Number Of Good Pairs : "+numIdenticalPairs(nums3));
		System.out.println();

	}

	public static int numIdenticalPairs(int[] nums) {
		int pairCount = 0;
		int [] frequency = new int[101]; // as i <= 100
		
		for(int num : nums) {
			pairCount = pairCount + frequency[num]++;
		}
        return pairCount;
    }
}
/*
 *
 --------------Test Case 1----------
Number Of Good Pairs : 4

--------------Test Case 2----------
Number Of Good Pairs : 15

--------------Test Case 3----------
Number Of Good Pairs : 0


 * */
