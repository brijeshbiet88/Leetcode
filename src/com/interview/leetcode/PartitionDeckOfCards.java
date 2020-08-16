package com.interview.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PartitionDeckOfCards {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1---------------");
		int [] deck = {1,1,2,2,2,2};
		boolean partitionPossible = hasGroupsSizeX(deck);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();
		
		System.out.println("--------------Test Case 2---------------");
		int [] deck2 = {1,1,1,2,2,2,3,3};
		partitionPossible = hasGroupsSizeX(deck2);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
		int [] deck3 = {1};
		partitionPossible = hasGroupsSizeX(deck3);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();
		
		System.out.println("--------------Test Case 4---------------");
		int [] deck4 = {1,1,1,1,2,2,2,2,2,2};
		partitionPossible = hasGroupsSizeX(deck4);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();
		
		System.out.println("--------------Test Case 5---------------");
		int [] deck5 = {1,1,2,2,2,2 , 3 , 3};
		partitionPossible = hasGroupsSizeX(deck5);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();
		
		System.out.println("--------------Test Case 6---------------");
		int [] deck6 = {0,0,0,1,1,1,2,2,2};
		partitionPossible = hasGroupsSizeX(deck6);
		System.out.println("Is Partition x Possible where x >= 2 : "+partitionPossible);
		System.out.println();

	}
	
	public static boolean hasGroupsSizeX(int[] deck) {
		if(deck.length < 2) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		int x = 2;
		boolean partitionPossible = true;
		int minFrequency = 0;
		for (int num : deck) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			if (minFrequency != 0)
				minFrequency = Math.min(minFrequency, map.get(key));
			else
				minFrequency = map.get(key);
		}
		
		if(minFrequency < 2)
			return false;

		while (x <= minFrequency) {
			itr = map.keySet().iterator();
			while (itr.hasNext()) {
				int key = itr.next();
				if (map.get(key) % x != 0) {
					partitionPossible = false;
				}
			}
			if(partitionPossible) return true;
			x++;
			partitionPossible = true;
		}

		return false;
	}

}
/*
--------------Test Case 1---------------
Is Partition x Possible where x >= 2 : true

--------------Test Case 2---------------
Is Partition x Possible where x >= 2 : false

--------------Test Case 3---------------
Is Partition x Possible where x >= 2 : false

--------------Test Case 4---------------
Is Partition x Possible where x >= 2 : true

--------------Test Case 5---------------
Is Partition x Possible where x >= 2 : true

--------------Test Case 6---------------
Is Partition x Possible where x >= 2 : true

 * */
