package com.interview.leetcode;

public class ValidPalindromeII {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1---------------");
		String s = "aba";
		boolean isValid = validPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 2---------------");
	    s = "abca";
		isValid = validPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
	    s = "lcuucul";
		isValid = validPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 4---------------");
	    s = "feeee";
		isValid = validPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();
		
		System.out.println("--------------Test Case 5---------------");
	    s = "meet";
		isValid = validPalindrome(s);
		System.out.println("Is String "+s+" Valid Palindrome : "+isValid);
		System.out.println();

	}

	public static boolean validPalindrome(String s) {
		if (s.length() <= 2) {
			return true;
		}
		int i = 0, j = s.length() - 1;
		while (i < j) {

			if (s.charAt(i) != s.charAt(j)) {
				if(isPalindrome(s.substring(i, j)) || isPalindrome(s.substring(i+1, j+1)) )
					return true;
				return false;
			}
			
			i++;
			j--;

		}
		return true;
	}

	private static boolean isPalindrome(String s) {
		int i = 0 , j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
/*
 --------------Test Case 1---------------
Is String aba Valid Palindrome : true

--------------Test Case 2---------------
Is String abca Valid Palindrome : true

--------------Test Case 3---------------
Is String lcuucul Valid Palindrome : true

--------------Test Case 4---------------
Is String feeee Valid Palindrome : true

--------------Test Case 5---------------
Is String meet Valid Palindrome : false
 * */
