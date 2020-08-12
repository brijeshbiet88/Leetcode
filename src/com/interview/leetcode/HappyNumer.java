package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumer {

	public static void main(String[] args) {
		System.out.println("---------------Test Case1---------------");
		int n = 19;
		boolean isHappyNumber = isHappy(n);
		System.out.println("Is Number "+n+" a Happy Number : "+isHappyNumber);
		System.out.println();
		
		System.out.println("---------------Test Case1---------------");
		n = 74111;
		isHappyNumber = isHappy(n);
		System.out.println("Is Number "+n+" a Happy Number : "+isHappyNumber);
		System.out.println();
		
		System.out.println("---------------Test Case1---------------");
		n = 20;
		isHappyNumber = isHappy(n);
		System.out.println("Is Number "+n+" a Happy Number : "+isHappyNumber);
		System.out.println();

	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet();
		int sum = 0;
		while(sum != 1) {
			
			while(n != 0) {
				sum += Math.pow(n%10 , 2);
				n /= 10;
			}
			
			if(sum == 1)
				return true;
			
			if(set.contains(sum)) {
				return false;
			}
			set.add(sum);
			n = sum;
			sum = 0;
			
		}
		
		
		return false;
    }
}
/*
---------------Test Case1---------------
Is Number 19 a Happy Number : true

---------------Test Case1---------------
Is Number 74111 a Happy Number : true

---------------Test Case1---------------
Is Number 20 a Happy Number : false

 * */
