package com.interview.leetcode;

public class CircleRectangleOverlapping {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1--------------------");
		int radius = 1;
		int x_center = 0;
		int y_center = 0;
		int x1 = 1;
		int y1 = -1;
		int x2 = 3;
		int y2 = 1;
		boolean isOverlapping = checkOverlap(radius, x_center, y_center, x1, y1, x2, y2);
		System.out.println("Are Circle and Rectangle with Given Cocordinates Overlapping: "+isOverlapping);
		System.out.println();
		
		System.out.println("------------------Test Case 2--------------------");
		radius = 2;
		x_center = 0;
		y_center = 0;
		x1 = -1;
		y1 = 1;
		x2 = -4;
		y2 = 2;
		isOverlapping = checkOverlap(radius, x_center, y_center, x1, y1, x2, y2);
		System.out.println("Are Circle and Rectangle with Given Cocordinates Overlapping: "+isOverlapping);
		System.out.println();
		
		System.out.println("------------------Test Case 3--------------------");
		radius = 1;
		x_center = 0;
		y_center = 0;
		x1 = -1;
		y1 =  0;
		x2 =  0;
		y2 =  1;
		isOverlapping = checkOverlap(radius, x_center, y_center, x1, y1, x2, y2);
		System.out.println("Are Circle and Rectangle with Given Cocordinates Overlapping: "+isOverlapping);
		System.out.println();
	}

	public static boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
		    int xNearest = Math.max(x1, Math.min(x_center, x2)); 
		    int yNearest = Math.max(y1, Math.min(y_center, y2)); 
		      
		
		    int Dx = xNearest - x_center; 
		    int Dy = yNearest - y_center; 
		    return (Dx * Dx + Dy * Dy) <= radius * radius; 
	}
}

/*
 * ------------------Test Case 1--------------------
Are Circle and Rectangle with Given Cocordinates Overlapping: true

------------------Test Case 2--------------------
Are Circle and Rectangle with Given Cocordinates Overlapping: true

------------------Test Case 3--------------------
Are Circle and Rectangle with Given Cocordinates Overlapping: true

 * */
