package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("-------------Test Case 1-----------------");
		int [] nums1 = {2 ,1 , 3 , 5 , 3 ,6 , 6 , 8};
		list1 = findDuplicates(nums1);
		System.out.print("Duplicate Numbers :  ");
		list1.forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		list1.clear();
		
		System.out.println("-------------Test Case 2-----------------");
		int [] nums2 = {10,2,5,10,9,1,1,4,3,7};
		list1 = findDuplicates(nums2);
		System.out.print("Duplicate Numbers :  ");
		list1.forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		list1.clear();
		
		System.out.println("-------------Test Case 3-----------------");
		int [] nums3 = {4,3,2,7,8,2,3,1};
		list1 = findDuplicates(nums3);
		System.out.print("Duplicate Numbers :  ");
		list1.forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		list1.clear();
		
		System.out.println("-------------Test Case 4-----------------");
		int [] nums4 = {2,2};
		list1 = findDuplicates(nums4);
		System.out.print("Duplicate Numbers :  ");
		list1.forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		
		
		
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			int num = Math.abs(nums[i]);
			if(nums[num-1] < 0) {
				list.add(Math.abs(nums[i]));
			}else {
				nums[num-1] = 0 - nums[num-1];
			}
		}
		return list;
        
    }
}
/*
-------------Test Case 1-----------------
Duplicate Numbers :  3	6	
-------------Test Case 2-----------------
Duplicate Numbers :  10	1	
-------------Test Case 3-----------------
Duplicate Numbers :  2	3	
-------------Test Case 4-----------------
Duplicate Numbers :  2	 
 */
