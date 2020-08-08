package com.interview.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinimumCostToMoveChips {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1--------------");
		int chips [] = {2 , 2 , 2 , 3 , 3};
		int minCost = minCostToMoveChips(chips);
		System.out.println("Minimum Cos To Move Chips : "+minCost);
		System.out.println();
		
		System.out.println("---------------Test Case 2--------------");
		int chips2 [] = {1 , 2, 3 ,4 , 5,6 ,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		minCost = minCostToMoveChips(chips2);
		System.out.println("Minimum Cos To Move Chips : "+minCost);
		System.out.println();

		System.out.println("---------------Test Case 3--------------");
		int chips3 [] = {6, 4 , 7, 8 , 2 ,10 , 2, 7 , 9 ,7};
		minCost = minCostToMoveChips(chips3);
		System.out.println("Minimum Cos To Move Chips : "+minCost);
		System.out.println();
	}
	
	public static int minCostToMoveChips(int[] chips) {
		int oddCost = 0;
		int evenCost = 0;
		
		for (int i = 0; i < chips.length; i++) {
			if(chips[i] %2 == 0) {
				evenCost++;
			}else {
				oddCost++;
			}
		}


		return evenCost > oddCost ? oddCost : evenCost;

	}

}
