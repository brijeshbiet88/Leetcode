package com.interview.leetcode;

import java.util.Arrays;
public class MeetingRooms {

	public static void main(String[] args) {
		System.out.println("-----------------------Test Case 1---------------------------");
		Interval [] intervals = {new Interval(0, 30) , new Interval(5, 10) , new Interval(15, 20) };
		
		boolean canAttend = canAttendMeetings(intervals);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		
		System.out.println("-----------------------Test Case 2---------------------------");
		Interval [] intervals2 = {new Interval(0, 10) , new Interval(15, 20) , new Interval(25, 45) };
		
		canAttend = canAttendMeetings(intervals2);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		
		System.out.println("-----------------------Test Case 3---------------------------");
		Interval [] intervals3 = {new Interval(0, 10) , new Interval(10, 20) , new Interval(20, 45) };
		
		canAttend = canAttendMeetings(intervals3);
		System.out.println("Can Person Attend All Meetings : "+canAttend);

	}
	
	public static boolean canAttendMeetings(Interval[] intervals) {
		Arrays.sort(intervals , (a,b)-> a.start - b.start);
		for(int i = 0 ; i < intervals.length -1 ; i++) {
			if(intervals[i].end > intervals[i+1].start) {
				return false;
			}
		}
		
		return true;
	}

}

class Interval {

	public Integer start;
	public Integer end;
	
	public Interval(Integer start , Integer end) {
		this.start = start;
		this.end = end;
	}
}

/*
 * -----------------------Test Case 1---------------------------
Can Person Attend All Meetings : false
-----------------------Test Case 2---------------------------
Can Person Attend All Meetings : true
-----------------------Test Case 3---------------------------
Can Person Attend All Meetings : true

 * */

