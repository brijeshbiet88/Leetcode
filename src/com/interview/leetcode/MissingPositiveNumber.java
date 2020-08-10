package com.interview.leetcode;

public class MissingPositiveNumber {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1--------------");
		int [] nums = {-3 , -5 , -4 , 1 , 7, 5};
		int firstPosMissing = firstMissingPositive(nums);
		System.out.println("First Positive Missing "+firstPosMissing);
		System.out.println();
		
		System.out.println("--------------Test Case 2--------------");
		int [] nums2 = {-3 , -5 , -4 , 1 , 2, 3 , 4 , 8 , 5};
		firstPosMissing = firstMissingPositive(nums2);
		System.out.println("First Positive Missing "+firstPosMissing);
		System.out.println();
		
		System.out.println("--------------Test Case 3--------------");
		int [] nums3 = {-1 , -2 , -4 , 0 , 1 , 2 , 4 , 8 , 5};
		firstPosMissing = firstMissingPositive(nums3);
		System.out.println("First Positive Missing "+firstPosMissing);
		System.out.println();
		
		System.out.println("--------------Test Case 4--------------");
		int [] nums4 = {-1 , -2 , -4 , 0 };
		firstPosMissing = firstMissingPositive(nums4);
		System.out.println("First Positive Missing "+firstPosMissing);
		System.out.println();
		
		System.out.println("--------------Test Case 5--------------");
		int [] nums5 = {7 , 8 , 9 , 10 ,12};
		firstPosMissing = firstMissingPositive(nums5);
		System.out.println("First Positive Missing "+firstPosMissing);
		System.out.println();

	}
	
	public static int firstMissingPositive(int[] nums) {
		int posIndex = 0;
		int size = nums.length;
		
		while(posIndex < size) {
			if(nums[posIndex] > 0){
				break;
			}
			posIndex++;
		}
        
		if(posIndex == size)
			return 1;
		
		for(int i = posIndex ; i < size ; i++) {
			if((Math.abs(nums[i])+posIndex-1)  < size) {
				nums[nums[i]+posIndex-1] = 0 - nums[nums[i]+posIndex-1];
			}
		}
		
		for(int i = posIndex ; i < size ; i++) {
			if(nums[i] > 0) {
				return (i-posIndex+1);
			}
		}
		return size-posIndex+1;
    }

}

/*
--------------Test Case 1--------------
First Positive Missing 2

--------------Test Case 2--------------
First Positive Missing 6

--------------Test Case 3--------------
First Positive Missing 3

--------------Test Case 4--------------
First Positive Missing 1

--------------Test Case 5--------------
First Positive Missing 1


 * */
