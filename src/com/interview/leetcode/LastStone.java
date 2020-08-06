package com.interview.leetcode;

import java.util.PriorityQueue;

public class LastStone {

	public static void main(String[] args) {
	
		System.out.println("---------------Test Case 1---------------");
		int [] stones1 = {3 , 5 , 5};
		System.out.println("Last weight : "+lastStoneWeight(stones1));
		System.out.println();
		
		System.out.println("---------------Test Case 1---------------");
		int [] stones2 = {2,7,4,1,8,1};
		System.out.println("Last weight : "+lastStoneWeight(stones2));
		System.out.println();
		
		System.out.println("---------------Test Case 1---------------");
		int [] stones3 = {};
		System.out.println("Last weight : "+lastStoneWeight(stones3));
		System.out.println();
		

	}
	
	public static int lastStoneWeight(int[] stones) {
		if(stones.length == 0) {
			return 0;
		}
		if(stones.length == 1) {
			return stones[0];
		}
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a , b)-> b-a);
		for(int stone : stones) {
			maxHeap.add(stone);
		}
        
		while(maxHeap.size() != 0) {
			if(maxHeap.size() == 1) {
        		return maxHeap.poll();
        	}
        	int stone1 = maxHeap.poll();
        	int stone2 = maxHeap.poll();
        	
        	if(stone1 == stone2) {
        		continue;
        	}
        	
        	maxHeap.add(Math.abs(stone2-stone1));
        	
        	
        }
		return 0;
    }

}
