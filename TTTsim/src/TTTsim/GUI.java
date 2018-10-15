package TTTsim;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GUI {
//preparing a crapton of visual variable things
	JFrame frame;
	JPanel panel;
	JLabel label1, label2, label3, title;
	JButton speedup, slowdown;
	JTextField text1, text2, text3;
	double time=1;
	public void GUI(){
		
		//this imports lukes toolkit
		TTTSemiUsefulThings Tools = new TTTSemiUsefulThings();
		TTTgame game = new TTTgame(0);
		
		//This bit makes the window appear. DO NOT DELETE PLZ (finished)
		frame = new JFrame("TicTacToe Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		GridBagConstraints c = new GridBagConstraints();
		
		//givin' it a title (finished)
		title = new JLabel("TIC TAC TOE");
		//This picks the location of the object
		c.gridx = 0;
		c.gridy = 0;
		panel.add(title, c);
		panel = new JPanel();
		
		//button to make the tttsim go supersonic using TTTSemiUsefullThings's wait bits (finished)
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
		
		//hit this button to slow this boi down using TTTSemiUsefullThings's wait bits (finished)
		slowdown = new JButton("Slowdown");
		c.gridx = 30;
		c.gridy = 2;
		panel.add(slowdown, c);
		slowdown.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0) { 
			time=time*2;
			System.out.println("Slowdown " + time);
			} 
			});
		
		//the second bit that makes the window show up (finished)
		frame.setContentPane(panel);
		frame.setVisible(true);
		//that's all folks
}
}