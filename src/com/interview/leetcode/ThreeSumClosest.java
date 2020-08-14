package com.interview.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1-----------------");
		int [] nums = {-1 ,2 , 1 , -4};
		int target = 1;
		int closestSum = threeSumClosest(nums, target); 
		System.out.println("Closest Sum to target "+target+" is : "+closestSum);
		System.out.println();
		
		System.out.println("------------------Test Case 2-----------------");
		int [] nums2 = {-1,3,1,-4 ,1 , 7 , 4 , -4};
		target = -5;
		closestSum = threeSumClosest(nums2, target); 
		System.out.println("Closest Sum to target "+target+" is : "+closestSum);
		System.out.println();
		
		System.out.println("------------------Test Case 3-----------------");
		int [] nums3 = {0 , 2 ,1, -3};
		target = 1;
		closestSum = threeSumClosest(nums3, target); 
		System.out.println("Closest Sum to target "+target+" is : "+closestSum);
		System.out.println();
		
		System.out.println("------------------Test Case 4-----------------");
		int [] nums4 = {-3 , -2 ,-5, 3 , -4};
		target = -1;
		closestSum = threeSumClosest(nums4, target); 
		System.out.println("Closest Sum to target "+target+" is : "+closestSum);
		System.out.println();
		
		
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1, k = nums.length - 1; j < k;) {
				int tripletSum = nums[i] + nums[j] + nums[k];
				if (tripletSum == target) {
					return tripletSum;
				}
				if (target > 0 && Math.abs(min) > Math.abs(target - tripletSum)) {
					min = target - tripletSum;
					sum = tripletSum;
				}
				
				else if (target <= 0 && Math.abs(min) > Math.abs(tripletSum - target)) {
					min = tripletSum - target;
					sum = tripletSum;
				}

				if (tripletSum < target)
					j++;
				else
					k--;
			}
		}

		return sum;
	}

}
/*
 ------------------Test Case 1-----------------
Closest Sum to target 1 is : 2

------------------Test Case 2-----------------
Closest Sum to target -5 is : -5

------------------Test Case 3-----------------
Closest Sum to target 1 is : 0

------------------Test Case 4-----------------
Closest Sum to target -1 is : -2


 */
