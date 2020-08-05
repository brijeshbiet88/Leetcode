package com.interview.leetcode;

public class FindingComplement {

	public static void main(String[] args) {
		System.out.println("------------Test Case 1---------------");
		int n = 5;
		System.out.println("Binary Complement of "+n +" is : "+findComplement(n));
		System.out.println();
		
		System.out.println("------------Test Case 2---------------");
		n = 2;
		System.out.println("Binary Complement of "+n +" is : "+findComplement(n));
		System.out.println();

	}
	
	public static int findComplement(int n) {
		String binaryStr = Integer.toBinaryString(n);
		int complement = 0;
		int power = 1;
		for(int i = binaryStr.length()-1 ; i >= 0;i--) {
			if(binaryStr.charAt(i) == '0') {
				complement += 1*power;
			}
			power = 2*power;
		}
		return complement;
		
	}

}
