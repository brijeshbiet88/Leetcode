package com.interview.leetcode.dp;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		System.out.println("------------------------Test Case 1--------------------------");
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println("Text1 = "+text1+" Text2 = "+text2);
		System.out.println("Longest Common Subsequence "+longestCommonSubsequence(text1, text2));
		System.out.println();
		
		System.out.println("------------------------Test Case 2--------------------------");
		text1 = "abc";
		text2 = "def";
		System.out.println("Text1 = "+text1+" Text2 = "+text2);
		System.out.println("Longest Common Subsequence "+longestCommonSubsequence(text1, text2));
		System.out.println();
	}
	
	  public static int longestCommonSubsequence(String text1, String text2) {
		  int l1 = text1.length() , l2 = text2.length();
		  int [][] result = new int [l1+1][l2+1];
		  
		  for(int i = 0 ; i < l1 ; i++) {
			  for(int j = 0 ; j < l2 ;j++) {
				  if(text1.charAt(i) == text2.charAt(j)) {
					  result[i+1][j+1] = result[i][j] + 1;
				  }else {
					    result[i+1][j+1] = Math.max(result[i][j+1] , result[i+1][j]);
					  
				  }
			  }
		  }
		  
		  return result[l1][l2];  
	  }

}

/*
 * ------------------------Test Case 1--------------------------
Text1 abcde Text2 ace
Longest Common Subsequence 3

------------------------Test Case 2--------------------------
Text1 abc Text2 def
Longest Common Subsequence 0
 * 
 * */
