package com.interview.leetcode;

public class MaxNumberOfBallons {

	public static void main(String[] args) {
		System.out.println("--------------Test Case 1---------------");
		String text = "nlaebolko";
		int maxBalloons = maxNumberOfBalloons(text);
		System.out.println("Max Number of Balloons From Text "+text+" = "+maxBalloons);
		System.out.println();

		System.out.println("--------------Test Case 2---------------");
		text = "loonbalxballpoon";
		maxBalloons = maxNumberOfBalloons(text);
		System.out.println("Max Number of Balloons From Text "+text+" = "+maxBalloons);
		System.out.println();
		
		System.out.println("--------------Test Case 3---------------");
		text = "cut";
		maxBalloons = maxNumberOfBalloons(text);
		System.out.println("Max Number of Balloons From Text "+text+" = "+maxBalloons);
		System.out.println();
		
		System.out.println("--------------Test Case 4---------------");
		text = "loonbalxballpoonballoon";
		maxBalloons = maxNumberOfBalloons(text);
		System.out.println("Max Number of Balloons From Text "+text+" = "+maxBalloons);
		System.out.println();
	}
	
	public static int maxNumberOfBalloons(String text) {
     int [] a = new int [26];
     
     int minMultiple = Integer.MAX_VALUE;
     
     for(char c : text.toCharArray()) {
    	 a[c-'a']++ ; 
     }
     
     for(char c : "balloon".toCharArray()) {
    	 if(c == 'b' || c == 'a' || c == 'n') {
    		 minMultiple = Math.min(minMultiple, a[c-'a'] / 1);	 
    	 } 
    	 else if(c == 'l' || c == 'o') {
    		 minMultiple = Math.min(minMultiple, a[c-'a'] / 2);
    	 }
    	 
     }
     
     return minMultiple;
    }

}
/*
 --------------Test Case 1---------------
Max Number of Balloons From Text nlaebolko = 1

--------------Test Case 2---------------
Max Number of Balloons From Text loonbalxballpoon = 2

--------------Test Case 3---------------
Max Number of Balloons From Text cut = 0

--------------Test Case 4---------------
Max Number of Balloons From Text loonbalxballpoonballoon = 3
*/