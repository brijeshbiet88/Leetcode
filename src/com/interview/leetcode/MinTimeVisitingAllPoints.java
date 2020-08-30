package com.interview.leetcode;

public class MinTimeVisitingAllPoints {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1--------------------");
		int [][]points = {{1,1},{3,4},{-1,0}};
		int time = minTimeToVisitAllPoints(points);
		System.out.println("Min Time to Visit All Points : "+time);
		System.out.println();
		
		System.out.println("------------------Test Case 2--------------------");
		int [][]points2 = {{3,2},{-2,2}};
		time = minTimeToVisitAllPoints(points2);
		System.out.println("Min Time to Visit All Points : "+time);
		System.out.println();
		
		System.out.println("------------------Test Case 2--------------------");
		int [][]points3 = {{0,0},{1,1},{2,2},{3,3},{4,4},{-1,-1}};
		time = minTimeToVisitAllPoints(points3);
		System.out.println("Min Time to Visit All Points : "+time);
		System.out.println();

	}
	
	public static int minTimeToVisitAllPoints(int[][] points) {

		int time = 0;
		int prevX = points[0][0];
		int prevY = points[0][1];
		int currX;
		int currY;
		int n = points.length;
		int visited = 1;

		while (visited < n) {
			currX = points[visited][0];
			currY = points[visited][1];
			while (prevX != currX || prevY != currY) {

				if (currX == prevX) {
					if (currY > prevY) {
						prevY++;
					} else if (currY < prevY) {
						prevY--;
					}
					time++;
				}

				else if (currY == prevY) {
					if (currX > prevX) {
						prevX++;
					} else if (currX < prevX) {
						prevX--;
					}
					time++;
				}

				else {

					if (currY > prevY && currX > prevX) {
						prevY++;
						prevX++;
					} else if (currY < prevY && currX < prevX) {
						prevY--;
						prevX--;
					}

					else if (currY < prevY && currX > prevX) {
						prevY--;
						prevX++;
					}

					else if (currY > prevY && currX < prevX) {
						prevY++;
						prevX--;
					}
					time++;
				}

			}

			visited++;
		}

		return time;
	}

}

/*
 * ------------------Test Case 1--------------------
Min Time to Visit All Points : 7

------------------Test Case 2--------------------
Min Time to Visit All Points : 5

------------------Test Case 2--------------------
Min Time to Visit All Points : 9

 * */
