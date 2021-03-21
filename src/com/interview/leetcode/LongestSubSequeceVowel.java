package com.interview.leetcode;

public class LongestSubSequeceVowel {

	public static void main(String[] args) {
		String s = "aiaiuaeeiouae-";
		String maxSubSeq = findMaxSubSeq(s);
		System.out.println("Max Subsequence : "+maxSubSeq);

	}

	private static String findMaxSubSeq(String s) {
		StringBuilder sb = new StringBuilder();
		int[][] dp = new int[5][s.length() + 1];
		boolean isMatched = false;
		for (int i = 0; i < 5; i++) {
			isMatched = false;
			char ch = 'a';
			if(i == 0) {
				ch = 'a';
			}
			if(i == 1) {
				ch = 'e';
			}
			if(i == 2) {
				ch = 'i';
			}
			if(i == 3) {
				ch = 'o';
			}
			if(i == 4) {
				ch = 'u';
			}
			for (int j = 1; j <= s.length(); j++) {
				if ((char) ch == 'a') {
					if (s.charAt(j-1) == 'a') {
						dp[i][j] = dp[i][j - 1] + 1;
						if (!isMatched)
							isMatched = true;
					} else {
						dp[i][j] = dp[i][j - 1];
					}

				} else {
					if (s.charAt(j-1) == (char) ch) {
						dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i][j - 1]) + 1;
						if (!isMatched)
							isMatched = true;
					} else {
						dp[i][j] = dp[i][j - 1];
					}
				}
			}
			if (!isMatched)
				return "Not Possible";
		}
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 1 ; j <= s.length();j++) {
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		
		int j = s.length();
		int i =4;
		while(i >= 0) {
			while (j >0) {
			
			if(dp[i][j] != dp [i][j-1] ) {
				sb.append(s.charAt(j-1));
				i--;
				j--;
				break;
			}
			else if(dp[i][j] - dp [i][j-1] == 1) {
				sb.append(s.charAt(j-1));
				
			}
			j--;
			
			}
			System.out.println();
		}
		
		
		return sb.reverse().toString();
	}

}
