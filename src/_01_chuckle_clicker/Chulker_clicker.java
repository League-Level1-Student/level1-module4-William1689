package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chulker_clicker {
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");
public static void main(String[] args) {

	
Chulker_clicker chuckle = new Chulker_clicker();
	
	chuckle.makeButton();
}
	
public void makeButton() {	
JFrame frame = new JFrame();	
frame.setVisible(true);
frame.setSize(500,500);
frame.setName("Chuckle Clicker");
JPanel panel = new JPanel();
frame.add(panel);

panel.add(joke);
panel.add(punchline);
frame.pack();



	
	
	
}
}
