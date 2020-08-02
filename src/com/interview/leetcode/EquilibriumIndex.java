package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		System.out.println("--------Test Case 1---------");
		int [] a = {0 , -3 , 5 , -4 , -2 , 3 , 1 ,0};
		List<Integer> equilibriumIndices = findEquilibriumIndices(a , a.length);
		if(equilibriumIndices.size() > 0) {
			System.out.println("Equilibrium Indices : ");
			equilibriumIndices.forEach(System.out::println);
		}
		else {
			System.out.println("No Such Index Exists ");
		}
		equilibriumIndices.clear();
		
		
		System.out.println("--------Test Case 2---------");
		int [] b = {0 , 1 , 2 ,3 ,6 };
		equilibriumIndices = findEquilibriumIndices(b , b.length);
		if(equilibriumIndices.size() > 0) {
			System.out.println("Equilibrium Indices : ");
			equilibriumIndices.forEach(System.out::println);
		}
		else {
			System.out.println("No Such Index Exists ");
		}
	}

	private static List<Integer> findEquilibriumIndices(int[] a, int n) {
		List<Integer> equilibriumIndices = new ArrayList<>();
		int sum = 0, leftSum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		for (int i = 0; i < n; i++) {
			sum -= a[i];

			if (sum == leftSum) {
				equilibriumIndices.add(i);
			}

			leftSum += a[i];
		}

		return equilibriumIndices;
	}

}

/*
--------Test Case 1---------
Equilibrium Indices : 
0
3
7
--------Test Case 2---------
No Such Index Exists  
 */
