package com.interview.leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {

		System.out.println("--------------Test Case 1---------------");
		String s = "A man, a plan, a canal: Panama";
		boolean isValid = isPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 2---------------");
	    s = "race a car";
		isValid = isPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
	    s = "rat : tar   ";
		isValid = isPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 4---------------");
	    s = "call ac";
		isValid = isPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 5---------------");
	    s = "wallall";
		isValid = isPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();

	}

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0 , j = s.length() -1;
		while(i < j) {
			char charI = s.charAt(i);
			char charJ = s.charAt(j);
			if(Character.isLetterOrDigit(charI) && Character.isLetterOrDigit(charJ) && (charI == charJ )) {
				i++;
				j--;
			}
			else if(Character.isLetterOrDigit(charI) && (Character.isLetterOrDigit(charJ) && charI != charJ )) {
				return false;
			}
			
			if(!Character.isLetterOrDigit(charI)) {
				i++;
			}
			if(!Character.isLetterOrDigit(charJ)) {
				j--;
			}
			
		}
		return true;

	}
}

/*
 * --------------Test Case 1---------------
Is String A man, a plan, a canal: Panama Valid Palindrome : true

--------------Test Case 2---------------
Is String race a car Valid Palindrome : false

--------------Test Case 3---------------
Is String rat : tar    Valid Palindrome : true

--------------Test Case 4---------------
Is String call ac Valid Palindrome : true

--------------Test Case 5---------------
Is String wallall Valid Palindrome : false
 * */
