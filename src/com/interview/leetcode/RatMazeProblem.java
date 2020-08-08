package com.interview.leetcode;

public class RatMazeProblem {

	public static void main(String[] args) {
		  System.out.println(" ----------------Test Case 1-----------------");
		  int [][] maze = {
				           {0 ,1 , 0 , 1, 1}, 
				           {0 ,0 , 1 , 0, 0}, 
				           {1 ,0 , 0 , 0, 1}, 
				           {0 ,0 , 0 , 0, 0}, 
				           {0 ,0 , 0 , 1, 0},  
		                  };
		 
		int row = maze.length;
		int col = maze[0].length ;
		int x = 0 , y = 0;
		int [][] path = new int[row][col];
		boolean pathFound = findPathInMaze(maze , x , y , path , row , col);
		System.out.println("Is There a Path from 0,0 to "+(row-1)+","+(col -1)+" : "+pathFound);
		if(pathFound)
		printPath(path , row , col);
		System.out.println();
		
		
		System.out.println(" ----------------Test Case 2-----------------");
		int [][] maze2 = {
				           {0 ,1 }, 
				           {0 ,0 },   
		                  };
		 
		row = maze2.length;
		col = maze2[0].length ;
		x = 0 ; y = 0;
		int [][] path2 = new int[row][col];
		pathFound = findPathInMaze(maze2 , x , y , path2 , row , col);
		System.out.println("Is There a Path from 0,0 to "+(row-1)+","+(col -1)+" : "+pathFound);
		if(pathFound)
		printPath(path , row , col);
		System.out.println();
		
	}

	private static void printPath(int[][] path, int row, int col) {
		for (int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.print(path[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	private static boolean findPathInMaze(int[][] maze, int x, int y, int[][] path, int R, int C) {
		if (x == R - 1 && y == C - 1) {
			path[x][y] = 1;
			return true;
		}

		if (isValidMove(maze, x, y)) {

			path[x][y] = 1;
			if (findPathInMaze(maze, x + 1, y, path, R, C))
				return true;

			if (findPathInMaze(maze, x, y + 1, path, R, C))
				return true;

			path[x][y] = 0;
			return false;
		}
		return false;
	}

	private static boolean isValidMove(int[][] maze, int x, int y) {
		return (x < maze.length
                && y < maze[0].length && maze[x][y] == 0); 
	}

}

/*
  ----------------Test Case 1-----------------
Is There a Path from 0,0 to 4,4 : true
1	0	0	0	0	
1	1	0	0	0	
0	1	0	0	0	
0	1	1	1	1	
0	0	0	0	1	

 ----------------Test Case 2-----------------
Is There a Path from 0,0 to 2,2 : false
 */
