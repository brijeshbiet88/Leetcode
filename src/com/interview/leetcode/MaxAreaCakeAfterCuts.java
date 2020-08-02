package com.interview.leetcode;

import java.util.Arrays;

public class MaxAreaCakeAfterCuts {

	public static void main(String[] args) {
		int h = 8;
		int w = 5;
		int [] horizontalCuts = {2 ,3 ,5 , 6};
		int [] verticalCuts   = {1 ,4};
		
		long p = 1000000;
		long q = 1000000;
		int res = (int) ((p*q)%(Math.pow(10, 9)));
		System.out.println(res);
		
		System.out.println("Max Area Of Cake : "+maxArea(h, w, horizontalCuts, verticalCuts));
		
	}
	
	/*Assuming That Cuts are in the range of given height and width*/
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		long maxDiffHorizontal = 0 , maxDiffVertical = 0 ;
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		
		maxDiffHorizontal = horizontalCuts[0] ;
		maxDiffVertical = verticalCuts[0] ;
		
		for(int i = 0 ; i < horizontalCuts.length - 1 ; i++) {
			if ((horizontalCuts[i+1]-horizontalCuts[i]) > maxDiffHorizontal ) {
				maxDiffHorizontal = (horizontalCuts[i+1]-horizontalCuts[i]);
			}
		}
		
		if((h - horizontalCuts[horizontalCuts.length-1]) > maxDiffHorizontal) {
			maxDiffHorizontal = h - horizontalCuts[horizontalCuts.length-1] ;
		}
		
		for(int i = 0 ; i < verticalCuts.length - 1 ; i++) {
			if ((verticalCuts[i+1]-verticalCuts[i]) > maxDiffVertical ) {
				maxDiffVertical = (verticalCuts[i+1]- verticalCuts[i]);
			}
		}
		
		if((w - verticalCuts[verticalCuts.length-1]) > maxDiffVertical) {
			maxDiffVertical = w - verticalCuts[verticalCuts.length-1] ;
		}
		
		
		return (int) ((maxDiffHorizontal*maxDiffVertical) % (Math.pow(10, 9)+7));
        
    }

}
