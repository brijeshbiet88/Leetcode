package com.interview.leetcode;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
	 int [] a1 = { };
	 int [] a2 = {1 , 2, 3 , 4};
	 
	 Double median = findMedianSortedArrays(a1 , a2);
	 System.out.println("Median Of Sorted Array : "+median);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0;
		int len1 = nums1.length , len2 = nums2.length;
		int count = 0;
		int i = 0 , j = 0;
		int loopLen ;
		if((len1+len2)%2 == 1) {
			loopLen = (len1+len2)/2;
		}else {
			loopLen = (len1+len2)/2 -1;
		}
		
		while(count < loopLen && i < len1 && j < len2) {
			if(nums1[i] < nums2[j]) {
				i++;
			}
			else{
				j++;
			}
			count++;
		}
		
		if(count != loopLen) {
			while(i < len1 && count < loopLen) {
				i++;
	            count++;
			}
			while(j < len2 && count < loopLen) {
				j++;
				count++;
			}
			
		}
		
		if((len1+len2) % 2 == 1) {
			if(i < len1 && j < len2) {
				if(nums1[i] < nums2[j]) {
					median = (double) nums1[i];
				}else {
					median = (double) nums2[j];
				}
			}
			
			else if(i < len1) {
				median = (double) nums1[i];
			}
			else {
				median = (double) nums2[j];
			}
		}
		count = 0;
		if((len1+len2) % 2 == 0) {
			while(count < 2) {
				count++;
			if(i < len1 && j < len2) {
				if(nums1[i] < nums2[j]) {
					median += (double) nums1[i++];
				}else {
					median += (double) nums2[j++];
				}
			}
			
			else if(i < len1) {
				median += (double) nums1[i++];
			}
			else {
				median += (double) nums2[j++];
			}
			}
			
			median = median/2;
		}
		return median;
        
    }
}
