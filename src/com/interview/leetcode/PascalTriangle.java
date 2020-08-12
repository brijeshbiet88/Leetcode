package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1--------------");
		int rowIndex = 5;
		List<Integer> pascalNumbers = getRow(rowIndex);
		System.out.println("Pascal Numbers For Row = "+rowIndex);
		pascalNumbers.forEach(n->System.out.print(n+" "));
		pascalNumbers.clear();
		System.out.println();
		
		System.out.println("--------------Test Case 2--------------");
		rowIndex = 10;
		pascalNumbers = getRow(rowIndex);
		System.out.println("Pascal Numbers For Row = "+rowIndex);
		pascalNumbers.forEach(n->System.out.print(n+" "));
		pascalNumbers.clear();
		System.out.println();
		
		System.out.println("--------------Test Case 3--------------");
		rowIndex = 15;
		pascalNumbers = getRow(rowIndex);
		System.out.println("Pascal Numbers For Row = "+rowIndex);
		pascalNumbers.forEach(n->System.out.print(n+" "));
		pascalNumbers.clear();
		System.out.println();

		System.out.println("--------------Test Case 4--------------");
		rowIndex = 20;
		pascalNumbers = getRow(rowIndex);
		System.out.println("Pascal Numbers For Row = "+rowIndex);
		pascalNumbers.forEach(n->System.out.print(n+" "));
		pascalNumbers.clear();
		System.out.println();
	}

	//nCr = nCr-1 * (n-r+1)/r
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (int r = 1; r <= rowIndex; r++) {
			int term = (int) (((long)list.get(r-1)*(rowIndex -r + 1)) / r);
			list.add(term);
		}

		return list;
	}
}

/*
--------------Test Case 1--------------
Pascal Numbers For Row = 5
1 5 10 10 5 1 
--------------Test Case 2--------------
Pascal Numbers For Row = 10
1 10 45 120 210 252 210 120 45 10 1 
--------------Test Case 3--------------
Pascal Numbers For Row = 15
1 15 105 455 1365 3003 5005 6435 6435 5005 3003 1365 455 105 15 1 
--------------Test Case 4--------------
Pascal Numbers For Row = 20
1 20 190 1140 4845 15504 38760 77520 125970 167960 184756 167960 125970 77520 38760 15504 4845 1140 190 20 1 

 */
