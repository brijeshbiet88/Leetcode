package com.interview.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSumCircularSubArray {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1---------------");
		int [] A = {2 , 1 , -5 , 4 , -3 , 1 ,-3 , 4 , -1};
		int maxSum = maxSubarraySumCircular3(A);
		System.out.println("Max Sum Circular Saub Array : "+maxSum);
		System.out.println();
		
		System.out.println("---------------Test Case 2---------------");
		int[] A2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maxSum = maxSubarraySumCircular3(A2);
		System.out.println("Max Sum Circular Saub Array : "+maxSum);
		System.out.println();
		
		System.out.println("---------------Test Case 3---------------");
		int[] A3 = { -2, -3, -1 };
		maxSum = maxSubarraySumCircular3(A3);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();

		System.out.println("---------------Test Case 4---------------");
		int[] A4 = { 5, -3, 6 ,2};
		maxSum = maxSubarraySumCircular3(A4);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();

		System.out.println("---------------Test Case 5---------------");
		int[] A5 = {  5, -3, 6 ,2 , -4};
		maxSum = maxSubarraySumCircular3(A5);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();
		
		System.out.println("---------------Test Case 6---------------");
		int[] A6 = { -4};
		maxSum = maxSubarraySumCircular3(A6);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();
		
		System.out.println("---------------Test Case 7---------------");
		int[] A7 = { 3, 1, 2, 3, 6 };
		maxSum = maxSubarraySumCircular3(A7);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();
		
		System.out.println("---------------Test Case 8---------------");
		int[] A8 = { 9 , -4 , -7 , 9};
		maxSum = maxSubarraySumCircular3(A8);
		System.out.println("Max Sum Circular Sub Array : "+maxSum);
		System.out.println();
		
		
	}
	
	public static int maxSubarraySumCircular(int[] A) {
		 int S = 0;
	        for (int x: A)
	            S += x;

	        // ans1: answer for one-interval subarray
	        int ans1 = Integer.MIN_VALUE;
	        int cur = Integer.MIN_VALUE;
	        for (int x: A) {
	            cur = x + Math.max(cur, 0);
	            ans1 = Math.max(ans1, cur);
	        }

	        // ans2: answer for two-interval subarray, interior in A[1:]
	        int ans2 = Integer.MAX_VALUE;
	        cur = Integer.MAX_VALUE;
	        for (int i = 1; i < A.length; ++i) {
	            cur = A[i] + Math.min(cur, 0);
	            ans2 = Math.min(ans2, cur);
	        }
	        ans2 = S - ans2;

	        // ans3: answer for two-interval subarray, interior in A[:-1]
	        int ans3 = Integer.MAX_VALUE;
	        cur = Integer.MAX_VALUE;
	        for (int i = 0; i < A.length - 1; ++i) {
	            cur = A[i] + Math.min(cur, 0);
	            ans3 = Math.min(ans3, cur);
	        }

	        return Math.max(ans1, Math.max(ans2, ans3));
	}
	
	public static int maxSubarraySumCircular2(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int maxSoFar = 0;
        int len = A.length;
        boolean allPositive = true;
        int j = 0;
        for(int i = 0 ; i < len ; i++) {
        	maxSoFar = 0;
        	j = (i) % len;
        	do{
        		if(A[j % len] < 0) {
        			allPositive = false;
        		}
        		maxSoFar += A[j % len];
	        	
	        	maxSum = Math.max(maxSum, maxSoFar);
	        	if(maxSoFar < 0) {
	        		maxSoFar = 0;
	        	}
        		j++;
        	}while(j%len != (len + i) % len);
        	
        	if(allPositive) {
        		break;
        	}
        }
        
        return maxSum;
    }

	public static int maxSubarraySumCircular3(int[] A) {
		 int N = A.length;

	        // Compute P[j] = B[0] + B[1] + ... + B[j-1]
	        // for fixed array B = A+A
	        int[] P = new int[2*N+1];
	        for (int i = 0; i < 2*N; ++i)
	            P[i+1] = P[i] + A[i % N];

	        // Want largest P[j] - P[i] with 1 <= j-i <= N
	        // For each j, want smallest P[i] with i >= j-N
	        int ans = A[0];
	        // deque: i's, increasing by P[i]
	        Deque<Integer> deque = new ArrayDeque();
	        deque.offer(0);

	        for (int j = 1; j <= 2*N; ++j) {
	            // If the smallest i is too small, remove it.
	            if (deque.peekFirst() < j-N)
	                deque.pollFirst();

	            // The optimal i is deque[0], for cand. answer P[j] - P[i].
	            ans = Math.max(ans, P[j] - P[deque.peekFirst()]);

	            // Remove any i1's with P[i2] <= P[i1].
	            while (!deque.isEmpty() && P[j] <= P[deque.peekLast()])
	                deque.pollLast();

	            deque.offerLast(j);
	        }

	        return ans;
    }
	
	public static int maxSubarraySumCircular4(int[] A)  {
		  int N = A.length;

	        int ans = A[0], cur = A[0];
	        for (int i = 1; i < N; ++i) {
	            cur = A[i] + Math.max(cur, 0);
	            ans = Math.max(ans, cur);
	        }

	        // ans is the answer for 1-interval subarrays.
	        // Now, let's consider all 2-interval subarrays.
	        // For each i, we want to know
	        // the maximum of sum(A[j:]) with j >= i+2

	        // rightsums[i] = A[i] + A[i+1] + ... + A[N-1]
	        int[] rightsums = new int[N];
	        rightsums[N-1] = A[N-1];
	        for (int i = N-2; i >= 0; --i)
	            rightsums[i] = rightsums[i+1] + A[i];

	        // maxright[i] = max_{j >= i} rightsums[j]
	        int[] maxright = new int[N];
	        maxright[N-1] = A[N-1];
	        for (int i = N-2; i >= 0; --i)
	            maxright[i] = Math.max(maxright[i+1], rightsums[i]);

	        int leftsum = 0;
	        for (int i = 0; i < N-2; ++i) {
	            leftsum += A[i];
	            ans = Math.max(ans, leftsum + maxright[i+2]);
	        }

	        return ans;
	}
}
