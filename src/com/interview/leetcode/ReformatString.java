package com.interview.leetcode;

public class ReformatString {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------");
		String s = "ab123";
		String formattedStr = reformat(s);
		System.out.println("Formmated String for String "+s+" is : "+formattedStr);
		System.out.println();
		
		System.out.println("------------------Test Case 2---------------");
		s = "covid2019";
		formattedStr = reformat(s);
		System.out.println("Formmated String for String "+s+" is : "+formattedStr);
		System.out.println();
		
		System.out.println("------------------Test Case 3---------------");
		s = "brijesh";
		formattedStr = reformat(s);
		System.out.println("Formmated String for String "+s+" is : "+formattedStr);
		System.out.println();
		
		System.out.println("------------------Test Case 4---------------");
		s = "sona12";
		formattedStr = reformat(s);
		System.out.println("Formmated String for String "+s+" is : "+formattedStr);
		System.out.println();
		
		System.out.println("------------------Test Case 5---------------");
		s = "1942star";
		formattedStr = reformat(s);
		System.out.println("Formmated String for String "+s+" is : "+formattedStr);
		System.out.println();
	}

	public static String reformat(String s) {
		StringBuilder digits = new StringBuilder();
		StringBuilder chars = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		boolean digit = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits.append(ch);
			} else {
				chars.append(ch);
			}
		}

		if (Math.abs(digits.length() - chars.length()) > 1) {
			return "";
		}

		if (digits.length() > chars.length()) {
			digit = true;
		}
		int i = 0, j = 0;
		while (i < digits.length() || j < chars.length()) {

			if (digit) {
				sb.append(digits.charAt(i++));
				digit = !digit;
			} else {
				sb.append(chars.charAt(j++));
				digit = !digit;
			}

		}

		return sb.toString();
	}
}

/*
 * ------------------Test Case 1---------------
Formmated String for String ab123 is : 1a2b3

------------------Test Case 2---------------
Formmated String for String covid2019 is : c2o0v1i9d

------------------Test Case 3---------------
Formmated String for String brijesh is : 

------------------Test Case 4---------------
Formmated String for String sona12 is : 

------------------Test Case 5---------------
Formmated String for String 1942star is : s1t9a4r2

 * */