package com.interview.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1----------------");
		int [] nums = {1, 1, 1, 2 , 2 ,3};
		int k = 2;
		int [] topk = topKFrequent(nums, k);
		System.out.println("Top K="+k+" Frequent Elements : ");
		for(int n : topk) System.out.print(n+" ");
		System.out.println();
		
		System.out.println("---------------Test Case 2----------------");
		int [] nums2 = {1, 7 , 7 , 7 ,3 , 5, 2 , 2 ,3};
		k = 3;
		int [] topk2 = topKFrequent(nums2, k);
		System.out.println("Top K="+k+" Frequent Elements : ");
		for(int n : topk2) System.out.print(n+" ");
		System.out.println();
		
		System.out.println("---------------Test Case 3----------------");
		int [] nums3 = {1, 1, 1, 2 , 2 ,2};
		k = 2;
		int [] topk3 = topKFrequent(nums3, k);
		System.out.println("Top K="+k+" Frequent Elements : ");
		for(int n : topk3) System.out.print(n+" ");
		System.out.println();
		
		System.out.println("---------------Test Case 4----------------");
		int [] nums4 = {10 , 20};
		k = 2;
		int [] topk4 = topKFrequent(nums4, k);
		System.out.println("Top K="+k+" Frequent Elements : ");
		for(int n : topk4) System.out.print(n+" ");
		System.out.println();
		
		
	}

	public static  int[] topKFrequent(int[] nums, int k) {
		int [] topK = new int[k];
		Map<Integer , Integer> map = new HashMap<>();
		for(int num : nums)
			map.put(num, map.getOrDefault(num, 0)+1);
		
		List<Integer>[] bucket = new ArrayList[nums.length+1];
		for(int key : map.keySet()) {
			int frequency = map.get(key);
			if(bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<Integer>();
				bucket[frequency].add(key);
			}else {
				bucket[frequency].add(key);
			}
		}
		
		
		int index = 0;
		for(int i = bucket.length -1 ; i >= 0 ; i--) { // Bucket with Most Frequency will come First
			if(bucket[i] != null) {
				for(int num : bucket[i]) {
					topK[index++] = num;
					if(index == k)
						return topK;
				}
			}
		}
		
		return topK;
        
    }
}
