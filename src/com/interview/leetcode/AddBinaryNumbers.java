package com.interview.leetcode;

public class AddBinaryNumbers {

	public static void main(String[] args) {
		System.out.println("-------Test Case 1------------");
		String binary1 = "1101";
		String binary2 = "101";
		System.out.println("Result of Adding "+binary1+" and "+binary2+" = "+addBinary(binary1, binary2));
		
		System.out.println("-------Test Case 2------------");
		binary1 = "110111";
		binary2 = "10100";
		System.out.println("Result of Adding "+binary1+" and "+binary2+" = "+addBinary(binary1, binary2));
		
		System.out.println("-------Test Case 3------------");
		binary1 = "110111";
		binary2 = "1";
		System.out.println("Result of Adding "+binary1+" and "+binary2+" = "+addBinary(binary1, binary2));

	}

	public static String addBinary(String a, String b) {
		
		StringBuilder result = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() -1 ;
		int carry = 0;
		int sum = 0;
		while(i >= 0 || j >= 0) {
			sum = carry;
			if(i >= 0)
			sum += a.charAt(i--)-'0';
			if(j >= 0)
			sum += b.charAt(j--)-'0';
			result.append(sum%2);
			carry = sum/2;
		}
		if(carry != 0)
			result.append(carry);
		
		return result.reverse().toString();
   }
}
/*
-------Test Case 1------------
Result of Adding 1101 and 101 = 10010
-------Test Case 2------------
Result of Adding 110111 and 10100 = 1001011
-------Test Case 3------------
Result of Adding 110111 and 1 = 111000

 * */
