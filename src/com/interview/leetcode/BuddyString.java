package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-----------------");
		String A = "aaabcaaa";
		String B = "aaacbaaa";
		boolean buddy = buddyStrings(A, B);
		System.out.println("Are Strings "+A+" and "+B+" buddy Strings : "+buddy);
		System.out.println();
		
		System.out.println("----------------Test Case 2-----------------");
		A = "loyalty";
		B = "loyalty";
		buddy = buddyStrings(A, B);
		System.out.println("Are Strings "+A+" and "+B+" buddy Strings : "+buddy);
		System.out.println();
		
		System.out.println("----------------Test Case 3-----------------");
		A = "aa";
		B = "aa";
		buddy = buddyStrings(A, B);
		System.out.println("Are Strings "+A+" and "+B+" buddy Strings : "+buddy);
		System.out.println();
		
		System.out.println("----------------Test Case 4-----------------");
		A = "";
		B = "";
		buddy = buddyStrings(A, B);
		System.out.println("Are Strings "+A+" and "+B+" buddy Strings : "+buddy);
		System.out.println();
		
		System.out.println("----------------Test Case 5-----------------");
		A = "abab";
		B = "abab";
		buddy = buddyStrings(A, B);
		System.out.println("Are Strings "+A+" and "+B+" buddy Strings : "+buddy);
		System.out.println();

	}
	
	 public static boolean buddyStrings(String A, String B) {
		 int diff = 0;
		 int count = 0;
		 Set<Character> set = new HashSet<Character>();
		 if(A.length() != B.length() || A.length() < 2) {
			 return false;
		 }
		 
		 for(int i = 0 ;i < A.length() ; i++) {
			 if(A.charAt(i) != B.charAt(i)) {
				 diff += A.charAt(i) - B.charAt(i);
				 count++;
				 if(count > 2) {
					 return false;
				 }
			 }
			 set.add(A.charAt(i));
		 }
		 
		 if(diff == 0 && count == 0 && set.size() != A.length()) {
			 return true;
		 }
		 
		 return diff == 0 ? count == 0 ? false : true : false;	        
	 }

}
/*
----------------Test Case 1-----------------
Are Strings aaabcaaa and aaacbaaa buddy Strings : true

----------------Test Case 2-----------------
Are Strings loyalty and loyalty buddy Strings : true

----------------Test Case 3-----------------
Are Strings aa and aa buddy Strings : true

----------------Test Case 4-----------------
Are Strings  and  buddy Strings : false

----------------Test Case 5-----------------
Are Strings abab and abab buddy Strings : true
 * */
