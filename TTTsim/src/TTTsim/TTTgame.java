package TTTsim;
/*
 * Samuel Giesbrecht
 * Luke Schroeder
 * Noah Voth
 * 
 * 10-03-18
 * 
 * Game Object for TTT Simulator
 */

import java.util.Random;

public class TTTgame {
	//Variables
	TTTSemiUsefulThings wt;
	private int score1, score2, games, turn, win;
	private int[][] board;

	//Constructor
	public TTTgame(int g) {
		wt = new TTTSemiUsefulThings();
		games = g;
		turn = 1;
		board = new int[3][3];
		win = 0;
		score1 = 0;
		score2 = 0;
		
		//Assigns all tiles a default value of zero
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = 0;
			}
		}

	}
	
	/**
	 * Plays a turn and returns a square
	 */
	public void pTurn() {
		Random r = new Random();
		int valid = 0;
		int gx, gy;
		
		//Randomly chooses a tile to place an x or o on
		while(valid==0) {
			 gx = r.nextInt(2-0+1)+0;
			 gy = r.nextInt(2-0+1)+0;
			 
			 //Determines if that tile has already been taken, if so, makes it re-pick, otherwise sets that tile value to x or o (1 or 2)
			if(board[gx][gy]==0) {
				if(turn%2==1) {
					board[gx][gy] = 1;
				}else if(turn%2==0) {
					board[gx][gy] = 2;
				}else {
					System.out.println("Error 1: TTTg - 49");
				}
				valid = 1;
			}
		}

	}
	
	/**
	 * Determines if anyone has won
	 */
	public int win(int t) {
		int winner=0;
		int time = t;
		
		//Checks all possibilities for player 1
		if(board[0][0]==1&&board[0][1]==1&&board[0][2]==1) {
			winner = 1;
		}else if(board[1][0]==1&&board[1][1]==1&&board[1][2]==1) {
			winner = 1;
		}else if(board[2][0]==1&&board[2][1]==1&&board[2][2]==1) {
			winner = 1;
		}else if(board[0][0]==1&&board[1][0]==1&&board[2][0]==1) {
			winner = 1;
		}else if(board[0][1]==1&&board[1][1]==1&&board[2][1]==1) {
			winner = 1;
		}else if(board[0][2]==1&&board[1][2]==1&&board[2][2]==1) {
			winner = 1;
		}else if(board[0][0]==1&&board[1][1]==1&&board[2][2]==1) {
			winner = 1;
		}else if(board[0][2]==1&&board[1][1]==1&&board[1][2]==1) {
			winner = 1;
		
		//Starting here checks all possibilities for player 2
		}else if(board[0][0]==2&&board[0][1]==2&&board[0][2]==2) {
			winner = 2;
		}else if(board[1][0]==2&&board[1][1]==2&&board[1][2]==2) {
			winner = 2;
		}else if(board[2][0]==2&&board[2][1]==2&&board[2][2]==2) {
			winner = 2;
		}else if(board[0][0]==2&&board[1][0]==2&&board[2][0]==2) {
			winner = 2;
		}else if(board[0][1]==2&&board[1][1]==2&&board[2][1]==2) {
			winner = 2;
		}else if(board[0][2]==2&&board[1][2]==2&&board[2][2]==2) {
			winner = 2;
		}else if(board[0][0]==2&&board[1][1]==2&&board[2][2]==2) {
			winner = 2;
		}else if(board[0][2]==2&&board[1][1]==2&&board[1][2]==2) {
			winner = 2;
		}else {
			winner = 0;
		}
		
		wt.wait(time);
		
		//Returns 0 if no-one won, 1 for player 1, 2 for player 2
		return winner;
	}
	
	/**
	 * 
	 */

}
