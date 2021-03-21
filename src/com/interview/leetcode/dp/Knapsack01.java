package com.interview.leetcode.dp;

public class Knapsack01 {

	public static void main(String[] args) {
		System.out.println("------------------Test case 1-------------------");
		int [] wt  = {1 , 3 , 4 , 5};
		int [] val = {1 , 4 , 5 , 7};
		int W = 8;
		System.out.println("Max Value With Given Weight = "+knapsack01(wt, val, W));
		System.out.println();
		
		System.out.println("------------------Test case 2-------------------");
		int [] wt2  = {1 , 3 , 4 , 5 , 6 , 7 , 8};
		int [] val2 = {3 , 4 , 5 , 7 , 12 , 8  , 9};
		W = 11;
		System.out.println("Max Value With Given Weight = "+knapsack01(wt2, val2, W));
		System.out.println();
		
		System.out.println("------------------Test case 3-------------------");
		W = 4;
		System.out.println("Max Value With Given Weight = "+knapsack01(wt2, val2, W));
		System.out.println();

	}

	public static int knapsack01(int wt[], int val[], int W){
		int n1 = wt.length;
		
		
		int [][] T = new int [n1+1][W+1];
		
		for(int i = 0 ; i <= W ; i++) {
			T[0][i] = 0;
		}
		
		for(int i = 0 ; i <= n1 ; i++) {
			T[i][0] = 0;
		}
		
		for(int i = 0; i < n1 ; i++) {
			for(int j = 1 ; j <= W ; j++) {
				int weight = wt[i];
				
				if(j >= weight) {
					T[i+1][j] = Math.max(T[i][j], T[i][j-weight] + val[i]);
				}else {
					T[i+1][j] = T[i][j];
				}
			}
		}
		
		
		return T [n1][W];
	}
}

/*
 * ------------------Test case 1-------------------
Max Value With Given Weight = 11

------------------Test case 2-------------------
Max Value With Given Weight = 20

------------------Test case 3-------------------
Max Value With Given Weight = 7
 * */
