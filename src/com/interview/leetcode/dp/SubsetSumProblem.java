package com.interview.leetcode.dp;

public class SubsetSumProblem {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1-------------------------");
		int [] a = {2 , 3 , 7 , 8 ,10};
		int target = 11;
		System.out.println("Is there a Subset with Sum "+target+" ? "+subsetSum(a, target));
		System.out.println();
		
		System.out.println("------------------Test Case 2-------------------------");
		target = 6;
		System.out.println("Is there a Subset with Sum "+target+" ? "+subsetSum(a, target));
		System.out.println();
		
		System.out.println("------------------Test Case 3-------------------------");
		target = 20;
		System.out.println("Is there a Subset with Sum "+target+" ? "+subsetSum(a, target));
		System.out.println();

	}

	public static boolean subsetSum(int[] a, int target) {
		int n = a.length;
		boolean[][] T = new boolean[n + 1][target + 1];

		for (int i = 0; i <= n; i++) {
			T[i][0] = true;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= target; j++) {
				int num = a[i];
				if (j >= num) {
					if (T[i][j] == true) {
						T[i+1][j] = true;
					} else {
						T[i+1][j] = T[i][j - num];
					}
				} else {

					T[i+1][j] = T[i][j];
				}

			}
		}

		return T[n][target];

	}
}
