package _10_slot_machine;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine {

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel label = new JLabel();

public void run() {
	frame.setVisible(true);
	panel.setLayout(null);
	frame.setTitle("Slot Machine");
	panel.setPreferredSize(new Dimension(800,800));
	label.setBounds(85, 700, 700, 70);
	label.setFont(new Font("Arial",Font.BOLD,28) );
	label.setText("99% of Gamblers quit just before their big win");
	button.setBounds(100, 600, 600, 100);
	button.setText("GAMBLE");
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	
	frame.pack();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Slot_Machine machine = new Slot_Machine();
	machine.run();
}




































}