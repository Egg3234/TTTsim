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
	 * @return
	 */
	public int pTurn() {
		
		
		return 0;

	}

}
