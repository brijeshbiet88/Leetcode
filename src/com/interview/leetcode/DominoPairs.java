package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DominoPairs {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1--------------");
		int [][] dominoes = {
							{1 ,2},
							{1 ,1},
							{1 ,1},
							{3 ,4}
							};
		
		System.out.println("No Of Equivalent Domino Pairs : "+numEquivDominoPairs(dominoes));
		System.out.println();
		
		System.out.println("--------------Test Case 2--------------");
		int [][] dominoes2 = {
							{1 ,2},
							{2 ,1},
							{2 ,1},
							{2 ,1}
							};
		
		System.out.println("No Of Equivalent Domino Pairs : "+numEquivDominoPairs(dominoes2));
		System.out.println();
		
		System.out.println("--------------Test Case 3--------------");
		int [][] dominoes3 = {
							{1 ,2},
							{2 ,1},
							{4 ,6},
							{3 ,4}
							};
		
		System.out.println("No Of Equivalent Domino Pairs : "+numEquivDominoPairs(dominoes3));
		System.out.println();
		
		System.out.println("--------------Test Case 4--------------");
		int [][] dominoes4 = {
							{2 ,1},
							{1 ,2},
							{1 ,2},
							{1 ,2},
							{2 ,1},
							{1 ,1},
							{1 ,2},
							{2 ,2}
							};
		
		System.out.println("No Of Equivalent Domino Pairs : "+numEquivDominoPairs(dominoes4));
		System.out.println();

	}
	
	 public static int numEquivDominoPairs(int[][] dominoes) {
			int noOfDominoPairs = 0;
			Map<String , Integer> map = new HashMap<>();
			for(int i = 0 ; i < dominoes.length; i++) {
				String pairString = dominoes[i][0]+","+dominoes[i][1];
				String revpairString = dominoes[i][1]+","+dominoes[i][0];
				if(map.get(pairString) != null || map.get(revpairString) != null) {
					noOfDominoPairs += map.get(pairString);
					map.put(pairString, map.get(pairString)+ 1);
					if(!pairString.equals(revpairString))
					map.put(revpairString, map.get(revpairString)+ 1);
			}
		
				else {
					map.put(pairString, 1);
					map.put(revpairString, 1);
				}
			}
			
			return noOfDominoPairs;
		        
		 }
	
	 public static int numEquivDominoPairs2(int[][] dominoes) {
		int noOfDominoPairs = 0;
		
		for(int i = 0 ; i < dominoes.length-1 ; i++) {
			for(int j = i+1 ; j < dominoes.length ; j++) {
			if(dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) {
				noOfDominoPairs++;
			}
			else if(dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0]) {
				noOfDominoPairs++;
			}
			}
		}
		
		
		return noOfDominoPairs;
	        
	 }

}

/*
--------------Test Case 1--------------
No Of Equivalent Domino Pairs : 1

--------------Test Case 2--------------
No Of Equivalent Domino Pairs : 6

--------------Test Case 3--------------
No Of Equivalent Domino Pairs : 1

--------------Test Case 4--------------
No Of Equivalent Domino Pairs : 15


 * */
