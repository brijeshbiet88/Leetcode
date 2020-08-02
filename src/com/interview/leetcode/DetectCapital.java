package com.interview.leetcode;

public class DetectCapital {

	public static void main(String[] args) {
		System.out.println("-------Test Case 1----------------");
		String word = "USA";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));
		
		System.out.println("-------Test Case 2----------------");
		word = "Google";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));
		
		System.out.println("-------Test Case 3----------------");
		word = "leetcode";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));
		
		System.out.println("-------Test Case 4----------------");
		word = "Zinc";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));
		
		System.out.println("-------Test Case 5----------------");
		word = "zOo";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));
		
		System.out.println("-------Test Case 6----------------");
		word = "apple";
		System.out.println("is Valid Word :"+word+" "+detectCapitalUse(word));

	}
	
	public static boolean detectCapitalUse(String word) {
		int small = 0 , capital = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			char c = word.charAt(i);
			if(c >= 65 && c <= 90) {
				capital++;
			}
			
			else if(c >= 97 &&  c <= 122 ) {
				small++;
			}
			
		}
		return (word.length() == small || word.length() == capital || (capital == 1) 
				&& word.charAt(0) >= 65 && word.charAt(0) <= 90 );
        
    }

}
/*
 -------Test Case 1----------------
is Valid Word :USA true
-------Test Case 2----------------
is Valid Word :Google true
-------Test Case 3----------------
is Valid Word :leetcode true
-------Test Case 4----------------
is Valid Word :Zinc true
-------Test Case 5----------------
is Valid Word :zOo false
-------Test Case 6----------------
is Valid Word :apple true

 */
