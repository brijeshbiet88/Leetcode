package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1----------------");
		String pattern = "abba";
		String str = "cat dog dog cat";
		System.out.println("Is Pattern "+pattern+" matching with "+str+" : "+wordPattern(pattern, str));
		System.out.println();
		
		System.out.println("-----------------Test Case 2----------------");
		pattern = "abba";
		str = "boy boy boy boy";
		System.out.println("Is Pattern "+pattern+" matching with "+str+" : "+wordPattern(pattern, str));
		System.out.println();
		
		System.out.println("-----------------Test Case 3----------------");
		pattern = "abba";
		str = "cool fool cool fool";
		System.out.println("Is Pattern "+pattern+" matching with "+str+" : "+wordPattern(pattern, str));
		System.out.println();
		

	}

	public static boolean wordPattern(String pattern, String str) {
        Map<Character , String> map = new HashMap<>();
        Map<String , Boolean> mapped = new HashMap<>();
        String [] words = str.split(" ");
        if(words.length != pattern.length()) {
        	return false;
        }
        for(int i = 0 ; i < pattern.length() ; i++) {
        	if(map.get(pattern.charAt(i)) == null && mapped.get(words[i]) == null) {
        		map.put(pattern.charAt(i), words[i]);
        		mapped.put(words[i], true);
        	}else if(!words[i].equals(map.get(pattern.charAt(i)))) {
        		return false;
        	}
        }
		return true;
    }
}
/*
 -----------------Test Case 1----------------
Is Pattern abba matching with cat dog dog cat : true

-----------------Test Case 2----------------
Is Pattern abba matching with boy boy boy boy : false

-----------------Test Case 3----------------
Is Pattern abba matching with cool fool cool fool : false


 */
