package com.interview.leetcode;

import java.util.PriorityQueue;

public class MaxSumDivBy3 {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-------------");
		int [] nums = {3 , 6 ,5 ,1 , 8};
		int maxSumDivBy3 = findMaxSumDivBy3(nums);
		System.out.println("Max Sum Divisible By 3 : "+maxSumDivBy3);
		System.out.println();
		
		System.out.println("----------------Test Case 2-------------");
		int [] nums2 = {5 , 9 , 8 , 7 , 2 , 6 , 6 , 7};
		maxSumDivBy3 = findMaxSumDivBy3(nums2);
		System.out.println("Max Sum Divisible By 3 : "+maxSumDivBy3);
		System.out.println();
		
		System.out.println("----------------Test Case 3-------------");
		int [] nums3 = { 7 , 7};
		maxSumDivBy3 = findMaxSumDivBy3(nums3);
		System.out.println("Max Sum Divisible By 3 : "+maxSumDivBy3);
		System.out.println();
		
		System.out.println("----------------Test Case 4-------------");
		int [] nums4 = {8 , 11};
		maxSumDivBy3 = findMaxSumDivBy3(nums4);
		System.out.println("Max Sum Divisible By 3 : "+maxSumDivBy3);
		System.out.println();
		
		
	}

	private static int findMaxSumDivBy3(int[] nums) {


        int sum = 0, sum1 = Integer.MIN_VALUE, sum2 = Integer.MIN_VALUE;

        PriorityQueue<Integer> dp[] = new PriorityQueue[3] ;
        dp[0] = new PriorityQueue<Integer>();
        dp[1] = new PriorityQueue<Integer>();
        dp[2] = new PriorityQueue<Integer>();
        
        for (int num: nums) {
            dp[num % 3].add(num);
            sum += num;
        }
        
        int rem = sum % 3;
        switch (rem) {
            case 0:
                return sum;
            case 1:
            case 2:
                if (dp[rem].size() > 0)
                    sum1 = sum - dp[rem].poll();
                if (dp[3-rem].size() > 1)
                    sum2 = sum - dp[3-rem].poll() - dp[3-rem].poll();
                return Math.max(sum1, sum2);
        }
        
        return sum;
		
	}

}
/*
 ----------------Test Case 1-------------
Max Sum Divisible By 3 : 18

----------------Test Case 2-------------
Max Sum Divisible By 3 : 48

----------------Test Case 3-------------
Max Sum Divisible By 3 : 0

----------------Test Case 4-------------
Max Sum Divisible By 3 : 0
 
 */
