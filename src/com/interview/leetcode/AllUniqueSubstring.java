package com.interview.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllUniqueSubstring {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1---------------");
		String p = "abc";
		int len = findAllUniqueSubstring(p);
		int len2 = findAllUniqueSubstring2(p);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len2);
		System.out.println();
		
		System.out.println("---------------Test Case 2---------------");
		p = "aca";
		len = findAllUniqueSubstring(p);
		len2 = findAllUniqueSubstring2(p);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len2);
		System.out.println();
		
		System.out.println("---------------Test Case 3---------------");
		p = "stalk";
		len = findAllUniqueSubstring(p);
		len2 = findAllUniqueSubstring2(p);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len2);
		System.out.println();

		System.out.println("---------------Test Case 4---------------");
		p = "deed";
		len = findAllUniqueSubstring(p);
		len2 = findAllUniqueSubstring2(p);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len2);
		System.out.println();
		
		System.out.println("---------------Test Case 5---------------");
		p = "cbcecc";
		len = findAllUniqueSubstring(p);
		len2 = findAllUniqueSubstring2(p);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len);
		System.out.println("\nNumber of Unique Substring For String "+p+" is : "+len2);
		System.out.println();
	}

	public static int findAllUniqueSubstring(String p) {
		Set<String> set = new LinkedHashSet<String>();
		int subStr = 1;
		while (subStr <= p.length()) {
			for (int j = 0; j <= p.length()-subStr; j++) {
				String str = p.substring(j, subStr+j);
					set.add(str);
			}
			subStr++;
		}

		System.out.println("SubStrings :");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"	");
		}
		
		return set.size();
	}
	
	public static int findAllUniqueSubstring2(String p) {
		Set<Character> set = new HashSet<Character>();
		int totalLen = p.length();
		int result = 0;
		int uniqueCharLen = 0;
		for(char c : p.toCharArray()) {
			set.add(c);
		}
		
		result = totalLen * (totalLen+1)/2;
		uniqueCharLen = set.size();
		result -= totalLen-uniqueCharLen;
		
		return result;
		
	}
}
