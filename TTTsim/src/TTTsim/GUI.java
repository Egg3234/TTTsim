package TTTsim;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GUI {
	JFrame frame;
	JPanel panel;
	JLabel label1, label2, label3, total;
	JButton button;
	JTextField text1, text2, text3;
	public void GUI(){
		frame = new JFrame("TicTacToe Simultor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
}
}