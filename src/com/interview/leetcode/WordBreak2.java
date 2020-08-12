package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak2 {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1-------------------");
		String s = "catsanddog";
		String [] dictionary = {"cat" , "cats" , "and" , "sand" , "dog"};
		List<String> wordDict = Arrays.asList(dictionary);
		List<String> validWords = wordBreak(s, wordDict);
		System.out.println("Valid Dictionary Words : ");
		validWords.forEach(word->System.out.print(word+" "));
		validWords.clear();
		System.out.println();
		
		System.out.println("------------------Test Case 2-------------------");
		s = "pineapplepenapple";
		String [] dictionary2 = {"apple", "pen", "applepen", "pine", "pineapple"};
		List<String> wordDict2 = Arrays.asList(dictionary2);
		validWords = wordBreak(s, wordDict2);
		System.out.println("Valid Dictionary Words : ");
		validWords.forEach(word->System.out.print(word+" "));
		validWords.clear();
		System.out.println();
		
		System.out.println("------------------Test Case 3-------------------");
		s = "catsandog";
		String [] dictionary3 = {"cat" , "cats" , "and" , "sand" , "dog"};
		List<String>wordDict3 = Arrays.asList(dictionary3);
		validWords = wordBreak(s, wordDict3);
		System.out.println("Valid Dictionary Words : ");
		validWords.forEach(word->System.out.print(word+" "));
		System.out.println();

	}
	static Map<String , List<String>> map = new HashMap<>();
	public static List<String> wordBreak(String s, List<String> wordDict) {
		
		if(map.containsKey(s))
			return map.get(s);
		List<String> result = new ArrayList<>();
		if(wordDict.contains(s)) {
			result.add(s);
		}
		
		for(int i = 1; i < s.length() ; i++) {
			String left = s.substring(0, i);
			if(wordDict.contains(left)) {
				List<String> subList = wordBreak(s.substring(i) , wordDict);
				for(String str : subList) {
					result.add(left+" "+str);
				}
			}
		}
		
		map.put(s, result);
		return result;
        
    }

}

/*
------------------Test Case 1-------------------
Valid Dictionary Words : 
cat sand dog cats and dog 
------------------Test Case 2-------------------
Valid Dictionary Words : 
pine apple pen apple pine applepen apple pineapple pen apple 
------------------Test Case 3-------------------
Valid Dictionary Words : 
 * */
