package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1----------------");
		String s = "paper";
		String t = "title";
		System.out.println("Are Strings "+s+" and "+t+" Isomorphic : "+isIsomorphic(s, t));
		System.out.println();
		
		System.out.println("-----------------Test Case 2----------------");
		s = "egg";
		t = "add";
		System.out.println("Are Strings "+s+" and "+t+" Isomorphic : "+isIsomorphic(s, t));
		System.out.println();
		
		System.out.println("-----------------Test Case 3----------------");
		s = "aba";
		t = "aaa";
		System.out.println("Are Strings "+s+" and "+t+" Isomorphic : "+isIsomorphic(s, t));
		System.out.println();
		
		System.out.println("-----------------Test Case 4----------------");
		s = "happy";
		t = "teddy";
		System.out.println("Are Strings "+s+" and "+t+" Isomorphic : "+isIsomorphic(s, t));
		System.out.println();
		
		System.out.println("-----------------Test Case 5----------------");
		s = "ab";
		t = "aa";
		System.out.println("Are Strings "+s+" and "+t+" Isomorphic : "+isIsomorphic(s, t));
		System.out.println();

	}
	
	
	public static boolean isIsomorphic(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Boolean> mapped = new HashMap<>();
		Map<Character,Character> map = new HashMap<>();
		
		for(int i = 0; i < s.length() ; i++) {
			if(mapped.get(t.charAt(i)) == null ) {
				map.put(s.charAt(i), t.charAt(i));
				mapped.put(t.charAt(i) , false);
			}else if(map.get(s.charAt(i)) == null){
				return false;
			}
			
		}
		
		for(int i = 0; i < s.length() ; i++) {
			if((map.get(s.charAt(i))  != t.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
/*
-----------------Test Case 1----------------
Are Strings paper and title Isomorphic : true

-----------------Test Case 2----------------
Are Strings egg and add Isomorphic : true

-----------------Test Case 3----------------
Are Strings aba and aaa Isomorphic : false

-----------------Test Case 4----------------
Are Strings happy and teddy Isomorphic : true

-----------------Test Case 5----------------
Are Strings ab and aa Isomorphic : false

 * */
