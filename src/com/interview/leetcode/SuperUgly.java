package com.interview.leetcode;

public class SuperUgly {

	public static void main(String[] args) {
		System.out.println("---------------Test Case1---------------");
		int n = 12;
		int [] primes = {2 , 7 , 13 , 19};
		
		int nthUglyNum = nthSuperUglyNumber(n, primes);
		System.out.println("Nth SuperUgly Number : "+nthUglyNum);
		System.out.println();
		
		System.out.println("---------------Test Case1---------------");
		n = 2;
		int [] primes2 = {2 , 7 , 13 , 19};
		
		nthUglyNum = nthSuperUglyNumber(n, primes2);
		System.out.println("Nth SuperUgly Number : "+nthUglyNum);
		System.out.println();

	}
	
	private static int nthSuperUglyNumber(int n, int[] primes) {
		int[] frequency = new int[primes.length];
		int[] result = new int[n];
		result[0] = 1;// 1 is super ugly

		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < primes.length; j++) {
				min = Math.min(min, primes[j] * result[frequency[j]]);
			}

			result[i] = min;

			/* to find out which prime used to get result*/
			for (int j = 0; j < frequency.length; j++) {
				if (result[frequency[j]] * primes[j] == min) {
					frequency[j]++;
				}
			}
		}

		return result[n - 1];
	}

}
