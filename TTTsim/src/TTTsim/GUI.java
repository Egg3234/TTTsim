package TTTsim;
/*
 * Noah Voth
 * Luke Schroeder
 * Samuel Giesbrecht
 * 
 * 11-14-18
 * 
 * GUI class for TTT simulator
 */

import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
	private JFrame frame;
	private JPanel panel;
	private JLabel label1, label2, label3, title;
	private JLabel[][] grid;
	private JButton speedup, slowdown, play;
	private JTextField text1, text2, text3;
	private String b, x, o;
	private double time=1;
	
	public void GUI(){
		//Creating instances of other classes and initializing variables
		TTTSemiUsefulThings Tools = new TTTSemiUsefulThings();
		TTTgame game = new TTTgame();
		b = "[ ]";
		x = "[X]";
		o = "[O]";
		
		//This bit makes the window appear. DO NOT DELETE PLZ (finished)
		frame = new JFrame("TicTacToe Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		GridBagConstraints c = new GridBagConstraints();
		
		//Givin' it a title (finished)
		title = new JLabel("TIC TAC TOE");
		//This picks the location of the object
		c.gridx = 0;
		c.gridy = 0;
		panel.add(title, c);
		panel = new JPanel();
		
		//Button to make the tttsim go supersonic using TTTSemiUsefullThings's wait bits (finished)
		speedup = new JButton("SpeedUp");
		c.gridx = 1;
		c.gridy = 2;
		panel.add(speedup, c);
		speedup.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0) { 
			time=time/2;
			System.out.println("Speedup " + time);
			} 
			});
		
		//Runs the game
		play = new JButton("Play");
		c.gridx = 2;
		c.gridy = 2;
		panel.add(play, c);
		play.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0) { 
				while(game.win()==0) {
					game.turn();
					Tools.wait(time);
				}
			game.turn();
			Tools.wait(time);
			} 
			});
		
		
		//Hit this button to slow this boi down using TTTSemiUsefullThings's wait bits (finished)
		slowdown = new JButton("Slowdown");
		c.gridx = 3;
		c.gridy = 2;
		panel.add(slowdown, c);
		slowdown.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0) { 
			time=time*2;
			System.out.println("Slowdown " + time);
			} 
			});
		
		//Creates nine squares
		grid = new JLabel[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c.gridx = j + 1;
				c.gridy = i + 2;
				grid[i][j].setText(b);
				panel.add(grid[i][j], c);
			}
		}
		
		//The second bit that makes the window show up (finished)
		frame.setContentPane(panel);
		frame.setVisible(true);
		//That's all folks
}

}