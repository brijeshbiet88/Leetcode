package com.interview.leetcode;

public class NumberOfWaysToSplitString {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1--------------");
		String s = "10101";
		System.out.println("Number of Ways of Splitting String "+s+" with Equla 1 in all 3 parts : "+numWays(s));
		System.out.println();
		
		System.out.println("-------------Test Case 2--------------");
		s = "00000";
		System.out.println("Number of Ways of Splitting String "+s+" with Equla 1 in all 3 parts : "+numWays(s));
		System.out.println();

		System.out.println("-------------Test Case 3--------------");
		s = "10010";
		System.out.println("Number of Ways of Splitting String "+s+" with Equla 1 in all 3 parts : "+numWays(s));
		System.out.println();
		
		System.out.println("-------------Test Case 4--------------");
		s = "100100010100110";
		System.out.println("Number of Ways of Splitting String "+s+" with Equla 1 in all 3 parts : "+numWays(s));
		System.out.println();
		
		System.out.println("-------------Test Case 5--------------");
		s = "011110011";
		System.out.println("Number of Ways of Splitting String "+s+" with Equla 1 in all 3 parts : "+numWays(s));
		System.out.println();
		
	}
	
	public static int numWays(String s) {
		long a = 0 , b = 0;
		long noOf1s = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				noOf1s++;
			}
		}

		if (noOf1s % 3 != 0) {
			return 0;
		}
		else if (noOf1s == 0) {
			return (int) ((n - 1)%(Math.pow(10, 9)+ 7) * (n - 2)%(Math.pow(10, 9)+ 7) / 2);
		} else {
			
			long noOF1sPerPart = noOf1s/3;
			int i = 0;
			int onesOccured = 0;
			int part = 1;
			while(part <= 2) {
			int cuts = 1;
			onesOccured = 0;
			while(i <n && onesOccured < noOF1sPerPart) {
				if(s.charAt(i) == '1') {
					onesOccured++;
				}
				i++;
			}
			while(i < n && s.charAt(i) == '0') {
				i++;
				cuts++;
			}
			
			if(part == 1) {
				a = cuts;
			}else {
				b = cuts;
			}
			part++;
			}
			
		}

		return (int) (a%(Math.pow(10, 9)+ 7) * b%(Math.pow(10, 9)+ 7));

	}

}
/*
 * -------------Test Case 1--------------
Number of Ways of Splitting String 10101 with Equla 1 in all 3 parts : 4

-------------Test Case 2--------------
Number of Ways of Splitting String 00000 with Equla 1 in all 3 parts : 6

-------------Test Case 3--------------
Number of Ways of Splitting String 10010 with Equla 1 in all 3 parts : 0

-------------Test Case 4--------------
Number of Ways of Splitting String 100100010100110 with Equla 1 in all 3 parts : 12

-------------Test Case 5--------------
Number of Ways of Splitting String 011110011 with Equla 1 in all 3 parts : 3

 * */
