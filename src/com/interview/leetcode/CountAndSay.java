package com.interview.leetcode;

public class CountAndSay {

	public static void main(String[] args) {
		for(int n = 1; n <= 10 ; n++) {
			System.out.println(countAndSay(n));
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

}
/*
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
