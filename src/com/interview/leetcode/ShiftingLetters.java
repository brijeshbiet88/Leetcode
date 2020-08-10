package com.interview.leetcode;

public class ShiftingLetters {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1----------------");
		String s = "abc";
		int [] shifts = {3 ,5 ,9};
		String shiftedString = shiftingLetters(s, shifts);
		System.out.println("Original String :"+s+" , Rotated String : "+shiftedString);
		System.out.println();
		
		System.out.println("---------------Test Case 2----------------");
		s = "rat";
		int [] shifts2 = {23 ,11 ,3};
		shiftedString = shiftingLetters(s, shifts2);
		System.out.println("Original String :"+s+" , Rotated String : "+shiftedString);
		System.out.println();
		
		System.out.println("---------------Test Case 3----------------");
		s = "care";
		int [] shifts3 = {21 ,10 ,4 ,0};
		shiftedString = shiftingLetters(s, shifts3);
		System.out.println("Original String :"+s+" , Rotated String : "+shiftedString);
		System.out.println();
		
		System.out.println("---------------Test Case 3----------------");
		s = "sad";
		int [] shifts4 = {19 , 22 ,21};
		shiftedString = shiftingLetters(s, shifts4);
		System.out.println("Original String :"+s+" , Rotated String : "+shiftedString);
		System.out.println();
	}

	public static String shiftingLetters(String S, int[] shifts) {
		StringBuilder sb = new StringBuilder();
		for(int i = shifts.length-2 ; i >= 0 ; i--) {
			shifts[i] =  shifts[i] % 26 + shifts[i+1] % 26;
		}
		
		for(int i = 0 ; i < shifts.length ; i++) {
			int shiftNum = shifts[i] % 26;
			char c = (char) (S.charAt(i)+shiftNum);
			if(c > 'z') {
				c = (char) (c -26);
			}
			sb.append(c);
			
		}
		return sb.toString();     
    }
}
/*
 * ---------------Test Case 1----------------
Original String :abc , Rotated String : rpl

---------------Test Case 2----------------
Original String :rat , Rotated String : cow

---------------Test Case 3----------------
Original String :care , Rotated String : love

---------------Test Case 3----------------
Original String :sad , Rotated String : cry


 */
