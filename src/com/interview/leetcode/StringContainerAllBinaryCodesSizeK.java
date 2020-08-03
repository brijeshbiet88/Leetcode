package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class StringContainerAllBinaryCodesSizeK {

	public static void main(String[] args) {
		System.out.println("---------Test Case 1----------");
		String s = "11001001";
		int k = 2 ;
		System.out.println("Does String "+s+" Has All Codes Of Length : "+k+" ? :"+hasAllCodes(s, k));
		
		System.out.println("---------Test Case 2----------");
		s = "0110";
		k = 1;
		System.out.println("Does String "+s+" Has All Codes Of Length : "+k+" ? :"+hasAllCodes(s, k));
		
		System.out.println("---------Test Case 3----------");
		s = "111000101100";
		k = 3;
		System.out.println("Does String "+s+" Has All Codes Of Length : "+k+" ? :"+hasAllCodes(s, k));
		
		System.out.println("---------Test Case 4----------");
		s = "111100001001001101001011011100110011011101111";
		k = 4;
		System.out.println("Does String "+s+" Has All Codes Of Length : "+k+" ? :"+hasAllCodes(s, k));
		
		System.out.println("---------Test Case 5----------");
		s = "0000000001011100";
		k = 45;
		System.out.println("Does String "+s+" Has All Codes Of Length : "+k+" ? :"+hasAllCodes(s, k));

	}
	
	public static boolean hasAllCodes(String s, int k) {
		int strLen = s.length();
		Set<String> set = new HashSet<String>();
		for(int i = 0 ; i <= strLen - k ; i++  ) {
            String subStr = s.substring(i , i+k);
				set.add(subStr);	
		}
		
		return (set.size()==Math.pow(2,k));
        
    }

}

/*
---------Test Case 1----------
Does String 11001001 Has All Codes Of Length : 2 ? :true
---------Test Case 2----------
Does String 0110 Has All Codes Of Length : 1 ? :true
---------Test Case 3----------
Does String 111000101100 Has All Codes Of Length : 3 ? :true
---------Test Case 4----------
Does String 111100001001001101001011011100110011011101111 Has All Codes Of Length : 4 ? :true
---------Test Case 5----------
Does String 0000000001011100 Has All Codes Of Length : 45 ? :false


 */
