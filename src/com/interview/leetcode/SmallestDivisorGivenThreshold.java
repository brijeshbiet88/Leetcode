package com.interview.leetcode;

public class SmallestDivisorGivenThreshold {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------------");
		int a [] = {2 , 5  ,1, 9};
		int threshold = 6;
		int lowestNum = smallestDivisor(a , threshold);
		System.out.println("Threshold : "+threshold+" , Lowest Num : "+lowestNum);
		
		System.out.println("------------------Test Case 2---------------------");
		int b [] = {2 ,3, 5  ,7, 11};
		threshold = 11;
		lowestNum = smallestDivisor(b , threshold);
		System.out.println("Threshold : "+threshold+" , Lowest Num : "+lowestNum);
		
		
		System.out.println("------------------Test Case 3---------------------");
		int c [] = {19};
		threshold = 5;
		lowestNum = smallestDivisor(c , threshold);
		System.out.println("Threshold : "+threshold+" , Lowest Num : "+lowestNum);
		
		System.out.println("------------------Test Case 4---------------------");
		int d [] = {19 , 1 , 5 , 6 , 8 ,9, 45};
		threshold = 14;
		lowestNum = smallestDivisor(d , threshold);
		System.out.println("Threshold : "+threshold+" , Lowest Num : "+lowestNum);


	}
	
	
	public static int smallestDivisor(int[] nums, int threshold) {
		int l = 1 , r = 1000000 , mid ;
		while(l <= r) {
			mid = l + (r -l ) / 2;
			if(getSum(nums, mid) > threshold) {
				l = mid +1;
			}else{
				r = mid -1 ;
			}
			
		}
		
		return l;
	}
	
	public static long getSum(int [] nums , int num) {
		long sum = 0;
		for(int i = 0 ; i < nums.length ; i++)
		sum = sum + (nums[i]-1) / num +1 ;
		return sum;
	}

}

/*
 ------------------Test Case 1---------------------
Threshold : 6 , Lowest Num : 5
------------------Test Case 2---------------------
Threshold : 11 , Lowest Num : 3
------------------Test Case 3---------------------
Threshold : 5 , Lowest Num : 4
------------------Test Case 4---------------------
Threshold : 14 , Lowest Num : 9
 * */
