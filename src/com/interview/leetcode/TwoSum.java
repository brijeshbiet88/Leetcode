package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int [] a = {2 , 7, 11 ,6 , 4 , 15};
		int target = 10;
		int [] indices = twoSum(a , target); 
		System.out.println("Indices : "+indices[0]+" and "+indices[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int [] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for(int i = 1 ; i < nums.length ; i++){
            if(map.containsKey(target-nums[i])) {
            	indices[0] = map.get(target-nums[i]);
            	indices[1] = i;
            	return indices;
            }
            else {
            	map.put(nums[i], i);
            }
        }
		return indices;
    }

}
