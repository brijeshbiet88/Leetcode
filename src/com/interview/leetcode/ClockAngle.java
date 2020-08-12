package com.interview.leetcode;

public class ClockAngle {

	public static void main(String[] args) {
		System.out.println("---------------Test Case1 --------------");
		int hour = 12;
		int minutes = 30;
		double degree = angleClock(hour, minutes);
		System.out.println("Degree Between Hour and Minutes Hands "+degree);
		System.out.println();
		
		System.out.println("---------------Test Case2 --------------");
		hour = 3;
		minutes = 30;
		degree = angleClock(hour, minutes);
		System.out.println("Degree Between Hour and Minutes Hands "+degree);
		System.out.println();
		
		System.out.println("---------------Test Case3 --------------");
		hour = 1;
		minutes = 57;
		degree = angleClock(hour, minutes);
		System.out.println("Degree Between Hour and Minutes Hands "+degree);
		System.out.println();
		
		System.out.println("---------------Test Case4 --------------");
		hour = 4;
		minutes = 50;
		degree = angleClock(hour, minutes);
		System.out.println("Degree Between Hour and Minutes Hands "+degree);
		System.out.println();
		
		System.out.println("---------------Test Case5 --------------");
		hour = 12;
		minutes = 0;
		degree = angleClock(hour, minutes);
		System.out.println("Degree Between Hour and Minutes Hands "+degree);
		System.out.println();
	}
	
	public static double angleClock(int hour, int minutes) {
        double hourHandMovementInAngle = (hour%12)*30 + (double)minutes/2;
        double minsHandMovementInAngle = minutes*6;
        double angle ; 
        
        if(minsHandMovementInAngle - hourHandMovementInAngle > 180) {
        	angle = Math.abs(hourHandMovementInAngle - minsHandMovementInAngle);
        }
        else {
        	angle = Math.abs(minsHandMovementInAngle - hourHandMovementInAngle);
        }
        
        return angle <= 180 ? angle : 360-angle;
    }

}

/*
---------------Test Case1 --------------
Degree Between Hour and Minutes Hands 165.0

---------------Test Case2 --------------
Degree Between Hour and Minutes Hands 75.0

---------------Test Case3 --------------
Degree Between Hour and Minutes Hands 76.5

---------------Test Case4 --------------
Degree Between Hour and Minutes Hands 155.0

---------------Test Case5 --------------
Degree Between Hour and Minutes Hands 0.0

 * */
