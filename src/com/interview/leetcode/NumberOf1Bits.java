package com.interview.leetcode;

public class NumberOf1Bits {

	public static void main(String[] args) {
		System.out.println("----------Test Case 1-----------");
		int n = 0;
		System.out.println("Number of 1 Bits in Decimal "+n +" Binary "+Integer.toBinaryString(n) +" : "+hammingWeight(n));
		System.out.println();
		
		System.out.println("----------Test Case 2-----------");
		n = 1000;
		System.out.println("Number of 1 Bits in Decimal "+n +" Binary "+Integer.toBinaryString(n) +" : "+hammingWeight(n));
		System.out.println();
		
		System.out.println("----------Test Case 3-----------");
		n = 63;
		System.out.println("Number of 1 Bits in Decimal "+n +" Binary "+Integer.toBinaryString(n) +" : "+hammingWeight(n));
		System.out.println();
		
		System.out.println("----------Test Case 4-----------");
		n = 250;
		System.out.println("Number of 1 Bits in Decimal "+n +" Binary "+Integer.toBinaryString(n) +" : "+hammingWeight(n));
		System.out.println();

	}
	
	public static int hammingWeight(int n) {
	    int noOfBits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            noOfBits++;
	        }
	        mask = mask << 1;
	    }
	    return noOfBits;
	}

}

/*
 * ----------Test Case 1-----------
Number of 1 Bits in Decimal 0 Binary 0 : 0

----------Test Case 2-----------
Number of 1 Bits in Decimal 1000 Binary 1111101000 : 6

----------Test Case 3-----------
Number of 1 Bits in Decimal 63 Binary 111111 : 6

----------Test Case 4-----------
Number of 1 Bits in Decimal 250 Binary 11111010 : 6


 */
