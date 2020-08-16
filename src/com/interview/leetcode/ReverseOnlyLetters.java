package com.interview.leetcode;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1------------------------");
		String S = "a-bC-dEf-ghIj";
		String rev = reverseOnlyLetters(S);
		System.out.println("String "+S+" after reversing Letters "+ rev);
		System.out.println();
		
		
		System.out.println("----------------Test Case 2------------------------");
		S = "Test1ng-Leet=code-Q!";
		rev = reverseOnlyLetters(S);
		System.out.println("String "+S+" after reversing Letters "+ rev);
		System.out.println(); 
		
		System.out.println("----------------Test Case 3------------------------");
		S = "A-B-C!!";
		rev = reverseOnlyLetters(S);
		System.out.println("String "+S+" after reversing Letters "+ rev);
		System.out.println();
	}

	public static String reverseOnlyLetters(String S) {
		StringBuilder sb = new StringBuilder();
		char[] strArr = S.toCharArray();
		int r = strArr.length - 1, l = 0;

		while (l < r) {

			if (!Character.isAlphabetic(strArr[l]))
				l++;
			else if (!Character.isAlphabetic(strArr[r]))
				r--;

			else {
				char tmp = strArr[l];
				strArr[l] = strArr[r];
				strArr[r] = tmp;
				l++;
				r--;
			}
		}
		
		for(char c : strArr) {
			sb.append(c);
		}

		return sb.toString();
	}
}

/*
 ----------------Test Case 1------------------------
String a-bC-dEf-ghIj after reversing Letters j-Ih-gfE-dCba

----------------Test Case 2------------------------
String Test1ng-Leet=code-Q! after reversing Letters Qedo1ct-eeLg=ntse-T!

----------------Test Case 3------------------------
String A-B-C!! after reversing Letters C-B-A!!


 * */
