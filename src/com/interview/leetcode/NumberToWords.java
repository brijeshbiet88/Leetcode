package com.interview.leetcode;

public class NumberToWords {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1--------------");
		int num = 21934;
		String word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();
		
		System.out.println("---------------Test Case 2--------------");
		num = 7110;
		word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();
		
		System.out.println("---------------Test Case 3--------------");
		num = 999;
		word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();
		
		System.out.println("---------------Test Case 4--------------");
		num = 100000;
		word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();
		
		System.out.println("---------------Test Case 5--------------");
		num = 10000;
		word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();
		
		System.out.println("---------------Test Case 6--------------");
		num = 2147483647;
		word = numberToWords(num);
		System.out.println("Number : "+num+" in words : "+word);
		System.out.println();

	}
	
	public static String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		StringBuilder word = new StringBuilder();
		String multipleString = null;

		String numString = String.valueOf(num);
		int numLen = numString.length();

		if (numString.length() > 9) {
				multipleString = numString.substring(0, numString.length() - 9);
				String currentWord = assignNumberAsWord(multipleString);
				if (!currentWord.trim().isEmpty()) {
					word.append(currentWord);
					word.append("Billion ");
				}
				numString = numString.substring(numLen - 9, numLen);
		}

		if (numString.length() > 6) {
			multipleString = numString.substring(0, numString.length() - 6);
			String currentWord = assignNumberAsWord(multipleString);
			if (!currentWord.trim().isEmpty()) {
				word.append(currentWord);
				word.append("Million ");
			}
			numString = numString.substring(numString.length() - 6, numString.length());
		}

		if (numString.length() > 3) {
			multipleString = numString.substring(0, numString.length() - 3);
			String currentWord = assignNumberAsWord(multipleString);
			if (!currentWord.trim().isEmpty()) {
				word.append(currentWord);
				word.append("Thousand ");
			}

			numString = numString.substring(numString.length() - 3, numString.length());
		}
		if (numString.length() <= 3) {
			word.append(assignNumberAsWord(numString));
		}

		return word.toString().trim();

	}

	private static String assignNumberAsWord(String str) {
		StringBuilder sb = new StringBuilder();
		String [] singleDigits = {"","One " , "Two " , "Three " , "Four " , "Five " , "Six " , "Seven " , "Eight " , "Nine "};
		String [] doubleDigits = {"","Eleven ","Twelve " , "Thirteen " , "Fourteen " , "Fifteen " , "Sixteen " , "Seventeen " , "Eighteen " , "Nineteen "};
		String [] doubleDigitsWithZero = {"Ten ","Twenty " , "Thirty " , "Forty " , "Fifty " , "Sixty " , "Seventy " , "Eighty " , "Ninety "};
		
		
		int len = str.length(); 
		
		if(len == 3) {
			if(str.charAt(0) != '0') {
			sb.append(singleDigits[str.charAt(0) - '0']);
			sb.append("Hundred ");
			}
			str = str.substring(1);
			len--;
		}
		
		if(len == 2) {
			if(str.charAt(0) == '0' && str.charAt(1) == '0') {
				sb.append("");
			}
			else if(str.charAt(0) == '0') {
				sb.append(singleDigits[str.charAt(1)-'0']);
			}else if(str.charAt(1) == '0'){
				sb.append(doubleDigitsWithZero[str.charAt(0)-'1']);
			}
			else if(str.charAt(0) < '2' && str.charAt(1) != '0') {
				int num = Integer.parseInt(str); 
				sb.append(doubleDigits[num - 10]);
			}
			else if(str.charAt(0) >= '2' && str.charAt(1) != '0') {
				sb.append(doubleDigitsWithZero[str.charAt(0)-'1']);
	            str = str.substring(1);
	            len--;
			}
			
		}
		
		if(len == 1) {
			sb.append(singleDigits[str.charAt(0)-'0']);
		}
		return sb.toString();
		
		
	}

}
/*
---------------Test Case 1--------------
Number : 2147483647 in words : Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven

---------------Test Case 2--------------
Number : 7110 in words : Seven Thousand One Hundred Ten

---------------Test Case 3--------------
Number : 999 in words : Nine Hundred Ninety Nine

---------------Test Case 4--------------
Number : 100000 in words : One Hundred Thousand

---------------Test Case 5--------------
Number : 10000 in words : Ten Thousand

---------------Test Case 6--------------
Number : 2147483647 in words : Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven

 * */
