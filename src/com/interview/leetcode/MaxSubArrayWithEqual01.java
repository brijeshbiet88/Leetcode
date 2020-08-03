package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayWithEqual01 {

	public static void main(String[] args) {
		System.out.println("---------Test Case 1 ---------");
		int [] a = {1 , 0 , 0 , 1 , 0 , 0, 0 , 0, 0 , 1 ,0 ,1 ,1   };
		System.out.println("maxLength SubArray WIth Equal 0's and 1's : "+ findMaxLength(a));
		
		System.out.println("---------Test Case 1 ---------");
		int [] b = {1 , 0 };
		System.out.println("maxLength SubArray WIth Equal 0's and 1's : "+ findMaxLength(b));
		
		System.out.println("---------Test Case 1 ---------");
		int [] c = {1 };
		System.out.println("maxLength SubArray WIth Equal 0's and 1's : "+ findMaxLength(c));
		
		System.out.println("---------Test Case 1 ---------");
		int [] d = {1 , 0 , 1};
		System.out.println("maxLength SubArray WIth Equal 0's and 1's : "+ findMaxLength(d));
		
		System.out.println("---------Test Case 1 ---------");
		int [] e = {1 , 1 , 1 };
		System.out.println("maxLength SubArray WIth Equal 0's and 1's : "+ findMaxLength(e));
	}

// In case of sum equals to 0. we initialize with minus to handle only element in array
//map.put(0, -1); will handle i+1 scenario .

// we are keeping track of every sum and storing sum and corresponding index in map
// anywhere we encounter the sum repeats means the elements between those indices have
// equal number of 0's and 1's. 

	public static int findMaxLength(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxlen = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - map.get(sum));// In case the sum repeats it means that the 
                                                           //elements in between had equal number of 0's and 1's
            } else {
                map.put(sum, i);
            }
        }
        return maxlen;
	}
}

/*
 ---------Test Case 1 ---------
maxLength SubArray WIth Equal 0's and 1's : 6
---------Test Case 1 ---------
maxLength SubArray WIth Equal 0's and 1's : 2
---------Test Case 1 ---------
maxLength SubArray WIth Equal 0's and 1's : 0
---------Test Case 1 ---------
maxLength SubArray WIth Equal 0's and 1's : 2
---------Test Case 1 ---------
maxLength SubArray WIth Equal 0's and 1's : 0

 */
