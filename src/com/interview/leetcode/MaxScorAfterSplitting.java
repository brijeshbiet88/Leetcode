package com.interview.leetcode;

public class MaxScorAfterSplitting {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------");
		String s = "1011011";
		int maxScore = maxScore(s);
		System.out.println("Max Score After spiltting String "+s+" is : "+maxScore);
		System.out.println();
		
		System.out.println("------------------Test Case 2---------------");
		s = "00111";
		maxScore = maxScore(s);
		System.out.println("Max Score After spiltting String "+s+" is : "+maxScore);
		System.out.println();
		
		System.out.println("------------------Test Case 3---------------");
		s = "1111";
		maxScore = maxScore(s);
		System.out.println("Max Score After spiltting String "+s+" is : "+maxScore);
		System.out.println();
		
		System.out.println("------------------Test Case 4---------------");
		s = "0000";
		maxScore = maxScore(s);
		System.out.println("Max Score After spiltting String "+s+" is : "+maxScore);
		System.out.println();
		
		System.out.println("------------------Test Case 5---------------");
		s = "0100";
		maxScore = maxScore(s);
		System.out.println("Max Score After spiltting String "+s+" is : "+maxScore);
		System.out.println();

	}
	
	public static int maxScore(String s) {
		int len = s.length();
		int[] zero = new int[len];
		int[] one = new int[len];
		int count0 = 0;
		int count1 = 0;
		int maxScore = 0;

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '0') {
				count0++;
			}

			zero[i] = count0;
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == '1') {
				count1++;
			}

			one[i] = count1;
		}
		for (int i = 0; i < len - 1; i++) {

			maxScore = Math.max(maxScore, zero[i] + one[i + 1]);

		}

		return maxScore;

	}

}
/*
------------------Test Case 1---------------
Max Score After spiltting String 1011011 is : 5

------------------Test Case 2---------------
Max Score After spiltting String 00111 is : 5

------------------Test Case 3---------------
Max Score After spiltting String 1111 is : 3

------------------Test Case 4---------------
Max Score After spiltting String 0000 is : 3

------------------Test Case 5---------------
Max Score After spiltting String 0100 is : 2

 * */
