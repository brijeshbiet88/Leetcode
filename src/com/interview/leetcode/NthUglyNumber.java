package com.interview.leetcode;

public class NthUglyNumber {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1--------------");
		int n = 11;
		int nthUglyNumber = nthUglyNumber(n);
		System.out.println("Nth Ugly Number Where N = "+n+" is : "+nthUglyNumber);
		System.out.println();
		
		System.out.println("---------------Test Case 2--------------");
		n = 50;
		nthUglyNumber = nthUglyNumber(n);
		System.out.println("Nth Ugly Number Where N = "+n+" is : "+nthUglyNumber);
		System.out.println();

	}

	// Have Prime factors only 2 , 3 & 5
	public static int nthUglyNumber(int n) {
		int[] dp = new int[n];
		int[] primes = { 2, 3, 5 };
		int[] frequency = new int[primes.length];
		dp[0] = 1;

		for (int i = 2; i <= n; i++) {
			int minUgly = Integer.MAX_VALUE;
			for (int j = 0; j < primes.length; j++) {
				int nextUgly = primes[j] * (dp[frequency[j]]);
				if (nextUgly > dp[i - 2]) {
					minUgly = Math.min(minUgly, nextUgly);
				}

			}
			dp[i - 1] = minUgly;

			for (int j = 0; j < primes.length; j++) {
				if (minUgly == primes[j] * (dp[frequency[j]])) {
					frequency[j]++;
				}
			}

		}

		System.out.println("First " + n + " Ugly Numbers ");
		for (int x : dp) {
			System.out.print(x + " ");

		}
		System.out.println();

		System.out.println("Frequency");
		for (int x : frequency) {
			System.out.print(x + " ");

		}
		System.out.println();

		return dp[n - 1];
	}
}

/*
 * 
 * ---------------Test Case 1--------------
First 11 Ugly Numbers 
1 2 3 4 5 6 8 9 10 12 15 
Frequency
6 5 3 
Nth Ugly Number Where N = 11 is : 15

---------------Test Case 2--------------
First 50 Ugly Numbers 
1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27 30 32 36 40 45 48 50 54 60 64 72 75 80 81 90 96 100 108 120 125 128 135 144 150 160 162 180 192 200 216 225 240 243 
Frequency
36 31 23 
Nth Ugly Number Where N = 50 is : 243


 * 
 * 
 */
