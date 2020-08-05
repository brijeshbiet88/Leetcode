package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class All1sAtLeastKPlacesAway {

	public static void main(String[] args) {
		System.out.println("------------Test Case 1------------");
		int nums [] = {1 , 0 ,0,0, 1 , 0 , 0 , 1};
		int k = 2;
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart(nums , k));
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart2(nums , k));
		System.out.println();
		
		System.out.println("------------Test Case 2------------");
		int nums2 [] = {1 , 0 ,0,0, 1 , 0 , 1};
		k = 2;
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart(nums2 , k));
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart2(nums2 , k));
		System.out.println();
		
		System.out.println("------------Test Case 3------------");
		int nums3 [] = {1 , 1 ,1,1 , 1 , 1};
		k = 0;
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart(nums3 , k));
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart2(nums3 , k));
		System.out.println();
		
		System.out.println("------------Test Case 4------------");
		int nums4 [] = {0 , 1 ,0 , 1 };
		k = 1;
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart(nums4 , k));
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart2(nums4 , k));
		System.out.println();
		
		System.out.println("------------Test Case 5------------");
		int nums5 [] = {1};
		k = 1;
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart(nums5 , k));
		System.out.println("All 1's at least "+k+" places away ? = "+kLengthApart2(nums5 , k));
		System.out.println();
		
	
		

	}

	 public static boolean kLengthApart(int[] nums, int k) {
		 int numLen = nums.length;
		 int prevIndex = -1;
		 for(int i = 0 ; i < numLen ; i++ ) {
			 if(nums[i] == 0)
				 continue;
			 if((prevIndex) > -1 && i - prevIndex < k) {
				return false;
			 }
			int forward = i + 1;
			
			while((i+k) < numLen && forward <= (i+k)) {
				if(nums[forward] == 1) {
					return false;
				}
				forward++;
			}
			prevIndex = i; 
			 
		 }
		 
		return true;
	        
	  }
	 
	 public static boolean kLengthApart2(int[] nums, int k) {
		 int numLen = nums.length;
		 List<Integer> indicesOf1 = new ArrayList<>();
		 for(int i = 0 ; i < numLen ; i++ ) {
			 if(nums[i] == 0)
				 continue;
			 indicesOf1.add(i);
		 }
		 
		 for (int i = 0 ; i < indicesOf1.size() -1 ; i++) {
			 if(indicesOf1.get(i+1) - indicesOf1.get(i) <= k) {
				  return false;
			  }
		 }
		 
		return true;
	        
	  }
}
/*
------------Test Case 1------------
All 1's at least 2 places away ? = true

------------Test Case 2------------
All 1's at least 2 places away ? = false

------------Test Case 3------------
All 1's at least 0 places away ? = true

------------Test Case 4------------
All 1's at least 1 places away ? = true

------------Test Case 5------------
All 1's at least 1 places away ? = true


 *
 */
