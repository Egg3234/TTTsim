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
	JLabel label1, label2, label3, total;
	JButton speedup, slowdown;
	JTextField text1, text2, text3;
	public void GUI(){
		//This bit makes the window appear. DO NOT DELETE PLZ
		frame = new JFrame("TicTacToe Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLocationRelativeTo(null);
		panel = new JPanel();
		GridBagConstraints c = new GridBagConstraints();
		//givin' it a title
		label1 = new JLabel("TIC TAC TOE");
		c.gridx = 0;
		c.gridy = 0;
		panel.add(label1, c);
		
		panel = new JPanel();
		//button to make the tttsim go supersonic (not finished)
		speedup = new JButton("SpeedUp");
		c.gridx = 1;
		c.gridy = 2;
		panel.add(speedup, c);
		
		//the second bit that makes the window show up
		frame.setContentPane(panel);
		frame.setVisible(true);
}
}