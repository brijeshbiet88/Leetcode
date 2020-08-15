package com.interview.leetcode;

public class ValidMountainArray {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1----------------");
		int [] A = {0,3,2,1};
		boolean isValid = validMountainArray(A);
		System.out.println("Valid Mountain Array : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 2----------------");
		int [] A2 = {0, 2, 3, 3 , 5 , 2 , 1 , 0};
		isValid = validMountainArray(A2);
		System.out.println("Valid Mountain Array : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 3----------------");
		int [] A3 = {0, 2, 3, 4 , 5 , 2 , 1 , 0};
		isValid = validMountainArray(A3);
		System.out.println("Valid Mountain Array : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 4----------------");
		int [] A4 = {0, 1 , 2 ,3 ,4 , 5 , 6 , 7};
		isValid = validMountainArray(A4);
		System.out.println("Valid Mountain Array : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 5----------------");
		int [] A5 = {9 , 8 , 6 , 4 , 3 , 1 , 0};
		isValid = validMountainArray(A5);
		System.out.println("Valid Mountain Array : "+isValid);
		System.out.println();

	}

	 public static boolean validMountainArray(int[] A) {
	     if(A.length < 3) {
	    	 return false;
	     }   
	     
	     boolean up = true;
	     for(int i = 0 ; i < A.length - 1 ; i++) {
	    	 if(A[i] == A[i+1]) {
	    		 return false;
	    	 }
	    	 else if(i == 0 && up && A[i] > A[i+1] ) {
	    		 return false;
	    	 }
	    	 else if(up && A[i] > A[i+1] ) {
	    		 up = !up;
	    	 }
	    	 
	    	 else if(!up && A[i] < A[i+1] ) {
	    		 return false;
	    	 }
	    	 
	     }
	     
		 
		 return up?false:true;
	 }
}
