package com.interview.leetcode;

import java.util.Stack;

public class MakeStringGreat {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1-----------------");
		String s = "abBAcC";
		System.out.println("Great String of String "+s+" is : "+makeGood(s));
		System.out.println();
		
		System.out.println("-----------------Test Case 2-----------------");
		s = "LeEeetcode";
		System.out.println("Great String of String "+s+" is : "+makeGood(s));
		System.out.println();
		
		System.out.println("-----------------Test Case 3-----------------");
		s = "CreePpPpPpPppPp";
		System.out.println("Great String of String "+s+" is : "+makeGood(s));
		System.out.println();
		
		System.out.println("-----------------Test Case 4-----------------");
		s = "FfForevVveRrr";
		System.out.println("Great String of String "+s+" is : "+makeGood2(s));
		System.out.println();
		
		System.out.println("-----------------Test Case 5-----------------");
		s = "PPpromishHe";
		System.out.println("Great String of String "+s+" is : "+makeGood2(s));
		System.out.println();

	}
	
	public static String makeGood(String s) {
		if (s.isEmpty()) {
			return s;
		}
		boolean isGreat = true;
		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) >= 92 && s.charAt(i) <= 122 && s.charAt(i) - s.charAt(i + 1) == 32)
					|| s.charAt(i) >= 65 && s.charAt(i) <= 90 && s.charAt(i + 1) - s.charAt(i) == 32) {
				s = s.substring(0, i) + s.substring(i + 2, s.length());
				isGreat = false;
				break;
			}
		}

		if (isGreat)
			return s;

		else
			return makeGood(s);

	}
	
	public static String makeGood2(String s) {
		if (s.isEmpty()) {
			return s;
		}
		
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}
			else if(Math.abs(stack.peek()-s.charAt(i)) == 32){
					stack.pop();
			}
			else {
				stack.push(s.charAt(i));
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();

	}

}
/*
 -----------------Test Case 1-----------------
Great String of String abBAcC is : 

-----------------Test Case 2-----------------
Great String of String LeEeetcode is : Leetcode

-----------------Test Case 3-----------------
Great String of String CreePpPpPpPppPp is : Creep

-----------------Test Case 4-----------------
Great String of String FfForevVveRrr is : Forever

-----------------Test Case 5-----------------
Great String of String PPpromishHe is : Promise

 */
