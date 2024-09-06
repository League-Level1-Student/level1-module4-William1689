package _10_slot_machine;

import java.awt.Dimension;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Slot_Machine {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel money = new JLabel();
	JLabel happy ;
	JLabel sad ;
	JLabel poop;
	int balance = 100;

	public void run() {
		
		panel.setLayout(null);
		frame.setTitle("Slot Machine");
		panel.setPreferredSize(new Dimension(800, 800));
		label.setBounds(85, 700, 700, 70);
		label.setFont(new Font("Arial", Font.BOLD, 28));
		label.setText("99% of Gamblers quit just before their big win");
		button.setBounds(100, 600, 600, 100);
		button.setText("GAMBLE");
		money.setText("Bank Account Balance: $" + balance);
		money.setBounds(300, 780, 200, 10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		try {
			
			
			sad = createLabelImage("sadFace.png");
			poop = createLabelImage("poopFace.png");
			happy = createLabelImage("happyFace.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.add(panel);
		frame.setVisible(true);
		happy.setBounds(270,250,230,230);
		panel.add(button);
		panel.add(label);
		panel.add(poop);
		panel.add(sad);
		poop.setBounds(520,250,230,230);
		sad.setBounds(20,250, 230, 230);
		panel.add(happy);
		panel.add(money);
		frame.pack();
		frame.setVisible(true);
		
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    

	public static void main(String[] args) {
		Slot_Machine machine = new Slot_Machine();
		machine.run();
	}

}