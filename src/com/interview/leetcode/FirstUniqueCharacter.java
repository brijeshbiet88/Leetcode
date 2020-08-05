package com.interview.leetcode;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1------------------");
		String s = "leetcode";
		System.out.println("Index of First Unique Character of String "+s+" is : "+firstUniqChar(s));
		System.out.println();
		
		System.out.println("------------------Test Case 2------------------");
		s = "loveleetcode";
		System.out.println("Index of First Unique Character of String "+s+" is : "+firstUniqChar(s));
		System.out.println();
		
		System.out.println("------------------Test Case 3------------------");
		s = "saas";
		System.out.println("Index of First Unique Character of String "+s+" is : "+firstUniqChar(s));
		System.out.println();

	}
	// Assuming all small case letters 
	public static int firstUniqChar(String s) {
		int [] frequency = new int[26];
		
		for(int i = 0 ; i < s.length() ; i++) {
			frequency[s.charAt(i) - 'a']++  ;
		}
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(frequency[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		
		return -1;
        
    }
}
