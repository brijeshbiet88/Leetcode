package com.interview.leetcode;

public class MonotonicArray {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1---------------");
		int [] A = {6 , 6 , 6 , 5 , 5 , 4};
		System.out.println("Is Array Monotonic : "+isMonotonic(A));
		System.out.println();
		
		System.out.println("----------------Test Case 2---------------");
		int [] A2 = {1 , 3 , 2};
		System.out.println("Is Array Monotonic : "+isMonotonic(A2));
		System.out.println();
		
		System.out.println("----------------Test Case 3---------------");
		int [] A3 = {1 , 2 , 2 , 3};
		System.out.println("Is Array Monotonic : "+isMonotonic(A3));
		System.out.println();

	}
	
	 public static boolean isMonotonic(int[] A) {
		int len = A.length;
		boolean increasing = true;
		if(len <= 2 )
			return true;
		
		int compareIndex = 0;
		while(compareIndex < len -1) {
			if(A[compareIndex] < A[compareIndex+1]) {
				increasing = true;
				break;
			}
			else if(A[compareIndex] > A[compareIndex+1]) {
				increasing = false;
				break;
			}
			compareIndex++;
		}
		
		for(int i = compareIndex ; i < A.length - 1; i++) {
			
			if(increasing && A[i] > A[i+1]) {
				return false;
			}
			else if(!increasing && A[i] < A[i+1]){
				return false;
			}
		}
		
		
		 
		return true;
	 }

}

/*
 * ----------------Test Case 1---------------
Is Array Monotonic : true

----------------Test Case 2---------------
Is Array Monotonic : false

----------------Test Case 3---------------
Is Array Monotonic : true


 * */
