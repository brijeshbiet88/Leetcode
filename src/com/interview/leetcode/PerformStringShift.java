package com.interview.leetcode;

public class PerformStringShift {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1-------------");
		int [][] shift = {{1 ,1},{1 ,1},{0 ,2 },{1 ,3}};
		String s = "abcdefg";
		String rotatedString = stringShift(s, shift);
		System.out.println("Original String :"+s+" , Rotated String : "+rotatedString);
		System.out.println();
		
		System.out.println("--------------Test Case 2-------------");
		int [][] shift2 = {{0 ,1},{1 ,2}};
		s = "abc";
		rotatedString = stringShift(s, shift2);
		System.out.println("Original String :"+s+" , Rotated String : "+rotatedString);
		System.out.println();

	}

	public static String stringShift (String s , int [][] shift) {
		int totalShift = 0;
		int size = s.length();
		for(int i = 0 ; i < shift.length ; i++) {
			
			if(shift[i][0] == 0) {
				totalShift += shift[i][1];
			}
			else {
				totalShift -= shift[i][1];
			}
		}
		
		totalShift = (totalShift % size + size) % size;
		if(totalShift == 0)
		 return s;
		
		StringBuilder sb = new StringBuilder();
		int len = 0;
		while(len < s.length()) {
			sb.append(s.charAt((len+totalShift) % size));
			len++;
		}
		
		return sb.toString();
		
	}
}
