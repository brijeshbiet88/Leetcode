package com.interview.leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1----------------");
		int [] A = {2 ,1 , 2};
		int maxPerimeter = largestPerimeter(A);
		System.out.println("Largest Perimeter Triangle : "+maxPerimeter);
		System.out.println();
		
		System.out.println("-------------Test Case 2----------------");
		int [] A2 = {2 ,1 , 1};
		maxPerimeter = largestPerimeter(A2);
		System.out.println("Largest Perimeter Triangle : "+maxPerimeter);
		System.out.println();
		
		System.out.println("-------------Test Case 3----------------");
		int [] A3 = {3 , 2 ,3 , 4};
		maxPerimeter = largestPerimeter(A3);
		System.out.println("Largest Perimeter Triangle : "+maxPerimeter);
		System.out.println();
		
		System.out.println("-------------Test Case 4----------------");
		int [] A4 = {4 , 2 ,1 , 5 , 3 , 10};
		maxPerimeter = largestPerimeter(A4);
		System.out.println("Largest Perimeter Triangle : "+maxPerimeter);
		System.out.println();
		
		
	}
	public static int largestPerimeter(int[] A) {
		Arrays.sort(A);
		int a = 0 , b = 0 , c = 0;
		for(int i = A.length -1 ; i >= 2; i--) {
			a = A[i];
			b = A[i-1];
			c = A[i-2];
			
			if((a+b) > c && (a+c) > b && (b+c) > a) {
				return (a+b+c);
			}
			
			
			
		}
		return 0;
	        
	}
}
/*
-------------Test Case 1----------------
Largest Perimeter Triangle : 5

-------------Test Case 2----------------
Largest Perimeter Triangle : 0

-------------Test Case 3----------------
Largest Perimeter Triangle : 10

-------------Test Case 4----------------
Largest Perimeter Triangle : 12

 * */
