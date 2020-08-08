package com.interview.leetcode;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-----------------");
		int n = 50;
		System.out.println("Integer Number "+n +" in Excel Sheet : "+convertToTitle(n));
		System.out.println();
		
		System.out.println("----------------Test Case 2-----------------");
		n = 1048;
		System.out.println("Integer Number "+n +" in Excel Sheet : "+convertToTitle(n));
		System.out.println();
		
		System.out.println("----------------Test Case 3-----------------");
		n = 26;
		System.out.println("Integer Number "+n +" in Excel Sheet : "+convertToTitle(n));
		System.out.println();
		
		System.out.println("----------------Test Case 4-----------------");
		n = 2600;
		System.out.println("Integer Number "+n +" in Excel Sheet : "+convertToTitle(n));
		System.out.println();
		
		System.out.println("----------------Test Case 5-----------------");
		n = 103;
		System.out.println("Integer Number "+n +" in Excel Sheet : "+convertToTitle(n));
		System.out.println();

	}
	
	public static String convertToTitle(int n) {
		int num = n;
		StringBuilder sb = new StringBuilder();
		while(num > 0) {
			int rem = num % 26;
			num = num/26;
			if(rem == 0)
				num--;
			sb.append(intToChar(rem));
		}
		sb.reverse();
		return sb.toString();
		
		
        
    }
	
	public static char intToChar(int n ) {
		int rem = (char)(n%26 + 64);
		if(rem == 64)
			rem = 26+64;
		return (char)rem;
	}

}

/*
----------------Test Case 1-----------------
Integer Number 50 in Excel Sheet : AX

----------------Test Case 2-----------------
Integer Number 1048 in Excel Sheet : ANH

----------------Test Case 3-----------------
Integer Number 26 in Excel Sheet : Z

----------------Test Case 4-----------------
Integer Number 2600 in Excel Sheet : CUZ

----------------Test Case 5-----------------
Integer Number 103 in Excel Sheet : CY


 * */
