package com.interview.leetcode;

public class TownJudge {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case 1---------------");
		int [][] trusts = {{1,3},{2,3}};
		int n = 3;
		System.out.println("Judge is : "+findJudge(n, trusts));
		
		System.out.println("-------------------Test Case 2---------------");
		int [][] trusts2 = {};
		n = 1;
		System.out.println("Judge is : "+findJudge(n, trusts2));
		
		System.out.println("-------------------Test Case 3---------------");
		int [][] trusts3 = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		n = 4;
		System.out.println("Judge is : "+findJudge(n, trusts3));
		
		System.out.println("-------------------Test Case 4---------------");
		int [][] trusts4 = {{1,2},{2,3},{3,1}};
		n = 3;
		System.out.println("Judge is : "+findJudge(n, trusts4));
		
		
	}

	public static int findJudge(int N, int[][] trust) {
		  if(trust.length == 0){
	            if(N == 1) return 1;
	            else return -1;
	        }
	        
			int [] in = new int[N+1];
			int [] out = new int[N+1];
			
			for(int i =0 ; i <  trust.length ; i++) {
				in[trust[i][1]]++;
				out[trust[i][0]]++;
			}
			
			for(int i = 0 ; i <= N  ; i++) {
				if((in[i] == N-1) && out[i] == 0) {
					return i;
				}
			}
			return -1;
	    
    }
}
