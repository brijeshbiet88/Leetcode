package com.interview.leetcode;

public class DuplicateZeros {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1---------------");
		int [] arr = {1,0,2,3,0,4,5,0};
		System.out.println("\nArray Elements Before Duplicating Zeros : \n");
		for(int num : arr) {
			System.out.print(num+" 	");
		}
		duplicateZeros(arr);
		System.out.println("\nArray Elements After Duplicating Zeros : \n");
		for(int num : arr) {
			System.out.print(num+" 	");
		}
		System.out.println();
		
		System.out.println("--------------Test Case 2---------------");
		int [] arr2 = {1,2,3};
		System.out.println("\nArray Elements Before Duplicating Zeros : \n");
		for(int num : arr2) {
			System.out.print(num+" 	");
		}
		duplicateZeros(arr2);
		System.out.println("\nArray Elements After Duplicating Zeros : \n");
		for(int num : arr2) {
			System.out.print(num+" 	");
		}
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
		int [] arr3 = {0 ,1};
		System.out.println("\nArray Elements Before Duplicating Zeros : \n");
		for(int num : arr3) {
			System.out.print(num+" 	");
		}
		duplicateZeros(arr3);
		System.out.println("\nArray Elements After Duplicating Zeros : \n");
		for(int num : arr3) {
			System.out.print(num+" 	");
		}
		System.out.println();
	}

	public static void duplicateZeros(int[] arr) {
		int j = arr.length - 2;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 0) {
				j = arr.length - 2;
				while (j > i) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[i + 1] = 0;
				i++;
			}
		}

	}

}

/*
 --------------Test Case 1---------------

Array Elements Before Duplicating Zeros : 

1 	0 	2 	3 	0 	4 	5 	0 	
Array Elements After Duplicating Zeros : 

1 	0 	0 	2 	3 	0 	0 	4 	
--------------Test Case 2---------------

Array Elements Before Duplicating Zeros : 

1 	2 	3 	
Array Elements After Duplicating Zeros : 

1 	2 	3 	
--------------Test Case 3---------------

Array Elements Before Duplicating Zeros : 

0 	1 	
Array Elements After Duplicating Zeros : 

0 	0 	

 * */
