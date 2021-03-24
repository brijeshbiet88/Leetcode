package com.interview.leetcode;

public class CompressString {

	public static void main(String[] args) {
		System.out.println("------------------Test Case 1--------------------");
		char chars [] = {'a' , 'a' , 'a' , 'b' , 'b' , 'c'}; 
		int index = compress(chars);
		System.out.println("Index : "+index);
		
		for(int i = 0 ; i < index ; i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------Test Case 2--------------------");
		char chars2 [] = {'a' , 'a' ,'b' , 'c'}; 
		index = compress(chars2);
		System.out.println("Index : "+index);
		
		for(int i = 0 ; i < index ; i++) {
			System.out.print(chars2[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("------------------Test Case 3--------------------");
		char chars3 [] = {'a' }; 
		index = compress(chars3);
		System.out.println("Index : "+index);
		
		for(int i = 0 ; i < index ; i++) {
			System.out.print(chars3[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------Test Case 4--------------------");
		char chars4 [] = {'a' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' }; 
		index = compress(chars4);
		System.out.println("Index : "+index);
		
		for(int i = 0 ; i < index ; i++) {
			System.out.print(chars4[i]+" ");
		}
		System.out.println();

	}
	
	public static int compress(char[] chars) {
		int index = 0;
		int n = chars.length;
		int i = 0;
		while (i < n - 1) {
			int j = i + 1;
			while ( j < n &&  chars[i] == chars[j]) {
				j++;
			}

			if (j - i == 1) {
				chars[index++] = chars[i];
			} else {
				chars[index++] = chars[i];
				if ((j - i) < 10)
					chars[index++] = String.valueOf((j - i)).charAt(0);
				else if ((j - i) >= 10) {
					index = updateResult(chars, index, i, j);
				}
			}

			i = j;

		}

		if (i == n - 1 && n > 1 && chars[n - 1] != chars[n - 2])
			chars[index++] = chars[n - 1];

		else if (i == n - 1 && n == 1) {
			chars[index++] = chars[0];
		}

		return index;

	}

	private static int updateResult(char[] chars, int index, int i, int j) {
		int start = 0;
		
		
		String str = String.valueOf((j-i));
		
		while(start < str.length()) {
			chars[index++] = str.charAt(start);
			start++;
		}
		
     return index;
	}

}

/*
 * ------------------Test Case 1--------------------
Index : 5
a 3 b 2 c 
------------------Test Case 2--------------------
Index : 4
a 2 b c 
------------------Test Case 3--------------------
Index : 1
a 
------------------Test Case 4--------------------
Index : 4
a b 1 2 

 * */
