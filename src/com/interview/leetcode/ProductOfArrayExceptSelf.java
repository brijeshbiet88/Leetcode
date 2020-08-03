package com.interview.leetcode;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		System.out.println("-----------Test Case 1-------------");
		int [] a = {1 , 2 ,3 , 4, 5};
		int [] prod = productExceptSelf(a);
		System.out.println("Array After Replacement");
		for(int num : prod)
			System.out.print(num+"\t");
		    System.out.println();
		    
		System.out.println("-----------Test Case 2-------------");
		int [] b = {10 , 20};
		int [] prod2 = productExceptSelf(b);
		System.out.println("Array After Replacement");
		for(int num : prod2)
			System.out.print(num+"\t");
		    System.out.println();
		    
		    System.out.println("-----------Test Case 3-------------");
			int [] c = {10 , 15 , 20};
			int [] prod3 = productExceptSelf(c);
			System.out.println("Array After Replacement");
			for(int num : prod3)
				System.out.print(num+"\t");
			    System.out.println();

	}
	
	 public static int[] productExceptSelf(int[] nums) {
	        int len = nums.length;
		 	int [] prod = new int [len];
	        int i = 0 ,temp = 1;
	        for(i = 0; i < len ; i++) {
	        	prod[i] = 1;
	        }
	        
	        // left Array Formation
	        
	        for(i = 0 ; i < len ; i++) {
	        	prod[i] = temp*prod[i];
	        	temp *= nums[i];
	        }
	        
	        //right array Formation
	        temp = 1;
	        for(i = len-1 ; i >= 0 ; i--) {
	        	prod[i] = temp*prod[i];
	        	temp *= nums[i];
	        }
	        
	        return prod;
	 }

}

/*
-----------Test Case 1-------------
Array After Replacement
120	60	40	30	24	
-----------Test Case 2-------------
Array After Replacement
20	10	
-----------Test Case 3-------------
Array After Replacement
300	200	150	
 */
