package com.interview.leetcode;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1---------------");
		String roman = "MMCMXCIV";
		int decimal = romanToInt(roman);
	    System.out.println("Decimal Representation of Roman :"+roman+" is : "+decimal);
	    System.out.println();

	    System.out.println("----------------Test Case 2---------------");
		roman = "DLIV";
		decimal = romanToInt(roman);
		System.out.println("Decimal Representation of Roman :"+roman+" is : "+decimal);
	    System.out.println();

	    System.out.println("----------------Test Case 3---------------");
		roman = "CLIV";
		decimal = romanToInt(roman);
		System.out.println("Decimal Representation of Roman :"+roman+" is : "+decimal);
	    System.out.println();
	    
	    System.out.println("----------------Test Case 4---------------");
		roman = "X";
		decimal = romanToInt(roman);
		System.out.println("Decimal Representation of Roman :"+roman+" is : "+decimal);
	    System.out.println();
	    
	    System.out.println("----------------Test Case 5---------------");
		roman = "IV";
		decimal = romanToInt(roman);
		System.out.println("Decimal Representation of Roman :"+roman+" is : "+decimal);
	    System.out.println();
	    
	    
	}

	public static int romanToInt(String s) {
		int decimal = 0;
		for(int i = 0 ; i < s.length()-1 ; i++) {
			char c = s.charAt(i);
			int num = getIntFromChar(c);
			if(num < getIntFromChar(s.charAt(i+1))) {
				decimal = decimal - num;
			}else {
				decimal = decimal + num;
			}
		}
		
		decimal += getIntFromChar(s.charAt(s.length()-1));
		
		return decimal;
    }

	private static int  getIntFromChar(char c) {
		
		switch(c) {
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;	
		}
		return 0;
		
	}
	
	
}

/*
----------------Test Case 1---------------
Decimal Representation of Roman :MCMXCIV is : 1994

----------------Test Case 2---------------
Decimal Representation of Roman :DLIV is : 554

----------------Test Case 3---------------
Decimal Representation of Roman :CLIV is : 154

----------------Test Case 4---------------
Decimal Representation of Roman :X is : 10

----------------Test Case 5---------------
Decimal Representation of Roman :IV is : 4


 * */
