package com.interview.leetcode;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println("----------Test Case 1 -----------------");
		System.out.println("Using Recursion");
		for(int n = 1; n <= 15 ; n++) {
			System.out.println(countAndSay(n));
		}
		System.out.println();
		System.out.println("-------------Test Case 2---------------");
		System.out.println("Using Dynamic Programming");
		
		for(int n = 1; n <= 10 ; n++) {
			System.out.println(countAndSayDp(n));
		}
		
	}
	
	public static String countAndSay(int n) {

		if (n == 1) {
			return "1";
		}

		String str = countAndSay(n - 1);
		int count = 1;
		StringBuilder sb = new StringBuilder();

		if (str.length() == 1) {
			sb.append("1");
			sb.append(str.charAt(0));
		}
		int i = 1;
		while (i < str.length()) {
			
			char c = str.charAt(i-1);
			while (i < str.length() &&  c == str.charAt(i)) {
				count++;
				i++;
			}
			
			sb.append(count);
			sb.append(str.charAt(i - 1));
			count = 1;
			i++;
		}
		
		if(str.length() >= 2 && str.charAt(str.length()-2) != str.charAt(str.length()-1)) {
			sb.append("1");
			sb.append(str.charAt(str.length()-1));
		}

		return sb.toString();

	}
	
	public static String countAndSayDp(int n) {
	String [] dp = new String[n+1];
	dp[1] = "1";
	int count = 1;
	
	for(int index = 2; index <=n ;index++) {
		StringBuilder sb = new StringBuilder();
		int i = 1;
		String str = dp[index-1];
		if(str.length() == 1) {
			sb.append(1);
			sb.append(str.charAt(0));
		}
		while (i < str.length()) {
			
			char c = str.charAt(i-1);
			while (i < str.length() &&  c == str.charAt(i)) {
				count++;
				i++;
			}
			
			sb.append(count);
			sb.append(str.charAt(i - 1));
			count = 1;
			i++;
		}
		
		if(str.length() >= 2 && str.charAt(str.length()-2) != str.charAt(str.length()-1)) {
			sb.append("1");
			sb.append(str.charAt(str.length()-1));
		}
		dp[index] = sb.toString();
	}
	
	return dp[n];
	}

}
/*

----------Test Case 1 -----------------
Using Recursion
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211

-------------Test Case 2---------------
Using Dynamic Programming
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211


 * */
