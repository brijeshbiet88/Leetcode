package com.interview.leetcode;

public class PowerOf4 {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1-------------");
		int num = 256;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOfFour(num));
		
		System.out.println("-------------Test Case 2-------------");
		num = 8;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOfFour(num));
		
		System.out.println("-------------Test Case 3-------------");
		num = 3;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOf4(num));
		
		System.out.println("-------------Test Case 4-------------");
		num = 64;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOf4(num));
		
		System.out.println("-------------Test Case 5-------------");
		num = 15;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOf4(num));

		System.out.println("-------------Test Case 6-------------");
		num = 32;
		System.out.println("Is The Number "+num+ " a Power of Four : "+isPowerOf4(num));
	}
	
	 public static boolean isPowerOfFour(int num) {
		 return (num-1) %3 == 0 && ((num & num -1) == 0);
	        
	 }
	 
	 public static boolean isPowerOf4(int num) {
		 String binStr = Integer.toBinaryString(num);
		 return (binStr.charAt(0) == '1' && binStr.length() %2 == 1 &&binStr.replaceAll("0", "").length() == 1);
	        
	 }

}

/*
 -------------Test Case 1-------------
Is The Number 256 a Power of Four : true
-------------Test Case 2-------------
Is The Number 8 a Power of Four : false
-------------Test Case 3-------------
Is The Number 3 a Power of Four : false
-------------Test Case 4-------------
Is The Number 64 a Power of Four : true
-------------Test Case 5-------------
Is The Number 15 a Power of Four : false
-------------Test Case 6-------------
Is The Number 32 a Power of Four : false

 * */
