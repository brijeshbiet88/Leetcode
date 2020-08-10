package com.interview.leetcode;

public class MultiplyString {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------");
		String num1 = "9";
		String num2 = "9";
		String product = multiply(num1, num2);
		System.out.println("Product of "+num1+" & "+num2+" = "+product);
		

	}
	
	public static String multiply(String num1, String num2) {
		if(num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		StringBuilder result = new StringBuilder("");
        String summation = "";
        int currentProd = 0;
        int currentCarry = 0;
        int count = 0;
        int multipleOf10 = 0;
        for(int i = num1.length() -1 ; i >= 0 ; i--) {
        	StringBuilder productSb = new StringBuilder();
        		while(multipleOf10 < count) {
        			productSb.append("0");
        			multipleOf10++;
        		}
        	for(int j = num2.length()-1 ; j >= 0 ; j--) {
        		currentProd = (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + currentCarry;
        		productSb.append(currentProd%10);
        		currentCarry = currentProd/10;
        	}
        	if(currentCarry != 0) {
        		productSb.append(currentCarry);
        		currentCarry = 0;
        	}
        	summation = add(summation, productSb.reverse().toString());
        	count++;
        	multipleOf10 = 0;
        }
        
        if(currentCarry != 0) {
        	result.append(currentCarry);
        }
        result.append(summation);
        
        return result.toString();
    }
	
	
	public static String add(String num1, String num2) {
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
