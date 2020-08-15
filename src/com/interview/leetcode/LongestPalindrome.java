package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1------------------");
		String s = "abccccdd";
		int len = longestPalindrome(s);
		System.out.println("Longest Palindrome Length in String "+s+" is : "+len);
		System.out.println();
		
		System.out.println("----------------Test Case 2------------------");
		s = "classic";
		len = longestPalindrome(s);
		System.out.println("Longest Palindrome Length in String "+s+" is : "+len);
		System.out.println();
		
		System.out.println("----------------Test Case 3------------------");
		s = "static";
		len = longestPalindrome(s);
		System.out.println("Longest Palindrome Length in String "+s+" is : "+len);
		System.out.println();
		
		System.out.println("----------------Test Case 4------------------");
		s = "single";
		len = longestPalindrome(s);
		System.out.println("Longest Palindrome Length in String "+s+" is : "+len);
		System.out.println();

	}

	public static int longestPalindrome(String s) {
		Set<Character> set = new HashSet<Character>();
		int len = 0;
		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				set.remove(c);
				len = len + 2;
			}else {
				set.add(c);
			}
			
		}
		if(set.size() != 0)
			len++;
		
		return len;
    }
}

/*
----------------Test Case 1------------------
Longest Palindrome Length in String abccccdd is : 7

----------------Test Case 2------------------
Longest Palindrome Length in String classic is : 5

----------------Test Case 3------------------
Longest Palindrome Length in String static is : 3

----------------Test Case 4------------------
Longest Palindrome Length in String single is : 1

 * */
