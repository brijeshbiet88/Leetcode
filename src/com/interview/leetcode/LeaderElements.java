package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeaderElements {

	
		public static void main(String[] args) {
			System.out.println("-------------Test Case 1-----------------");
			int [] arr = {7,1,7,5,3,6,2};
			List<Integer> leaders = findLeaderElements(arr);
			System.out.print("Leaders in the array : ");
			leaders.forEach(s->System.out.print(s+"\t"));
			leaders.clear();
			System.out.println();
			
			System.out.println("-------------Test Case 2-----------------");
			int [] arr2 = {7 , 9};
			leaders = findLeaderElements(arr2);
			System.out.print("Leaders in the array : ");
			leaders.forEach(s->System.out.print(s+"\t"));
			leaders.clear();
			System.out.println();
			
			System.out.println("-------------Test Case 3-----------------");
			int [] arr3 = { 4};
			leaders = findLeaderElements(arr3);
			System.out.print("Leaders in the array : ");
			leaders.forEach(s->System.out.print(s+"\t"));
			leaders.clear();
			System.out.println();
	}

		private static List<Integer> findLeaderElements(int[] arr) {
			int n = arr.length ;
			List<Integer> leaders = new ArrayList<>();
			int max = arr[n-1];
			leaders.add(max);
			for(int i = n -2 ; i >= 0 ; i--) {
				if(arr[i] >= max ) {
					max = arr[i];
					leaders.add(arr[i]);
				}
			}
			
			return leaders;
			
		}

}
/*
 -------------Test Case 1-----------------
Leaders in the array : 2	6	7	7	
-------------Test Case 2-----------------
Leaders in the array : 9	
-------------Test Case 3-----------------
Leaders in the array : 4	

 */
