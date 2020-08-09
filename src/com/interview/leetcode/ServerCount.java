package com.interview.leetcode;

public class ServerCount {

	public static void main(String[] args) {
		System.out.println("-------------Test Case 1--------------");
		int [][] grid = {
				   			{1 , 1,  0 , 0},
				   			{0 , 0 , 1 , 0},
				   			{0 , 0 , 1 , 0},
				   			{0 , 0 , 0 , 1}
						};
		
		System.out.println("No Of Servers Communicating : "+countServers(grid));
		System.out.println();
		
		System.out.println("-------------Test Case 2--------------");
		int [][] grid2 = {
				   			{1 , 0},
				   			{0 , 1 },
						};
		
		System.out.println("No Of Servers Communicating : "+countServers(grid2));
		System.out.println();
		
		System.out.println("-------------Test Case 3--------------");
		int [][] grid3 = {
				   			{1 , 0},
				   			{1 , 1 },
						};
		
		System.out.println("No Of Servers Communicating : "+countServers(grid3));
		System.out.println();
		
		System.out.println("-------------Test Case 4--------------");
		int [][] grid4 = {
				   			{1,0,0,1,0},
				   			{0,0,0,0,0 },
				   			{0,0,0,1,0 },
						};
		
		System.out.println("No Of Servers Communicating : "+countServers(grid4));
		System.out.println();
		
		System.out.println("-------------Test Case 5--------------");
		int [][] grid5 = {
				   			{1,0,1},
				   			{0,0,0},
				   			{0,0,1},
				   			{0,1,0},
				   			{1,0,0},
						};
		
		System.out.println("No Of Servers Communicating : "+countServers(grid5));
		System.out.println();
		
	}

	 public static int countServers(int[][] grid) {
		int serverCount = 0;
		int row [] = new int [grid.length];
		int col [] = new int [grid[0].length];
		int iinit = 0;
		int jinit = 0;
		int i = 0;
		int j =0;
		while (jinit < grid.length ) {
			for (i = iinit; i < grid[0].length && jinit < grid.length; i++) {
				if (grid[jinit][i] == 1) {
					row[jinit] = row[jinit] + 1;
				}
			}
			jinit++;
		}

		jinit = 0;
		iinit = 0;
		while (iinit < grid[0].length) {
			for ( j = jinit; j < grid.length && iinit < grid[0].length; j++) {
				if (grid[j][iinit] == 1) {
					col[iinit] = col[iinit] + 1;
				}
				
			}
			iinit++;
		}
		
		for(i = 0 ; i < grid.length ; i++) {
			for(j = 0 ; j < grid[0].length ; j++) {
				if(grid[i][j] == 1) {
					if(row[i] > 1 || col[j] > 1) {
						serverCount += 1;
					}
				}
			}
		}
		
		return serverCount;
	        
	 }
}
