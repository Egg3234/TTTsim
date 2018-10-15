package TTTsim;
/*
 * Main class for TTTsim which runs the program
 * 
 * 10-12-18
 * 
 * Samuel Giesbrecht
 * Luke Schroeder
 * Noah Voth
 */

public class TTTsim {

	public static void main(String[] args) {
		TTTgame game=new TTTgame(1);
		//Runs an instance of the GUI
		GUI g = new GUI();
		g.GUI();

	}

}
