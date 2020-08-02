package com.interview.leetcode;

public class SubsetSumEqualToK {

	public static void main(String[] args) {
		System.out.println("------------Test Case 1-----------");
		int [] a = {4, 2, 5 , 1, 6 , 5 ,7 , 2};
		int k = 21;
		boolean hasSubset = ifSubsetSumExists(a , k );
		System.out.println("Does Subset Sum Equal to Sum "+k+" Exists ? "+hasSubset);
		System.out.println();
		
		System.out.println("------------Test Case 2-----------");
		int [] b = {4, 2, 5 , 1, 6 , 5 ,7 , 2};
		k = 32 ;
		hasSubset = ifSubsetSumExists(b , k );
		System.out.println("Does Subset Sum Equal to Sum "+k+" Exists ? "+hasSubset);
		System.out.println();
		
		System.out.println("------------Test Case 3-----------");
		int [] c = {4, 2, 5 , 1, 6 , 5 ,7 , 2};
		k = 52 ;
		hasSubset = ifSubsetSumExists(c , k );
		System.out.println("Does Subset Sum Equal to Sum "+k+" Exists ? "+hasSubset);
		System.out.println();
		
		System.out.println("------------Test Case 4-----------");
		int [] d = {4, 1, 5 , 2, 9 , 5 ,7 , 2};
		k = 1 ;
		hasSubset = ifSubsetSumExists(d , k );
		System.out.println("Does Subset Sum Equal to Sum "+k+" Exists ? "+hasSubset);
		System.out.println();
	}

	private static boolean ifSubsetSumExists(int[] a, int k) {
		int  sum = 0 , leftIndex = 0 ;
		for(int i = 0 ; i < a.length ; i++) {
			sum += a[i];
			
				while(sum >= k) {
					if(sum == k) {
						System.out.println("Start Index :"+leftIndex+" Right Index : "+i);
						return true;
					}
					sum -= a[leftIndex];
					leftIndex++;
				}
			}		
		return false;
	}

}
/*
------------Test Case 1-----------
Start Index :3 Right Index : 7
Does Subset Sum Equal to Sum 21 Exists ? true

------------Test Case 2-----------
Start Index :0 Right Index : 7
Does Subset Sum Equal to Sum 32 Exists ? true

------------Test Case 3-----------
Does Subset Sum Equal to Sum 52 Exists ? false

------------Test Case 4-----------
Start Index :1 Right Index : 1
Does Subset Sum Equal to Sum 1 Exists ? true
 */
