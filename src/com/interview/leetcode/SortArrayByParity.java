package com.interview.leetcode;

public class SortArrayByParity {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1----------------");
		int [] A = {3,1,2,4};
		System.out.println("\nArray Elements Before Sorting By Parity :\n");
		for(int num : A)
			System.out.print(num+" ");
		sortArrayByParity(A);
		System.out.println("\nArray Elements After Sorting By Parity :\n");
		for(int num : A)
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("--------------Test Case 2----------------");
		int [] A2 = {2 , 4 , 6 , 5 , 8 ,3 , 2};
		System.out.println("\nArray Elements Before Sorting By Parity :\n");
		for(int num : A2)
			System.out.print(num+" ");
		sortArrayByParity(A2);
		System.out.println("\nArray Elements After Sorting By Parity :\n");
		for(int num : A2)
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("--------------Test Case 3----------------");
		int [] A3 = {1 , 2 , 3 , 4 , 5 ,6 , 7, 8 , 9 , 10};
		System.out.println("\nArray Elements Before Sorting By Parity :\n");
		for(int num : A3)
			System.out.print(num+" ");
		sortArrayByParity(A3);
		System.out.println("\nArray Elements After Sorting By Parity :\n");
		for(int num : A3)
			System.out.print(num+" ");
		System.out.println();

	}
	
	public static int[] sortArrayByParity(int[] A) {
        int even = 0 , odd = 0;
        int temp = 0;
        int len = A.length;
        
        while(even < len && odd < len) {
        	

            while(odd < len && A[odd] % 2 == 0) {
        		odd++;
        	}
            
            even = odd + 1; 
            
            while(even < len && A[even] % 2 == 1) {
        		even++;
        	}
            if(odd < len && even < len) {
            	temp = A[odd];
            	A[odd] = A[even];
            	A[even] = temp;
            }
            odd++;
            even++;
        	
        }
        return A;
    }

}
/*
 --------------Test Case 1----------------

Array Elements Before Sorting By Parity :

3 1 2 4 
Array Elements After Sorting By Parity :

2 4 3 1 
--------------Test Case 2----------------

Array Elements Before Sorting By Parity :

2 4 6 5 8 3 2 
Array Elements After Sorting By Parity :

2 4 6 8 2 3 5 
--------------Test Case 3----------------

Array Elements Before Sorting By Parity :

1 2 3 4 5 6 7 8 9 10 
Array Elements After Sorting By Parity :

2 4 6 8 10 3 7 1 9 5  
 */
