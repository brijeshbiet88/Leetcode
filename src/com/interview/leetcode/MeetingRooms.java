package com.interview.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class MeetingRooms {

	public static void main(String[] args) {
		System.out.println("-----------------------Test Case 1---------------------------");
		Interval [] intervals = {new Interval(0, 30) , new Interval(5, 10) , new Interval(15, 20) };
		
		boolean canAttend = canAttendMeetings(intervals);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		System.out.println("Minimum Meeting Rooms Required :"+minMeetingRooms(intervals));

		
		
		System.out.println("-----------------------Test Case 2---------------------------");
		Interval [] intervals2 = {new Interval(0, 10) , new Interval(15, 20) , new Interval(25, 45) };
		
		canAttend = canAttendMeetings(intervals2);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		System.out.println("Minimum Meeting Rooms Required :"+minMeetingRooms(intervals2));
		
		System.out.println("-----------------------Test Case 3---------------------------");
		Interval [] intervals3 = {new Interval(0, 10) , new Interval(10, 20) , new Interval(20, 45) };
		
		canAttend = canAttendMeetings(intervals3);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		System.out.println("Minimum Meeting Rooms Required :"+minMeetingRooms(intervals3));
		
		System.out.println("-----------------------Test Case 4---------------------------");
		Interval [] intervals4 = {new Interval(0, 10) , new Interval(5, 20) , new Interval(15, 25) , new Interval(20, 25) };
		
		canAttend = canAttendMeetings(intervals4);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		System.out.println("Minimum Meeting Rooms Required :"+minMeetingRooms(intervals4));
		
		System.out.println("-----------------------Test Case 5---------------------------");
		Interval [] intervals5 = {new Interval(0, 10) , new Interval(5, 20) , new Interval(5, 25) , new Interval(10, 20) , new Interval(2, 25) };
		
		canAttend = canAttendMeetings(intervals5);
		System.out.println("Can Person Attend All Meetings : "+canAttend);
		System.out.println("Minimum Meeting Rooms Required :"+minMeetingRooms(intervals5));
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
	
	
	public static int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		PriorityQueue<Interval> minHeap = new PriorityQueue<Interval>((a, b) -> a.end - b.end);
		minHeap.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			Interval current = intervals[i];
			Interval earliest = minHeap.remove();
			if (current.start >= earliest.end) {
				earliest.end = current.end;
			} else {
				minHeap.add(current);
			}
			minHeap.add(earliest);
		}

		return minHeap.size();
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
 -----------------------Test Case 1---------------------------
Can Person Attend All Meetings : false
Minimum Meeting Rooms Required :2
-----------------------Test Case 2---------------------------
Can Person Attend All Meetings : true
Minimum Meeting Rooms Required :1
-----------------------Test Case 3---------------------------
Can Person Attend All Meetings : true
Minimum Meeting Rooms Required :1
-----------------------Test Case 4---------------------------
Can Person Attend All Meetings : false
Minimum Meeting Rooms Required :2
-----------------------Test Case 5---------------------------
Can Person Attend All Meetings : false
Minimum Meeting Rooms Required :4

 * */

