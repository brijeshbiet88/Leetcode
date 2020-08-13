package com.interview.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println("-----------Test Case 1------------");
		String s = "Hello World";
		System.out.println("Length of last word in string "+s+" is : "+lengthOfLastWord(s));
		System.out.println();
		
		System.out.println("-----------Test Case 2------------");
		s = "HelloWorld";
		System.out.println("Length of last word in string "+s+" is : "+lengthOfLastWord(s));
		System.out.println();
		
		System.out.println("-----------Test Case 3------------");
		s = "Hello world !";
		System.out.println("Length of last word in string "+s+" is : "+lengthOfLastWord(s));
		System.out.println();
		
		System.out.println("-----------Test Case 4------------");
		s = "";
		System.out.println("Length of last word in string "+s+" is : "+lengthOfLastWord(s));
		System.out.println();
		
		System.out.println("-----------Test Case 5------------");
		s = "abc ";
		System.out.println("Length of last word in string "+s+" is : "+lengthOfLastWord(s));
		System.out.println();
	}

	 public static int lengthOfLastWord(String s) {
	        int len = 0;
	        s = s.trim();
	        int lastSpaceIndex = s.lastIndexOf(" ");
	        if(lastSpaceIndex != -1) {
	        	len = s.length() - lastSpaceIndex-1;
	        }else {
	        	len = s.length();
	        }
	        
	        return len;
	 }
}
/*
 * -----------Test Case 1------------
Length of last word in string Hello World is : 5

-----------Test Case 2------------
Length of last word in string HelloWorld is : 10

-----------Test Case 3------------
Length of last word in string Hello world ! is : 1

-----------Test Case 4------------
Length of last word in string  is : 0

-----------Test Case 5------------
Length of last word in string abc  is : 3


 * */
