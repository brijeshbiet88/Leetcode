package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NoOfWaysSqEqualsProduct {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-------------------");
		int [] nums1 = {7 , 4};
		int [] nums2 = {5,2,8,9};
		int noOfWays = numTriplets(nums1, nums2);
		System.out.println("Number of ways triplet can be created = "+noOfWays);
		System.out.println();
		
		
		System.out.println("----------------Test Case 2-------------------");
		int [] nums3 = {1 , 1};
		int [] nums4 = {1 ,1 , 1};
		noOfWays = numTriplets(nums3, nums4);
		System.out.println("Number of ways triplet can be created = "+noOfWays);
		System.out.println();
		
		System.out.println("----------------Test Case 3-------------------");
		int [] nums5 = {7 , 7, 8 , 3};
		int [] nums6 = {1 , 2 , 9 ,7};
		noOfWays = numTriplets(nums5, nums6);
		System.out.println("Number of ways triplet can be created = "+noOfWays);
		System.out.println();
		
		System.out.println("----------------Test Case 4-------------------");
		int [] nums7 = {4, 7, 9, 11, 23};
		int [] nums8 = {3, 5, 1024, 12, 18};
		noOfWays = numTriplets(nums7, nums8);
		System.out.println("Number of ways triplet can be created = "+noOfWays);
		System.out.println();
		
		System.out.println("----------------Test Case 5-------------------");
		int [] nums9 = {43024 , 99908};
		int [] nums10 = {1864};
		noOfWays = numTriplets(nums9, nums10);
		System.out.println("Number of ways triplet can be created = "+noOfWays);
		System.out.println();

	}

	public static int numTriplets(int[] nums1, int[] nums2) {
        int noOfWays = 0;
        int currWays = 0;
        long square = 0;
        
        Map<Long , Integer> map1 = new HashMap<>();
        Map<Long , Integer> map2 = new HashMap<>();
        
        for (int i = 0 ; i < nums1.length ; i++) {
        	square = 1L * nums1[i]*nums1[i];
        	if(map1.containsKey(square)) {
        		noOfWays += map1.get(square);
        		continue;
        	}
        	currWays = 0;
        	for(int j = 0 ; j < nums2.length-1; j++) {
        		for(int k = j+1 ; k < nums2.length; k++) {
        			if(square == 1L * nums2[j]*nums2[k]) {
        				currWays++;
        			}
        		}
        	}
        	noOfWays += currWays;
        	map1.put(square, currWays);
        }
        
        for (int i = 0 ; i < nums2.length ; i++) {
        	square = 1L *nums2[i]*nums2[i];
        	if(map2.containsKey(square)) {
        		noOfWays += map2.get(square);
        		continue;
        	}
        	currWays = 0;
        	for(int j = 0 ; j < nums1.length-1; j++) {
        		for(int k = j+1 ; k < nums1.length; k++) {
        			if(square == 1L *nums1[j]*nums1[k]) {
        				currWays++;
        			}
        		}
        	}
        	
        	noOfWays += currWays;
        	map2.put(square, currWays);
        }
        
        return noOfWays;
    }
}
/*
 * ----------------Test Case 1-------------------
Number of ways triplet can be created = 1

----------------Test Case 2-------------------
Number of ways triplet can be created = 9

----------------Test Case 3-------------------
Number of ways triplet can be created = 2

----------------Test Case 4-------------------
Number of ways triplet can be created = 0

----------------Test Case 5-------------------
Number of ways triplet can be created = 0

 * */
