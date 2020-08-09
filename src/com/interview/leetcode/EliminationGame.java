package com.interview.leetcode;

import java.util.LinkedList;
import java.util.List;

public class EliminationGame {

	public static void main(String[] args) {
		int n = 10;
        System.out.println("Remaining Number : "+lastRemaining(n));
	}
	
	 public static int lastRemaining(int n) {
	        List<Integer> list = new LinkedList<Integer>();
	        int start =1 , d = 1 , last = n ;
	        
	        boolean ltor = true;
	        while(start != last) {
	        	if(ltor) {
	        		start = start + d;
	        		d++;
	        		if(start == last)
	        			return last;
	        		if((start + last) % d  ==1) {
	        			last--;
	        		}
	        	}
	        }
			return last;
	        
	        
	        
	 }

}
