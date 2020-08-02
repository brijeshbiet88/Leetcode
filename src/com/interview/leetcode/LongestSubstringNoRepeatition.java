package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeatition {

	public static void main(String[] args) {
		System.out.println("---------------Test case 1---------------");
		String str = "abcdhhhhhh";
		System.out.println("Longest Substring w/o repeatition in String: "+ str +" is : "+lengthOfLongestSubstring(str));
		
		System.out.println("---------------Test case 2---------------");
		str = "a";
		System.out.println("Longest Substring w/o repeatition in String: "+ str +" is : "+lengthOfLongestSubstring(str));
		
		System.out.println("---------------Test case 3---------------");
		str = "dvdf";
		System.out.println("Longest Substring w/o repeatition in String: "+ str +" is : "+lengthOfLongestSubstring(str));
		
		System.out.println("---------------Test case 4---------------");
		str = "abcacefdhs";
		System.out.println("Longest Substring w/o repeatition in String: "+ str +" is : "+lengthOfLongestSubstring(str));
		
	}
	
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int maxLength = 0;
		int i = 0, j = 0;
		while (i < s.length() && j < s.length()) {

			if (set.contains(s.charAt(j))) {
				maxLength = Math.max(maxLength, j -i);
				set.remove(s.charAt(i++));
			} else {
				set.add(s.charAt(j++));

			}
		}

		maxLength = Math.max(maxLength, j -i);

		return maxLength;
	}

}
/*
---------------Test case 1---------------
Longest Substring w/o repeatition in String: abcdhhhhhh is : 5
---------------Test case 2---------------
Longest Substring w/o repeatition in String: a is : 1
---------------Test case 3---------------
Longest Substring w/o repeatition in String: dvdf is : 3
---------------Test case 4---------------
Longest Substring w/o repeatition in String: abcacefdhs is : 7 
 */
