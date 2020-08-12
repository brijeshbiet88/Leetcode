package com.interview.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
	
	private List<Integer> [] bucket;
	private double loadFactor;
	private int count;
	private int capacity;
	
	public MyHashSet() {
		super();
	
		this.loadFactor = 0.5;
		this.count = 0;
		this.capacity = 10;
		this.bucket = new LinkedList[capacity];
	}
	
	public void add(int key) {
		if (contains(key))
			return;

		if (count == capacity * loadFactor) {
			capacity = capacity << 1;
			count = 0;
			List<Integer>[] oldBucket = bucket;
			bucket = new LinkedList[capacity];
			for (int i = 0; i < oldBucket.length; i++) {
				List<Integer> list = oldBucket[i];
				if (list != null) {
					for (int entry : list) {
						this.add(entry); // to maintain hashing
					}
				}

			}
		}
		int hashedKey = key % capacity;
		if (bucket[hashedKey] == null) {
			bucket[hashedKey] = new LinkedList<Integer>();
		}
		bucket[hashedKey].add(key);
		count++;
	}
	
	public void remove(int key) {
		int hashedKey = key % capacity;
		List<Integer> list = bucket[hashedKey];
		if(list != null) {
			Iterator<Integer> itr = list.iterator();
			while(itr.hasNext()) {
				if(itr.next() == key) {
					itr.remove();
					count--;
				}
			}
		}
	}
	
	public boolean contains(int key) {
		int hashedKey = key % capacity;
		List<Integer> list = bucket[hashedKey];
		if(list != null) {
			for(int entry : list) {
				if(entry == key) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "MyHashSet [bucket=" + Arrays.toString(bucket) + "]";
	}

	public static void main(String [] args) {
		MyHashSet mySet = new MyHashSet();
		for(int i = 10 ; i <= 100 ; i = i+5) {
			mySet.add(i);
		}
		
		for(int i = 10 ; i <= 100 ; i = i+5) {
			System.out.println("Does Myset Comtains "+i+" : "+mySet.contains(i));
		}
		
		System.out.println("----------------------");
		
		mySet.remove(10);
		mySet.remove(100);
		mySet.remove(50);
		
		System.out.println("----------------------");
		

		for(int i = 10 ; i <= 100 ; i = i+10) {
			System.out.println("Does Myset Comtains "+i+" : "+mySet.contains(i));
		}
	}

}

/*
 Does Myset Comtains 10 : true
Does Myset Comtains 15 : true
Does Myset Comtains 20 : true
Does Myset Comtains 25 : true
Does Myset Comtains 30 : true
Does Myset Comtains 35 : true
Does Myset Comtains 40 : true
Does Myset Comtains 45 : true
Does Myset Comtains 50 : true
Does Myset Comtains 55 : true
Does Myset Comtains 60 : true
Does Myset Comtains 65 : true
Does Myset Comtains 70 : true
Does Myset Comtains 75 : true
Does Myset Comtains 80 : true
Does Myset Comtains 85 : true
Does Myset Comtains 90 : true
Does Myset Comtains 95 : true
Does Myset Comtains 100 : true
----------------------
----------------------
Does Myset Comtains 10 : false
Does Myset Comtains 20 : true
Does Myset Comtains 30 : true
Does Myset Comtains 40 : true
Does Myset Comtains 50 : false
Does Myset Comtains 60 : true
Does Myset Comtains 70 : true
Does Myset Comtains 80 : true
Does Myset Comtains 90 : true
Does Myset Comtains 100 : false

 * */
