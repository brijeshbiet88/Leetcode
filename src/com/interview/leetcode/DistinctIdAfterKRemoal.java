package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctIdAfterKRemoal {

	public static void main(String[] args) {
		int arr[] = {12, 13, 11, 12, 13, 13}; 
        int m = 2; 
  
        System.out.println(distinctIds(arr,  m)); 

	}

	private static int distinctIds(int[] arr,int k) {
		int length = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
				map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
		}
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			list.add(map.get(itr.next()));
		}
		
		Collections.sort(list , (a, b)-> b-a);
		int listSize = list.size()-1;
		while(k != 0) {
				list.set(listSize, list.get(listSize)-1);
				if(list.get(listSize) == 0) {
					list.remove(listSize);
					listSize--;
				}
				k--;
				
		}
		
		return listSize+1;
	}

}
