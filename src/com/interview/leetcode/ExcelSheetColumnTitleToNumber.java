package com.interview.leetcode;

public class ExcelSheetColumnTitleToNumber {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-----------------");
		String title = "Z";
		System.out.println("Title "+title +" in Excel Sheet : "+titleToNumber(title));
		System.out.println();
		
		System.out.println("----------------Test Case 2-----------------");
		title = "CUZ";
		System.out.println("Title "+title +" in Excel Sheet : "+titleToNumber(title));
		System.out.println();
		
		System.out.println("----------------Test Case 3-----------------");
		title = "CY";
		System.out.println("Title "+title +" in Excel Sheet : "+titleToNumber(title));
		System.out.println();
		
		System.out.println("----------------Test Case 4-----------------");
		title = "ANH";
		System.out.println("Title "+title +" in Excel Sheet : "+titleToNumber(title));
		System.out.println();
		
		System.out.println("----------------Test Case 5-----------------");
		title = "AX";
		System.out.println("Title "+title +" in Excel Sheet : "+titleToNumber(title));
		System.out.println();

	}

	private static int titleToNumber(String title) {
		int num = 0;
		int base = 26 , pow = 0;
		for(int i = title.length()-1 ; i >= 0 ; i-- ) {
			char c = (char) (title.charAt(i)-64);
			num += Math.pow(base, pow++)*c;
		}
		return num;
	}

}
/*
 ----------------Test Case 1-----------------
Title Z in Excel Sheet : 26

----------------Test Case 2-----------------
Title CUZ in Excel Sheet : 2600

----------------Test Case 3-----------------
Title CY in Excel Sheet : 103

----------------Test Case 4-----------------
Title ANH in Excel Sheet : 1048

----------------Test Case 5-----------------
Title AX in Excel Sheet : 50


 */
