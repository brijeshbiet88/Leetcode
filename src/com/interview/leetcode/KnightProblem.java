package com.interview.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class KnightProblem {

	public static void main(String[] args) {
		System.out.println("----------------Test Case 1-------------------");
		int initPosx = 0 ,initPosy = 0;
		int targetPosx = 7 , targetPosy = 7;
		int [][] board = new int[8][8];
		int minMoves = findMinMovesToTarget(board , initPosx , initPosy , targetPosx , targetPosy);
		System.out.println("Minimum Moves to Reach Target : "+targetPosx+","+targetPosy+" from "+initPosx+","+initPosy+" : "+minMoves);
		System.out.println();
		
		System.out.println("----------------Test Case 2-------------------");
		initPosx = 7 ;initPosy = 7;
		targetPosx = 0 ; targetPosy = 0;
		int [][] board2 = new int[8][8];
		minMoves = findMinMovesToTarget(board2 , initPosx , initPosy , targetPosx , targetPosy);
		System.out.println("Minimum Moves to Reach Target : "+targetPosx+","+targetPosy+" from "+initPosx+","+initPosy+" : "+minMoves);
		System.out.println();
		
		System.out.println("----------------Test Case 3-------------------");
		initPosx = 3 ;initPosy = 4;
		targetPosx = 3 ; targetPosy = 4;
		int [][] board3 = new int[8][8];
		minMoves = findMinMovesToTarget(board3 , initPosx , initPosy , targetPosx , targetPosy);
		System.out.println("Minimum Moves to Reach Target : "+targetPosx+","+targetPosy+" from "+initPosx+","+initPosy+" : "+minMoves);
		System.out.println();
		
		System.out.println("----------------Test Case 4-------------------");
		initPosx = 0 ;initPosy = 1;
		targetPosx = 2 ; targetPosy = 3;
		int [][] board4 = new int[8][8];
		minMoves = findMinMovesToTarget(board4 , initPosx , initPosy , targetPosx , targetPosy);
		System.out.println("Minimum Moves to Reach Target : "+targetPosx+","+targetPosy+" from "+initPosx+","+initPosy+" : "+minMoves);
		System.out.println();
	}
	
	
	
	private static int findMinMovesToTarget(int[][] board, int initPosx, int initPosy, int targetPosx, int targetPosy) {
		int [] row = {-2 ,-2, -1, 1,  1, 1, 2 ,  2};
		int [] col = {-1 , 1, -2, 2, -2, 2, 1 , -1};
		int min = Integer.MAX_VALUE;
		Node start = new Node(initPosx , initPosy , 0);
		Queue<Node> q = new LinkedList<>();
		q.add(start);
		
		while(!q.isEmpty()) {	
			Node node = q.poll();
			if(node.x == targetPosx && node.y == targetPosy) {
				min = Math.min(min, node.moves);
			}
			for (int i = 0 ; i < 8 ; i++) {
				if(isValid(board , node , row[i] , col[i] )) {
					q.add(new Node(node.x+ row[i] , node.y + col[i] , node.moves+1));
					board[node.x + row[i]][node.y + col[i]] = 1;
					
				}
			}
		}
		
		return min;
	}


	private static boolean isValid(int[][] board, Node node, int row, int col) {
		if((node.x + row) >= board.length || (node.y + col) >= board.length) {
			return false;
		}
		
		if((node.x + row) < 0 || (node.y + col) < 0) {
			return false;
		}
		
		if(board[node.x+row][node.y + col] == 1) {
			return false;
		}
		return true;
		
	}

	public static class Node {
		private int x;
		private int y ;
		private int moves ;
		
		public Node(int x, int y , int moves) {
			super();
			this.x = x;
			this.y = y;
			this.moves = moves;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getMoves() {
			return moves;
		}

		public void setMoves(int moves) {
			this.moves = moves;
		}

		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + ", moves=" + moves + "]";
		}
		
	}

}
/*
 ----------------Test Case 1-------------------
Minimum Moves to Reach Target : 7,7 from 0,0 : 6

----------------Test Case 2-------------------
Minimum Moves to Reach Target : 0,0 from 7,7 : 6

----------------Test Case 3-------------------
Minimum Moves to Reach Target : 3,4 from 3,4 : 0

----------------Test Case 4-------------------
Minimum Moves to Reach Target : 2,3 from 0,1 : 4


 */
