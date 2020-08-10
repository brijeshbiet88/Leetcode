package com.interview.leetcode;

public class AddStrings {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------");
		String num1 = "9";
		String num2 = "9";
		String product = addString(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" = "+product);
		
		System.out.println("------------------Test Case 2---------------");
		num1 = "19";
		num2 = "81";
		product = addString(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" = "+product);
		
		System.out.println("------------------Test Case 3---------------");
		num1 = "145359";
		num2 = "85551";
		product = addString(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" = "+product);
		
		System.out.println("------------------Test Case 4---------------");
		num1 = "17567";
		num2 = "84351";
		product = addString(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" = "+product);
		
		System.out.println("------------------Test Case 5---------------");
		num1 = "199";
		num2 = "98790";
		product = addString(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" = "+product);

	}
	
	public static String addString(String num1, String num2) {
        StringBuilder addition = new StringBuilder();
        
        num1 = reverseNum(num1);
        num2 = reverseNum(num2);
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        int currentAdd = 0;
        int len = len1 < len2 ? len1 : len2;
        
        for(int i = 0 ; i < len ; i++) {
        	currentAdd = carry + (num1.charAt(i)-'0') + (num2.charAt(i)-'0');
        	addition.append(currentAdd%10);
        	carry = currentAdd/10;
        }
        
        
        if(len1 < len2){
        	for(int i = len ; i < len2 ; i++) {
        		if(carry != 0) {
        			int sum = carry + num2.charAt(i) - '0';
        			carry = sum / 10;
        			addition.append(sum%10);
        		}
        		else {
        			addition.append(num2.charAt(i));
        		}
        	}
        }
        else if(len1 >= len2){
        	for(int i = len; i < len1 ; i++) {
        		if(carry != 0) {
        			int sum = carry + num1.charAt(i) - '0';
        			carry = sum / 10;
        			addition.append(sum%10);
        		}
        		else {
        			addition.append(num1.charAt(i));
        		}
        	}
        }
        
        if(carry != 0) {
        	addition.append(carry);
        }
        
        
       return addition.reverse().toString();
    }

	private static String reverseNum(String num1) {
		return new StringBuilder(num1).reverse().toString();
	}

}
/*
 ------------------Test Case 1---------------
Sum of 9 & 9 = 18
------------------Test Case 2---------------
Sum of 19 & 81 = 100
------------------Test Case 3---------------
Sum of 145359 & 85551 = 230910
------------------Test Case 4---------------
Sum of 17567 & 84351 = 101918
------------------Test Case 5---------------
Sum of 199 & 98790 = 98989

 */
