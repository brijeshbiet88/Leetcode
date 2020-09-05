package com.interview.leetcode;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1-----------------");
		String s = "abbabb";
		boolean subStr = repeatedSubstringPattern(s);
		System.out.println("Is Repeted Substring Possible for String "+s+" : "+subStr);
		System.out.println();
		
		System.out.println("---------------Test Case 2-----------------");
		s = "abcabcabcabc";
		subStr = repeatedSubstringPattern(s);
		System.out.println("Is Repeted Substring Possible for String "+s+" : "+subStr);
		System.out.println();
		
		System.out.println("---------------Test Case 3-----------------");
		s = "tiktok";
		subStr = repeatedSubstringPattern(s);
		System.out.println("Is Repeted Substring Possible for String "+s+" : "+subStr);
		System.out.println();
		
		System.out.println("---------------Test Case 4-----------------");
		s = "abba";
		subStr = repeatedSubstringPattern(s);
		System.out.println("Is Repeted Substring Possible for String "+s+" : "+subStr);
		System.out.println();
		
		System.out.println("---------------Test Case 5-----------------");
		s = "pepe";
		subStr = repeatedSubstringPattern(s);
		System.out.println("Is Repeted Substring Possible for String "+s+" : "+subStr);
		System.out.println();

	}

	public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int j = n /2 ; j > 0 ; j--) {
        	if(n % j == 0) {
        		int i = 0 ;
        		while(i + j < n && s.charAt(i) == s.charAt(i+j)) {
        			i++;
        		}
        		if(i+j == n) {
        			return true;
        		}
        	}
        }
		return false;
    }
}
/*
---------------Test Case 1-----------------
Is Repeted Substring Possible for String abbabb : true

---------------Test Case 2-----------------
Is Repeted Substring Possible for String abcabcabcabc : true

---------------Test Case 3-----------------
Is Repeted Substring Possible for String tiktok : false

---------------Test Case 4-----------------
Is Repeted Substring Possible for String abba : false

---------------Test Case 5-----------------
Is Repeted Substring Possible for String pepe : true

 * */
