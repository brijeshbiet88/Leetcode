package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println("---------Test Case 1 ---------");
		int [] a = {3 ,3,1,3,2,2,2,2,1,3,1,2,2,2,2};
		System.out.println("Majority Element : "+ majorityElement(a));
		
		System.out.println("---------Test Case 2 ---------");
		int [] b = {3 ,3,1,3,2,2 ,7, 8, 9, 2 , 7, 6,2,2,2};
		System.out.println("Majority Element : "+ majorityElement(b));
		
		System.out.println("---------Test Case 3 ---------");
		int [] c = {20};
		System.out.println("Majority Element : "+ majorityElement(c));
		
		System.out.println("---------Test Case 4 ---------");
		int [] d = {20 , 3 , 20 , 5 , 20 , 4 , 20 , 20 , 20 , 6};
		System.out.println("Majority Element : "+ majorityElement2(d));
		
		System.out.println("---------Test Case 5 ---------");
		int [] e = {10 , 3 , 10 , 3 , 10};
		System.out.println("Majority Element : "+ majorityElement2(e));

	}

	// Moore Voting works only when majority element is always available
	
	private static int majorityElement2(int[] nums) {
		int count = 0;
		int candidate = 0;
		for(int num : nums) {
			if(count == 0) {
				candidate = num;
			}
			if(num == candidate) {
				count++;
			}else count--;
		}
		return candidate;
	}

	public static int majorityElement(int[] nums) {
		int maxCount = 0 , maxCountNum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			if(i >= nums.length/2 && maxCount < map.get(nums[i])) {
				maxCount = map.get(nums[i]);
				maxCountNum = nums[i];
				if(maxCount > nums.length/2) {
					return maxCountNum;
				}
			}
		}
		
		return -1;
        
    }
}
