package TTTsim;
/*
 * Samuel Giesbrecht
 * Luke Schroeder
 * Noah Voth
 * 
 * 10/20/18
 * 
 * Class to test methods from TTTgame
 */

public class tttGameTest {

	public static void main(String[] args) {
		TTTgame g = new TTTgame();
		
		while(g.win()==0) {
			g.turn();
		}
		
		if(g.win()==1||g.win()==2) {
			System.out.println("Winner is: " + g.win());
		}else if(g.win()==3) {
			System.out.println("Tie");
		}
		

	}

}
