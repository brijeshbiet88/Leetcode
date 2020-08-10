package com.interview.leetcode;

public class IntToRoman {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case1-------------------");
		int num = 2994;
		String roman = intToRoman(num);
		System.out.println("Roman Representation of num :"+num+" is "+roman);
		System.out.println();
		
		System.out.println("-------------------Test Case2-------------------");
		num = 3976;
		roman = intToRoman(num);
		System.out.println("Roman Representation of num :"+num+" is "+roman);
		System.out.println();

		System.out.println("-------------------Test Case3-------------------");
		num = 1474;
		roman = intToRoman(num);
		System.out.println("Roman Representation of num :"+num+" is "+roman);
		System.out.println();
		
		System.out.println("-------------------Test Case4-------------------");
		num = 3934;
		roman = intToRoman(num);
		System.out.println("Roman Representation of num :"+num+" is "+roman);
		System.out.println();
		
		System.out.println("-------------------Test Case5-------------------");
		num = 1234;
		roman = intToRoman(num);
		System.out.println("Roman Representation of num :"+num+" is "+roman);
		System.out.println();
	}
	
	 public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		if(num >= 1000) {
			int frequency = num /1000;
			num = num - frequency*1000;
			for(int i = 0 ; i < frequency; i++) {
				sb.append("M");
			}
		 }
		
		if(num >= 900) {
			num = num - 900;
			sb.append("CM");
		}

		if(num >= 500) {
			num = num - 500;
			sb.append("D");
		}
		
		if(num >= 400) {
			num = num - 400;
			sb.append("CD");
		}
		
		if(num >= 100) {
			int frequency = num /100;
			num = num - frequency*100;
			for(int i = 0 ; i < frequency; i++) {
				sb.append("C");
			}
		 }

		if(num >= 90) {
			num = num - 90;
			sb.append("XC");
		}

		if(num >= 50) {
			num = num - 50;
			sb.append("L");
		}

		if(num >= 40) {
			num = num - 40;
			sb.append("XL");
		}
		
		if(num >= 10) {
			int frequency = num /10;
			num = num - frequency*10;
			for(int i = 0 ; i < frequency; i++) {
				sb.append("X");
			}
		 }
		
		if(num >= 9) {
			num = num - 9;
			sb.append("IX");
		}

		if(num >= 5) {
			num = num - 5;
			sb.append("V");
		}

		if(num >= 4) {
			num = num - 4;
			sb.append("IV");
		}
		
		if(num >= 1) {
			int frequency = num ;
			num = 0;
			for(int i = 0 ; i < frequency; i++) {
				sb.append("I");
			}
		 }
		
		return sb.toString();
	        
	 }

}

/*
-------------------Test Case1-------------------
Roman Representation of num :2994 is MMCMXCIV

-------------------Test Case2-------------------
Roman Representation of num :3976 is MMMCMLXXVI

-------------------Test Case3-------------------
Roman Representation of num :1474 is MCDLXXIV

-------------------Test Case4-------------------
Roman Representation of num :3934 is MMMCMXXXIV

-------------------Test Case5-------------------
Roman Representation of num :1234 is MCCXXXIV

 * */
