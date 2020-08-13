package com.interview.leetcode;

public class ZigzagConversion {

	public static void main(String[] args) {
		System.out.println("------------Test Case 1------------");
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String zigzag = convert(s, numRows);
		System.out.println("Zigzag String for "+s+" is : "+zigzag);
		System.out.println();
		
		System.out.println("------------Test Case 2------------");
		s = "PAYPALISHIRING";
		numRows = 4;
		zigzag = convert(s, numRows);
		System.out.println("Zigzag String for "+s+" is : "+zigzag);
		System.out.println();
		
		System.out.println("------------Test Case 3------------");
		s = "AB";
		numRows = 1;
		zigzag = convert(s, numRows);
		System.out.println("Zigzag String for "+s+" is : "+zigzag);
		System.out.println();
		
		System.out.println("------------Test Case 4------------");
		s = "";
		numRows = 1;
		zigzag = convert(s, numRows);
		System.out.println("Zigzag String for "+s+" is : "+zigzag);
		System.out.println();
	}
	
	public static String convert(String s, int numRows) {
		StringBuilder result = new StringBuilder("");
		StringBuilder[] sb = new StringBuilder[numRows];
		int i = 0 , j = 0;
		boolean topDown = true;
		if(numRows == 1)
			return s;
		
		while (j < s.length()) {
			if(topDown) {
					if(sb[i] == null) {
						sb[i] = new StringBuilder();
					}
					sb[i].append(s.charAt(j++));
					i++;
					
				if(i % numRows == 0) {
					topDown = !topDown;
					i = i-2;
				}
			}
			else {
				sb[i].append(s.charAt(j++));
				i--;
			}
			if(i % numRows == -1) {
				topDown = !topDown;
				i = i+2;
			}
		}
		for(StringBuilder sbl : sb) {
			if(sbl != null)
			result.append(sbl);
		}
		
		return result.toString();
	}

}
/*
------------Test Case 1------------
Zigzag String for PAYPALISHIRING is : PAHNAPLSIIGYIR

------------Test Case 2------------
Zigzag String for PAYPALISHIRING is : PINALSIGYAHRPI

------------Test Case 3------------
Zigzag String for AB is : AB

------------Test Case 4------------
Zigzag String for  is : 


 * */
