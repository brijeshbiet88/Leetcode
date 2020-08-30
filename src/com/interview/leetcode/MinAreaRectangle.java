package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinAreaRectangle {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1--------------------");
		int [][]points = {{1,1},{1,3},{3,1},{3,3},{2,2}};
		int minArea = minAreaRect(points);
		System.out.println("Min Area Rectange Parallel to x and y axis : "+minArea);
		System.out.println();
		
		System.out.println("------------------Test Case 1--------------------");
		int [][]points2 = {{1,1},{1,3},{3,1},{3,3},{4,1},{4,3}};
		minArea = minAreaRect(points2);
		System.out.println("Min Area Rectange Parallel to x and y axis : "+minArea);
		System.out.println();

	}
	
	public static int minAreaRect(int[][] points) {
		 Map<Integer, List<Integer>> rows = new TreeMap<>();
	        for (int[] point: points) {
	            int x = point[0], y = point[1];
	            rows.computeIfAbsent(x, z-> new ArrayList<>()).add(y);
	        }

	        int minAreaRectangle = Integer.MAX_VALUE;
	        Map<Integer, Integer> lastx = new HashMap<>();
	        for (int x: rows.keySet()) {
	            List<Integer> row = rows.get(x);
	            Collections.sort(row);
	            for (int i = 0; i < row.size(); ++i)
	                for (int j = i+1; j < row.size(); ++j) {
	                    int y1 = row.get(i), y2 = row.get(j);
	                    int code = 40001 * y1 + y2;
	                    if (lastx.containsKey(code))
	                        minAreaRectangle = Math.min(minAreaRectangle, (x - lastx.get(code)) * (y2-y1));
	                    lastx.put(code, x);
	                }
	        }

	        return minAreaRectangle < Integer.MAX_VALUE ? minAreaRectangle : 0;
	}

}
/*
------------------Test Case 1--------------------
Min Area Rectange Parallel to x and y axis : 4

------------------Test Case 1--------------------
Min Area Rectange Parallel to x and y axis : 2

 * */
