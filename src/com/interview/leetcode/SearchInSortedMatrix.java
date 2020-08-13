package com.interview.leetcode;

public class SearchInSortedMatrix {

	public static void main(String[] args) {
		
		int [][] matrix = {
							{1,   3,  5,  7},
							{10, 11, 16, 20},
							{23, 30, 34, 50}};
		
		System.out.println("----------------Test Case 1----------------");
		int target = 3;
		boolean found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 2----------------");
		target = 1;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 3----------------");
		target = 50;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 4----------------");
		target = 7;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 5----------------");
		target = 23;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 6----------------");
		target = 49;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
		
		System.out.println("----------------Test Case 7----------------");
		target = 80;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element "+target+" Found : "+found);
		System.out.println();
	}	
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length ;
		if(m == 0)
			return false;
		int n = matrix[0].length;
		int first = 0 , last = m*n - 1  ;
		
		int row ;
		int col ;	
		int mid ;
		while(first <= last) {
			mid = first + (last - first)/2;
			row = mid / n;
			col = mid % n;
			if(matrix[row][col] == target) {
				return true;
			}
			else if(matrix[row][col] < target){
				first = mid + 1;
			}else {
				last = mid -1;
			}
		}
		
		
		return false;   
    }
}

/*
 ----------------Test Case 1----------------
Is Element 3 Found : true

----------------Test Case 2----------------
Is Element 1 Found : true

----------------Test Case 3----------------
Is Element 50 Found : true

----------------Test Case 4----------------
Is Element 7 Found : true

----------------Test Case 5----------------
Is Element 23 Found : true

----------------Test Case 6----------------
Is Element 49 Found : false

----------------Test Case 7----------------
Is Element 80 Found : false
 
*/
