package com.interview.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionLabels {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1------------------");
		String S = "ababcbacadefegdehijhklij";
		List<Integer> list = partitionLabels(S);
		System.out.println("Partition Labels in String : "+S);
		list.forEach(s->System.out.print(s+" "));
		list.clear();
		System.out.println();
		
		System.out.println("------------------Test Case 2------------------");
		S = "rabcbcaghghilmmlnoppns";
		list = partitionLabels(S);
		System.out.println("Partition Labels in String : "+S);
		list.forEach(s->System.out.print(s+" "));
		list.clear();
		System.out.println();
		
		System.out.println("------------------Test Case 3------------------");
		S = "abcdefghijklmnopqrstuvwxyz";
		list = partitionLabels(S);
		System.out.println("Partition Labels in String : "+S);
		list.forEach(s->System.out.print(s+" "));
		list.clear();
		System.out.println();

	}
	
	public static List<Integer> partitionLabels(String S) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Character> charSet = new HashSet<Character>();

		int i = 0;
		int start = 0;
		int target = 0;
		while (i < S.length()) {
			
			int startIndex = start;
			while(start < S.length() && target < S.length()) {
				char c = S.charAt(start);
				if(!charSet.contains(c)) {
					charSet.add(c);
				}
				int indexOfChar = S.indexOf(c , start+1);
				if(indexOfChar != -1 && target < indexOfChar) {
					target = indexOfChar;
				}else if(indexOfChar == -1 && target < start) {
					target = start;
				}
				if(start == target) {
					list.add(target-startIndex+1);
						start++;
					charSet.clear();
					break;
				}
		
			start++;
		}
			i = start;

	}
		return list;
	}
	
	public static List<Integer> partitionLabels2(String S) {
		List<Integer> list = new ArrayList<Integer>();
		int[] lastIndex = new int[26];
		for (int i = 0; i < S.length(); i++) {
			lastIndex[S.charAt(i) - 'a'] = i;
		}
		int j = 0, start = 0;

		for (int i = 0; i < S.length(); i++) {
			j = Math.max(j, lastIndex[S.charAt(i) - 'a']);

			if (i == j) {
				list.add(i - start + 1);
				start = i + 1;
			}
		}
		return list;
	}
}

/*
------------------Test Case 1------------------
Partition Labels in String : ababcbacadefegdehijhklij
9 7 8 
------------------Test Case 2------------------
Partition Labels in String : rabcbcaghghilmmlnoppns
1 6 4 1 4 5 1 
------------------Test Case 3------------------
Partition Labels in String : abcdefghijklmnopqrstuvwxyz
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

 * */
