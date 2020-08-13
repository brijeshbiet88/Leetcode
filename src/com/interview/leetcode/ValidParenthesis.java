package com.interview.leetcode;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1--------------");
		String s = "[({})]";
		System.out.println("Expression "+s+" is Valid ? "+isValid(s));
		System.out.println();
		
		System.out.println("-------------Test Case 2--------------");
		s = "[]{}()";
		System.out.println("Expression "+s+" is Valid ? "+isValid(s));
		System.out.println();
		
		System.out.println("-------------Test Case 3--------------");
		s = "[]{}(])";
		System.out.println("Expression "+s+" is Valid ? "+isValid(s));
		System.out.println();
		
		System.out.println("-------------Test Case 4--------------");
		s = "[]{)(}";
		System.out.println("Expression "+s+" is Valid ? "+isValid(s));
		System.out.println();
		
		System.out.println("-------------Test Case 5--------------");
		s = ")(";
		System.out.println("Expression "+s+" is Valid ? "+isValid(s));
		System.out.println();

	}
	
	public static  boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ;i < s.length() ; i++) {
		 char c = s.charAt(i);
			if(c =='(' || c == '[' || c == '{') {
				stack.push(c);
			}
			
			if(c ==')' || c == ']' || c == '}') {
				if(!stack.isEmpty() && isMatchingPair(c , stack.peek()))
					stack.pop();
				else return false;
			}
		}
		return stack.isEmpty() == true ? true : false;
        
    }

	private static boolean isMatchingPair(char c, Character d) {
		if(c== ')' && d == '(') {
			return true;
		}
		
		if(c== '}' && d == '{') {
			return true;
		}
		
		if(c== ']' && d == '[') {
			return true;
		}
		
		return false;
	}

}
/*
 -------------Test Case 1--------------
Expression [({})] is Valid ? true

-------------Test Case 2--------------
Expression []{}() is Valid ? true

-------------Test Case 3--------------
Expression []{}(]) is Valid ? false

-------------Test Case 4--------------
Expression []{)(} is Valid ? false

-------------Test Case 5--------------
Expression )( is Valid ? false


 */
