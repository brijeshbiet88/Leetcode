package com.interview.leetcode;

public class StraightLine {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1 --------------");
		int [][] coordinates = {{1 ,2} , {2 ,3} , {3 ,4} , {4,5} , {5 ,6} , {6 ,7}};
		System.out.println("Are Coordinates Make A straight line ?: "+checkStraightLine(coordinates));
		System.out.println();
		
		System.out.println("-----------------Test Case 2 --------------");
		int [][] coordinates2 = {{1 ,2} , {2 ,3} , {3 ,8} , {4,5} , {5 ,6} , {6 ,7}};
		System.out.println("Are Coordinates Make A straight line ?: "+checkStraightLine(coordinates2));
		System.out.println();
		
		System.out.println("-----------------Test Case 3 --------------");
		int [][] coordinates3 = {{1 ,2} , {2 ,3} , {3 ,5}};
		System.out.println("Are Coordinates Make A straight line ?: "+checkStraightLine(coordinates3));
		System.out.println();
		
		System.out.println("-----------------Test Case 4 --------------");
		int [][] coordinates4 = {{0 ,0} , {0 ,1} , {0 ,-1}};
		System.out.println("Are Coordinates Make A straight line ?: "+checkStraightLine(coordinates4));
		System.out.println();
		
		System.out.println("-----------------Test Case 5 --------------");
		int [][] coordinates5 = {{2 ,4} , {2 ,5} , {2 ,8}};
		System.out.println("Are Coordinates Make A straight line ?: "+checkStraightLine(coordinates5));
		System.out.println();

	}
	
	public static boolean checkStraightLine(int[][] coordinates) {
     
		int xDiff = coordinates[1][0] - coordinates[0][0];
		int yDiff = coordinates[1][1] - coordinates[0][1];
		
		for (int i = 2 ; i < coordinates.length ; i++) {
			int mx = coordinates[i][0] - coordinates[0][0];
			int my = coordinates[i][1] - coordinates[0][1];		
			
			if(xDiff == 0 && mx != 0) {
				return false;
			}
			
			if(yDiff == 0 && my != 0) {
				return false;
			}
			
			if((double)yDiff/xDiff != (double)my/mx) {
				if(xDiff == 0 && mx ==0) {
					return true;
				}
				return false;
			}
		}
		return true;
    }

}
