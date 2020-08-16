package com.interview.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LuckyInteger {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1--------------");
		int [] arr = {2,2,3,4};
		System.out.println("Array Elements :");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		int luckyInteger = findLucky(arr);
		System.out.println("Lucky Integer : "+luckyInteger);
		System.out.println();
		
		System.out.println("---------------Test Case 2--------------");
		int [] arr2 = {1,2,3,3,2,3};
		System.out.println("Array Elements :");
		for(int n : arr2) {
			System.out.print(n+" ");
		}
		System.out.println();
		luckyInteger = findLucky(arr2);
		System.out.println("Lucky Integer : "+luckyInteger);
		System.out.println();
		
		System.out.println("---------------Test Case 3--------------");
		int [] arr3 = {2,2,3,2,3};
		System.out.println("Array Elements :");
		for(int n : arr3) {
			System.out.print(n+" ");
		}
		System.out.println();
		luckyInteger = findLucky(arr3);
		System.out.println("Lucky Integer : "+luckyInteger);
		System.out.println();
	}

	public static int findLucky(int[] arr) {
		int luckyInt = -1;
		Map<Integer, Integer> map = new HashMap<>();
		for(int key : arr) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			if(map.get(key) == key) {
				luckyInt = Math.max(luckyInt, key);
			}
			
		}
		return luckyInt;
    }
}

/*
 ---------------Test Case 1--------------
Array Elements :
2 2 3 4 
Lucky Integer : 2

---------------Test Case 2--------------
Array Elements :
1 2 3 3 2 3 
Lucky Integer : 3

---------------Test Case 3--------------
Array Elements :
2 2 3 2 3 
Lucky Integer : -1
 * */
