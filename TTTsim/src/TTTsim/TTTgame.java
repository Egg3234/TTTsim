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
	private int score1, score2, games, turn, win;
	private int[][] board;

	public TTTgame(int g) {
		games = g;
		turn = 1;
		board = new int[3][3];
		win = 0;
		score1 = 0;
		score2 = 0;
		
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
		
		while(valid==0) {
			 gx = r.nextInt(2-0+1)+0;
			 gy = r.nextInt(2-0+1)+0;
			 
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
	public int win() {
		int winner=0;
		
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
		}
		
		return winner;
	}

}
