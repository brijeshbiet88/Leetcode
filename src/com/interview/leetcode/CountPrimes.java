package com.interview.leetcode;

public class CountPrimes {

	public static void main(String[] args) {
		int n = 50;
		System.out.println("\nCount Of Prime Numbers: "+countPrimes(n));

	}
	
	public static int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];

		for (int i = 2; i * i < n; i++) {
			if (isPrime[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = true;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (!isPrime[i]) {
				System.out.print(i+" ");
				count++;
			}
		}
		return count;
	}

}
/*

2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
Count Of Prime Numbers: 15
*/