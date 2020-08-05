package com.interview.leetcode;

public class JewelsAndStones {

	public static void main(String[] args) {
	String S = "aAAbbbb";
	String J = "aA";
	int noOfJewels = numJewelsInStones(J, S);
	System.out.println("No of Jewels : "+noOfJewels);

	}

	public static int numJewelsInStones(String J, String S) {
        int noOfJewels = 0;
        for(int i = 0 ; i < J.length(); i++) {
        	noOfJewels += S.length() - S.replaceAll(String.valueOf(J.charAt(i)),"" ).length();
        }
        return noOfJewels;
    }
}
