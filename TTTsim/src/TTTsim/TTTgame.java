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
	private int score1, score2, turn, win, game;
	private int[][] board;

	//Constructor
	public TTTgame() {
		game = 1;
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
	public void turn() {
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
				turn++;
			}
		}
		
		printBoard();

	}
	
	/**
	 * Determines if anyone has won
	 */
	public int win() {
		int winner=0;
		
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
		}else if(board[0][2]==2&&board[1][1]==2&&board[2][1]==2) {
			winner = 2;
			
		//And if no one has won
		}else if(board[0][0]!=0&&board[0][1]!=0&&board[0][2]!=0&&board[1][0]!=0&&board[1][1]!=0&&board[1][2]!=0&&board[2][0]!=0&&board[2][1]!=0&&board[2][2]!=0) {
			winner = 3;
		}else {
			winner = 0;
		}
		
		//Returns 0 if no-one won, 1 for player 1, 2 for player 2, 3 for a tie
		return winner;

	}
	
	/**
	 * Resets the board to empty, some game variables
	 */
	public void reset() {
		game++;
		
		//Literally all it does is reset the board here
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = 0;
			}
		}
		
		//Changes up who starts every other game
		switch(game%2) {
		case 0: turn = 2;
		case 1: turn = 1;
		}

	}
	
	/**
	 * Changes p1 score
	 */
	public void sC1(int c) {
		score1 += c;
	}
	
	/**
	 * Changes p2 score
	 */
	public void cS2(int c) {
		score2 += c;
	}
	
	/**
	 * Returns p1 score
	 */
	public int gS1() {
		return score1;
	}
	
	/**
	 * Returns p2 score
	 */
	public int gS2() {
		return score2;
	}
	
	/**
	 * Prints the board in console for debug reasons
	 */
	public void printBoard() {
		switch(board[0][0]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[0][1]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[0][2]) {
		case 0: System.out.println("[ ]");break;
		case 1: System.out.println("[X]");break;
		case 2: System.out.println("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[1][0]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[1][1]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[1][2]) {
		case 0: System.out.println("[ ]");break;
		case 1: System.out.println("[X]");break;
		case 2: System.out.println("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[2][0]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[2][1]) {
		case 0: System.out.print("[ ]");break;
		case 1: System.out.print("[X]");break;
		case 2: System.out.print("[O]");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}
		switch(board[2][2]) {
		case 0: System.out.println("[ ]\n");break;
		case 1: System.out.println("[X]\n");break;
		case 2: System.out.println("[O]\n");break;
		default: System.out.println("Error 2 - printBoard Switch");break;
		}

	}

}
