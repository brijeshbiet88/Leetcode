package com.interview.leetcode;

public class ClimbStairs {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1-------------");
		int n = 3;
		System.out.println("Total ways to climb "+n+" stairs : "+climbStairsRec(n));
		System.out.println();
		
		System.out.println("---------------Test Case 2-------------");
		n = 5;
		System.out.println("Total ways to climb "+n+" stairs : "+climbStairsRec(n));
		System.out.println();
		
		System.out.println("---------------Test Case 3-------------");
		n = 1;
		System.out.println("Total ways to climb "+n+" stairs : "+climbStairs(n));
		System.out.println();
		
		System.out.println("---------------Test Case 4-------------");
		n = 6;
		System.out.println("Total ways to climb "+n+" stairs : "+climbStairs(n));
		System.out.println();
		
		System.out.println("---------------Test Case 5-------------");
		n = 8;
		System.out.println("Total ways to climb "+n+" stairs : "+climbStairs(n));
		System.out.println();

	}
	
	public static int climbStairsRec(int n) {
        if(n < 2){
        	return 1;
        }
        
        return climbStairsRec(n-1)+climbStairsRec(n-2);
    }
	
	public static int climbStairs(int n) {
        int [] result = new int [n+1];
        result[0] = 1;
        if(n >= 1)
        	result[1] = 1;	
        for(int i = 2; i <= n; i++) {
        	result[i] = result[i-1]+result[i-2];
        }
        
        return result[n];
    }

}
/*
---------------Test Case 1-------------
Total ways to climb 3 stairs : 3

---------------Test Case 2-------------
Total ways to climb 5 stairs : 8

---------------Test Case 3-------------
Total ways to climb 1 stairs : 1

---------------Test Case 4-------------
Total ways to climb 6 stairs : 13

---------------Test Case 5-------------
Total ways to climb 8 stairs : 34
*/
