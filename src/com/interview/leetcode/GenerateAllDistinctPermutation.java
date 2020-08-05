package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

public class GenerateAllDistinctPermutation {

	static Set<String> set = new HashSet<>(); 
	public static void main(String[] args) {
		System.out.println("--------------------------------------Test Case 1--------------------------------------");
		String s1 = "ABC";
		System.out.println("All Permutation Of String "+s1+" ");
		generateAllPermutation(s1);
		set.forEach(s->System.out.print(s+"\t"));
		set.clear();
		System.out.println();
		
		System.out.println("--------------------------------------Test Case 2--------------------------------------");
		s1 = "ABA";
		System.out.println("All Permutation Of String "+s1+" ");
		generateAllPermutation(s1);
		set.forEach(s->System.out.print(s+"\t"));
		set.clear();
		System.out.println();
		
		System.out.println("--------------------------------------Test Case 3--------------------------------------");
		s1 = "ABCB";
		System.out.println("All Permutation Of String "+s1+" ");
		generateAllPermutation(s1);
		set.forEach(s->System.out.print(s+"\t"));
		set.clear();
		System.out.println();

	}
	private static void generateAllPermutation(String str) {
		permuteUtil(str , 0 , str.length()-1);
	}
	
	private static void permuteUtil(String str, int low, int high) {
	
		if(low == high) {
			set.add(str);
		}else {
			
			for (int i = low ; i <=high ; i++) {
				str = swap(str , i  , low);
				permuteUtil(str, low+1, high);
				str = swap(str , i , low);
			}
		}
		
	}
	
	private static String swap(String str, int i, int j) {
		char[] strArr = str.toCharArray();
		char temp = str.charAt(i);
		strArr[i] = strArr[j];
		strArr[j] = temp;
		return String.valueOf(strArr);
	}

}
/*
 --------------------------------------Test Case 1--------------------------------------
All Permutation Of String ABC 
ACB	BCA	ABC	CBA	BAC	CAB	
--------------------------------------Test Case 2--------------------------------------
All Permutation Of String ABA 
ABA	AAB	BAA	
--------------------------------------Test Case 3--------------------------------------
All Permutation Of String ABCB 
BACB	BBCA	CBBA	CABB	ABBC	ACBB	BCAB	BBAC	ABCB	BABC	BCBA	CBAB	

 */
