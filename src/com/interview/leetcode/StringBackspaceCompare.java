package com.interview.leetcode;

import java.util.Stack;

public class StringBackspaceCompare {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1------------------");
		String S = "ab##";
		String T = "c#d#";
		boolean equals = backspaceCompare(S, T);
		System.out.println("Are String "+S+" and "+T+" Equal ? "+equals);
		System.out.println();
		
		System.out.println("------------------Test Case 2------------------");
		S = "a##c";
		T = "#a#c";
		equals = backspaceCompare(S, T);
		System.out.println("Are String "+S+" and "+T+" Equal ? "+equals);
		System.out.println();
		
		System.out.println("------------------Test Case 3------------------");
		S = "a#c";
		T = "b";
		equals = backspaceCompare(S, T);
		System.out.println("Are String "+S+" and "+T+" Equal ? "+equals);
		System.out.println();
		
		System.out.println("------------------Test Case 4------------------");
		S = "#bri#ijes#sh";
		T = "###brije##jesh#h";
		equals = backspaceCompare(S, T);
		System.out.println("Are String "+S+" and "+T+" Equal ? "+equals);
		
		

	}
	
	 public static boolean backspaceCompare(String S, String T) {
	     Stack<Character> stackS = new Stack<Character>();   
	     Stack<Character> stackT = new Stack<Character>();
	     
	     for(char c : S.toCharArray()) {
	    	 if(c != '#') {
	    		 stackS.push(c);
	    	 }
	    	 else if(!stackS.isEmpty()){
	    		 stackS.pop();
	    	 }
	     }
	     
	     for(char c : T.toCharArray()) {
	    	 if(c != '#') {
	    		 stackT.push(c);
	    	 }
	    	 else if(!stackT.isEmpty()){
	    		 stackT.pop();
	    	 }
	     }
	     
	     if(stackS.size() != stackT.size()) {
	    	 return false;
	     }
	     
	     while(!stackS.isEmpty()) {
	    	 if(stackS.pop() != stackT.pop()) {
	    		 return false;
	    	 }
	     }
	     
	     
		return true;
		 
	}

}

/*
 ------------------Test Case 1------------------
Are String ab## and c#d# Equal ? true

------------------Test Case 2------------------
Are String a##c and #a#c Equal ? true

------------------Test Case 3------------------
Are String a#c and b Equal ? false

------------------Test Case 4------------------
Are String #bri#ijes#sh and ###brije##jesh#h Equal ? true
 */
