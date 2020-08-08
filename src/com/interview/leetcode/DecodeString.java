package com.interview.leetcode;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		System.out.println("---------Test Case 1----------");
		String s1 = "3[a2[c]]";
		System.out.println("Decoded String for Code "+s1+" is : "+decodeString(s1));
		System.out.println();
		
		System.out.println("---------Test Case 2----------");
		s1 = "3[a]2[bc]";
		System.out.println("Decoded String for Code "+s1+" is : "+decodeString(s1));
		System.out.println();
		
		System.out.println("---------Test Case 3----------");
		s1 = "2[abc]3[cd]ef";
		System.out.println("Decoded String for Code "+s1+" is : "+decodeString(s1));
		System.out.println();
		
		System.out.println("---------Test Case 4----------");
		s1 = "3[a]2[b4[F]c]";
		System.out.println("Decoded String for Code "+s1+" is : "+decodeString(s1));
		System.out.println();
		
		System.out.println("---------Test Case 5----------");
		s1 = "10[ac]";
		System.out.println("Decoded String for Code "+s1+" is : "+decodeString(s1));
		System.out.println();
		
	}

	public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int bracketCount = 0;
        StringBuilder bs = new StringBuilder();
        for(char c : s.toCharArray()) {
        	stack.add(c);
        }
        StringBuilder decodedString =new StringBuilder();
        Stack<Character> bracket = new Stack<Character>();
        
        while(!stack.isEmpty()) {
        	char c = stack.pop();
        	if(c != ']') {
        		decodedString.append(c);
        	}
        	else {
        		bracketCount++;
        		bracket.add(c);
        		while(bracketCount != 0) {
        			c = stack.pop();
        			if(c == ']') {
        				bracket.add(c);
        				bracketCount++;
        				if(bs.length() > 0) {
        					decodedString.append(bs);
        					bs.replace(0, bs.length(), "");
        				}
        			}
        			else if(c == '[') {
        				bracket.pop(); 
        				bracketCount--;
        				char ch = stack.pop();
        				StringBuilder numSb = new StringBuilder();
        				numSb.append(ch);
        				while(!stack.isEmpty()) {
        					 ch = stack.peek();
        					if(ch >= '0' && ch <= '9') {
        						numSb.append(ch);
        						stack.pop();
        					}
        					else {
        						break;
        					}
        				}
        				
        				String bracketString = bs.toString();
        				bs.replace(0, bs.length(), "");
        				int num = Integer.parseInt(numSb.reverse().toString());
        				while(num != 0) {
        					num--;
        					bs.append(bracketString);
        				}
        				bracketString = null;
        			}
        			else {
        				bs.append(c);
        			}
        		}
        		
        		decodedString.append(bs);
        		bs.replace(0, bs.length(), "");
        		
        	}
        }
     
        
        
        return decodedString.reverse().toString();
	}
}
