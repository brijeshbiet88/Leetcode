package com.interview.leetcode;

public class SearchInRowColSortedMatrix {

	public static void main(String[] args) {
		int [][] matrix = {
							{1,   4,    7,   11 , 15},
							{2,   5,    8,   12,  19},
							{3,   6,    9,   16,  22},
							{10, 14,    22,  29,  32}
							};
		int target = 1;
		int count = 1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println("----------------Test Case " + count++ + "----------------");
				target = matrix[i][j];
				boolean found = searchMatrix2(matrix, target);
				System.out.println("Is Element " + target + " Found : " + found);
				System.out.println();
			}
		}

		System.out.println("----------------Test Case" + count++ + "----------------");
		target = 28;
		boolean found = searchMatrix(matrix, target);
		System.out.println("Is Element " + target + " Found : " + found);
		System.out.println();

		System.out.println("----------------Test Case" + count++ + "----------------");
		target = 26;
		found = searchMatrix(matrix, target);
		System.out.println("Is Element " + target + " Found : " + found);
		System.out.println();
		
		int [][] matrix2 = {{}};
		
		System.out.println("----------------Test Case" + count++ + "----------------");
		target = 12;
		found = searchMatrix(matrix2, target);
		System.out.println("Is Element " + target + " Found : " + found);
		System.out.println();
		
		int [][] matrix3 = {{-1} , {-1}};
		
		System.out.println("----------------Test Case" + count++ + "----------------");
		target = 12;
		found = searchMatrix(matrix3, target);
		System.out.println("Is Element " + target + " Found : " + found);
		System.out.println();
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length ;
		if(m == 0)
			return false;
		int n = matrix[0].length;
		if(n == 0) return false;
		int mid;
		int first = 0, last = m -1;
		int targetRow = 0;
		while(first <= last) {
			mid = first + (last - first)/2;
			
			if(matrix[mid][n-1] == target) {
				return true;
			}
			else if(matrix[mid][n-1] < target){
				first = mid + 1;
			}else {
				last = mid -1;
				targetRow = mid;
			}
		}
		
		for(int i = targetRow ; i < m ; i++) {
			if(n > 0 && matrix[i][0] > target) {
				return false;
			}
		first = 0 ; last = n-1;
		while(first <= last) {
			mid = first + (last - first)/2;
			
			if(matrix[i][mid] == target) {
				return true;
			}
			else if(matrix[i][mid] < target){
				first = mid + 1;
			}else {
				last = mid -1;
			}
		}
		}
		
		return false;
	        
	}
	
	public static boolean searchMatrix2(int[][] matrix, int target) {
		int m = matrix.length;
		if(m == 0)
	        return false;
		int n = matrix[0].length;
		int i = 0 , j = n-1; 
		while(i < m && j >=0) {
			
			if(matrix[i][j] == target)
				return true;
			if(matrix[i][j] < target) {
				i++;
			}else if(matrix[i][j] > target) {
				j--;
			}
		}
		return false;
		
	}

}

/*
----------------Test Case 1----------------
Is Element 1 Found : true

----------------Test Case 2----------------
Is Element 4 Found : true

----------------Test Case 3----------------
Is Element 7 Found : true

----------------Test Case 4----------------
Is Element 11 Found : true

----------------Test Case 5----------------
Is Element 15 Found : true

----------------Test Case 6----------------
Is Element 2 Found : true

----------------Test Case 7----------------
Is Element 5 Found : true

----------------Test Case 8----------------
Is Element 8 Found : true

----------------Test Case 9----------------
Is Element 12 Found : true

----------------Test Case 10----------------
Is Element 19 Found : true

----------------Test Case 11----------------
Is Element 3 Found : true

----------------Test Case 12----------------
Is Element 6 Found : true

----------------Test Case 13----------------
Is Element 9 Found : true

----------------Test Case 14----------------
Is Element 16 Found : true

----------------Test Case 15----------------
Is Element 22 Found : true

----------------Test Case 16----------------
Is Element 10 Found : true

----------------Test Case 17----------------
Is Element 14 Found : true

----------------Test Case 18----------------
Is Element 22 Found : true

----------------Test Case 19----------------
Is Element 29 Found : true

----------------Test Case 20----------------
Is Element 32 Found : true

----------------Test Case21----------------
Is Element 28 Found : false

----------------Test Case22----------------
Is Element 26 Found : false

----------------Test Case23----------------
Is Element 12 Found : false

----------------Test Case24----------------
Is Element 12 Found : false


*/
