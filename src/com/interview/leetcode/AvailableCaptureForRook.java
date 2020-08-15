package com.interview.leetcode;

public class AvailableCaptureForRook {

	public static void main(String[] args) {
		System.out.println("---------------Test Case 1----------------");
		char [][] board = {
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','p','.','.','.','.'},
							{'.','.','.','R','.','.','.','p'},
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','p','.','.','.','.'},
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','.','.','.','.','.'},
						  };
		int num = numRookCaptures(board);
		System.out.println("Number of Pawns Rook Can Capture : "+num);
		System.out.println();
		
		
		System.out.println("---------------Test Case 2----------------");
		char [][] board2 = {
							{'.','.','.','.','.','.','.','.'},
							{'.','p','p','p','p','p','.','.'},
							{'.','p','p','B','p','p','.','p'},
							{'.','p','B','R','B','p','.','.'},
							{'.','p','p','B','p','p','.','.'},
							{'.','p','p','p','p','p','.','.'},
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','.','.','.','.','.'},
						  };
		num = numRookCaptures(board2);
		System.out.println("Number of Pawns Rook Can Capture : "+num);
		System.out.println();
		
		System.out.println("---------------Test Case 3----------------");
		char [][] board3 = {
							{'.','.','.','.','.','.','.','.'},
							{'.','.','.','p','.','.','.','.'},
							{'.','.','.','p','.','.','.','.'},
							{'p','p','.','R','.','p','B','.'},
							{'.','p','B','R','B','p','.','.'},
							{'.','.','.','.','.','.','.','.'},
							{'.','p','p','p','p','p','.','.'},
							{'.','.','.','.','.','.','.','.'},
						  };
		num = numRookCaptures(board3);
		System.out.println("Number of Pawns Rook Can Capture : "+num);
		System.out.println();
	}
	
	public static int numRookCaptures(char[][] board) {
        int num = 0;
        
        int rookx = 0;
        int rooky = 0;;
        
        for(int i = 0 ; i < board.length ; i++) {
        	for(int j = 0 ; j < board[0].length ; j++) {
        		if(board[i][j] == 'R') {
        			rookx = i;
        			rooky = j;
        			break;
        		}
        	}
        }
        
        for(int i = rookx+1 ; i < board.length ; i++) {
        	if(board[i][rooky] == 'p') {
        		num++;
        		break;
        	}
        	
        	if(board[i][rooky] == 'B') {
        		break;
        	}
        }
        
        for(int i = rookx-1 ; i >=0  ; i--) {
        	if(board[i][rooky] == 'p') {
        		num++;
        		break;
        	}
        	
        	if(board[i][rooky] == 'B') {
        		break;
        	}
        }
        
        for(int j = rooky+1 ; j < board[0].length  ; j++) {
        	if(board[rookx][j] == 'p') {
        		num++;
        		break;
        	}
        	
        	if(board[rookx][j] == 'B') {
        		break;
        	}
        }
        
        for(int j = rooky-1 ; j >=0  ; j--) {
        	if(board[rookx][j] == 'p') {
        		num++;
        		break;
        	}
        	
        	if(board[rookx][j] == 'B') {
        		break;
        	}
        }
        
        
        return num;
    }

}

/*
 ---------------Test Case 1----------------
Number of Pawns Rook Can Capture : 3

---------------Test Case 2----------------
Number of Pawns Rook Can Capture : 0

---------------Test Case 3----------------
Number of Pawns Rook Can Capture : 2

 */
