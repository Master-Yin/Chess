package chess;

import javax.swing.JFrame;

public class Chess {

	public static void main(String args[]) {
		JFrame frame = new JFrame ("Checkers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 640);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
}
