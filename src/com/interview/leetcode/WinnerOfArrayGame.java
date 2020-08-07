package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfArrayGame {
	public static void main(String[] args) {
	System.out.println("-------------Test Case 1-----------------");
	int [] nums1 = {2,1,3,5,4,6,7};
	int k = 2;
	System.out.println("Winner is : "+ getWinner2(nums1, k));
	System.out.println();
	
	System.out.println("-------------Test Case 2-----------------");
	int [] nums2 = {3,2,1};
	k = 10;
	System.out.println("Winner is : "+ getWinner2(nums2, k));
	System.out.println();
	
	System.out.println("-------------Test Case 3-----------------");
	int [] nums3 = {1,9,8,2,3,7,6,4,5};
	k = 7;
	System.out.println("Winner is : "+ getWinner2(nums3, k));
	System.out.println();
	System.out.println("-------------Test Case 4-----------------");
	int [] nums4 = {1,11,22,33,44,55,66,77,88,99};
	k = 1000000000;
	System.out.println("Winner is : "+ getWinner2(nums4, k));
	System.out.println();
	
	System.out.println("-------------Test Case 5-----------------");
	int [] nums5 = {1,25,68,35,42,70};
	k = 3;
	System.out.println("Winner is : "+ getWinner2(nums5, k));
	System.out.println();
	
	}
	
	public static int getWinner(int[] arr, int k) {
		if(k ==1 ) {
		   return arr[0] > arr[1] ? arr[0] : arr[1];	
		}
		int max = Integer.MIN_VALUE;
		int candidate = 0 ;
		Map<Integer , Integer> map = new HashMap<>();
		int i = 0 , j = 1;
		int count = 0;
		while(count < arr.length - 1 ) {
			max = Math.max(max, arr[i]);
			if(arr[i] > arr[j]) {
				candidate = arr[i];
			}
			else {
				candidate = arr[j];
				i = j;
			}
			j = j+1 ;
			map.put(candidate, map.getOrDefault(candidate, 0) + 1);
			if(map.get(candidate) == k) {
				return candidate;
			}
			count ++;
		}
		max = Math.max(max, arr[arr.length-1]);
		return max;
    }
	
	public static int getWinner2(int[] A, int k) {
        int max = A[0], win = 0;
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > max) {
                max = A[i];
                win = 0;
            }
            if (++win == k) break;
        }
        return max;
    }
}
/*
 -------------Test Case 1-----------------
Winner is : 5

-------------Test Case 2-----------------
Winner is : 3

-------------Test Case 3-----------------
Winner is : 9

-------------Test Case 4-----------------
Winner is : 99

-------------Test Case 5-----------------
Winner is : 68

 
 */
