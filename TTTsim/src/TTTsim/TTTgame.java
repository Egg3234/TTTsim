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
	private int[] board;

	public TTTgame(int g) {
		games = g;
		turn = 1;
		board = new int[9];
		win = 0;
		score1 = 0;
		score2 = 0;
		
		for(int i=0; i<9; i++) {
			board[i] = 0;
		}

	}
	
	/**
	 * Plays a turn and returns a square
	 * @return
	 */
	public int pTurn() {
		Random r = new Random();
		int valid = 0;
		int s;
		
		while(valid==0) {
			s = r.nextInt(8-1+1)+1;
			if(board[s]==0) {
				if(turn%2==1) {
					board[s] = 1;
				}else if(turn%2==0) {
					board[s] = 2;
				}else {
					System.out.println("Error 1: TTTg - 49");
				}
				valid = 1;
			}
		}
		
		return 0;

	}

}
