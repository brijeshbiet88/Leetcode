package com.interview.leetcode;

public class LongPressedName {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1---------------");
		String  name  = "leelee";
		String typed  = "lleeeleee";
		boolean isCorrect = isLongPressedName(name, typed);
		System.out.println("Name :"+name+" , Typed Name : "+typed+" Are Same ? "+isCorrect);
		System.out.println();
		
		System.out.println("--------------Test Case 2---------------");
		name  = "";
		typed  = "a";
		isCorrect = isLongPressedName(name, typed);
		System.out.println("Name :"+name+" , Typed Name : "+typed+" Are Same ? "+isCorrect);
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
		name  = "saeed";
		typed  = "ssaaedd";
		isCorrect = isLongPressedName(name, typed);
		System.out.println("Name :"+name+" , Typed Name : "+typed+" Are Same ? "+isCorrect);
		System.out.println();
		
		System.out.println("--------------Test Case 4---------------");
		name  = "pyplrz";
		typed  = "ppyypllr";
		isCorrect = isLongPressedName(name, typed);
		System.out.println("Name :"+name+" , Typed Name : "+typed+" Are Same ? "+isCorrect);
		System.out.println();
		
		System.out.println("--------------Test Case 5---------------");
		name  = "a";
		typed  = "ab";
		isCorrect = isLongPressedName(name, typed);
		System.out.println("Name :"+name+" , Typed Name : "+typed+" Are Same ? "+isCorrect);
		System.out.println();
		
	}
	
	public static boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)) {
        	return true;
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 0 , j = 0;
        while(i < name.length() && j < typed.length()) {
        	char nameChar = name.charAt(i);
        	char typedChar = typed.charAt(j);
        	if(nameChar == typedChar) {
        		sb.append(nameChar);
        		i++;
        		j++;
        	}
        	else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)){
        		j++;
        	}else {
        		return false;
        	}
        	
        }
        
        while(j > 0 && j < typed.length() ) {
        	if(typed.charAt(j) != typed.charAt(j-1)) {
        		return false;
        	}
        	if(j == 0) {
        		return false;
        	}
        	j++;
        }
        
		return sb.toString().equals(name) ? true : false;
        
    }

}
/*
 *--------------Test Case 1---------------
Name :leelee , Typed Name : lleeeleee Are Same ? true

--------------Test Case 2---------------
Name : , Typed Name : a Are Same ? true

--------------Test Case 3---------------
Name :saeed , Typed Name : ssaaedd Are Same ? false

--------------Test Case 4---------------
Name :pyplrz , Typed Name : ppyypllr Are Same ? false

--------------Test Case 5---------------
Name :a , Typed Name : ab Are Same ? false
 
 */
