package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletSumto0 {

	public static void main(String[] args) {
		int a [] = {-1 , 0 , 1 , 2 , -2 , 3, -1 ,-5  };
		List<List<Integer>> triplets = threeSum(a);
		System.out.println("Triplets Having Sum Equal to O :");
		
		triplets.forEach(list->{
			list.forEach(num -> System.out.print(" "+num));
			System.out.println();
		});
		
		

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> triplets = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length - 2  ; i++) {
			for (int j = i +1 , k = nums.length-1; j < k ;) {
				if(nums[i]+nums[j]+nums[k] == 0) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					triplets.add(list);
				
					k--;
					j++;
				}
				else if(nums[i]+nums[j]+nums[k] > 0) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		
		return new ArrayList<List<Integer>>(triplets);
        
    }
}
