package com.interview.leetcode.dp;


public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		System.out.println("------------------------Test Case 1--------------------------");
		String s = "bbbab";
		
		System.out.println("String = "+s);
		System.out.println("Longest Common Subsequence "+longestPalindromeSubseq(s));
		System.out.println();
		
		System.out.println("------------------------Test Case 2--------------------------");
		s = "cbbd";
		
		System.out.println("Text1 = "+s);
		System.out.println("Longest Common Subsequence "+longestPalindromeSubseq(s));
		System.out.println();
		
		System.out.println("------------------------Test Case 3--------------------------");
		s = "radar";
		
		System.out.println("Text1 = "+s);
		System.out.println("Longest Common Subsequence "+longestPalindromeSubseq(s));
		System.out.println();

	}
	
	 public static int longestPalindromeSubseq(String s) {
		   
		  String s2 = (new StringBuilder(s)).reverse().toString(); 
		  int n = s.length() ;
		  int [][] result = new int [n+1][n+1];
		  
		  for(int i = 0 ; i < n ; i++) {
			  for(int j = 0 ; j < n ;j++) {
				  if(s.charAt(i) == s2.charAt(j)) {
					  result[i+1][j+1] = result[i][j] + 1;
				  }else {
					    result[i+1][j+1] = Math.max(result[i][j+1] , result[i+1][j]);
					  
				  }
			  }
		  }
		  
		  return result[n][n];  
	  }

}
/*
 * ------------------------Test Case 1--------------------------
String = bbbab
Longest Common Subsequence 4

------------------------Test Case 2--------------------------
Text1 = cbbd
Longest Common Subsequence 2

------------------------Test Case 3--------------------------
Text1 = radar
Longest Common Subsequence 5

 * */

