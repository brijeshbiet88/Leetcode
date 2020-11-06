package com.interview.leetcode;

public class SearchInSortedArrayUnknownSize {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1---------------------");
		int a [] = {-3 , -1 , 2 , 4 , 5  ,7, 9};
		int target = 9;
		int targetIndex = searcTargetIndex(a , target);
		System.out.println("Target : "+target+" , Target Index : "+targetIndex);
		
		System.out.println("------------------Test Case 2---------------------");
		target = 0;
		targetIndex = searcTargetIndex(a , target);
		System.out.println("Target : "+target+" , Target Index : "+targetIndex);
		
		System.out.println("------------------Test Case 3---------------------");
		target = -3;
		targetIndex = searcTargetIndex(a , target);
		System.out.println("Target : "+target+" , Target Index : "+targetIndex);
		
		System.out.println("------------------Test Case 4---------------------");
		target = 2;
		targetIndex = searcTargetIndex(a , target);
		System.out.println("Target : "+target+" , Target Index : "+targetIndex);
		
		System.out.println("------------------Test Case 5---------------------");
		target = 5;
		targetIndex = searcTargetIndex(a , target);
		System.out.println("Target : "+target+" , Target Index : "+targetIndex);
	}
	
	private static int searcTargetIndex(int[] a, int target) {
		int l = 0, r = 1;

		while (getIndex(a, r) < target) {
				l = r;
				r = 2 * r;
		}

		int num , mid ;
		while(l <= r) {
			mid = l + (r -l) / 2; 
			num = getIndex(a, mid);
			if(num == target) {
				return mid;
			}
			
			else if (num > target) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static int getIndex(int [] a  , int index ) {
		return index >= a.length ? Integer.MAX_VALUE : a[index]; 
	} 

}

/*
 -----------------Test Case 1---------------------
Target : 9 , Target Index : 6
------------------Test Case 2---------------------
Target : 0 , Target Index : -1
------------------Test Case 3---------------------
Target : -3 , Target Index : 0
------------------Test Case 4---------------------
Target : 2 , Target Index : 2
------------------Test Case 5---------------------
Target : 5 , Target Index : 4
 * */
