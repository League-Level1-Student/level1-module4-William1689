package _10_slot_machine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Slot_Machine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel money = new JLabel();
	JPanel panelMaddox = new JPanel();
	JLabel happy ;
	JLabel amount = new JLabel();
	JLabel sad ;
	JLabel poop;
	JLabel happy2 ;
	JLabel sad2 ;
	JLabel poop2;
	JLabel happy3 ;
	JLabel sad3 ;
	JLabel poop3;
	int balance = 100;
	int winning = 10;
	int score = 0;
	Random ran = new Random();

	public void run() {

		panel.setLayout(null);
		frame.setTitle("Slot Machine");
		panel.setPreferredSize(new Dimension(800, 800));
		label.setBounds(85, 700, 700, 70);
		label.setFont(new Font("Arial", Font.BOLD, 28));
		label.setText("99% of Gamblers quit just before their big win");
		button.setBounds(100, 600, 600, 100);
		button.setText("SPIN ($5)");
		money.setText("Bank Account Balance: $" + balance);
		money.setBounds(300, 780, 200, 10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		panelMaddox.setBounds(0,250, 800, 230);
		
		




		try {


			sad = createLabelImage("sadFace.png");
			poop = createLabelImage("poopFace.png");
			happy = createLabelImage("happyFace.png");
			sad2 = createLabelImage("sadFace.png");
			poop2 = createLabelImage("poopFace.png");
			happy2 = createLabelImage("happyFace.png");
			sad3 = createLabelImage("sadFace.png");
			poop3 = createLabelImage("poopFace.png");
			happy3 = createLabelImage("happyFace.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		frame.add(panel);
		panel.add(panelMaddox);
		frame.setVisible(true);
		//happy.setBounds(270,250,230,230);
		amount.setText("Amount to Win: $"+winning);
		panel.add(button);
		panel.add(label);
		
		panel.add(amount);
				panelMaddox.add(sad);
		panelMaddox.add(happy);
	panelMaddox.add(poop);

		
		amount.setBounds(350, 100, 350, 100);

		//poop.setBounds(520,250,230,230);
		//sad.setBounds(20,250, 230, 230);

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if(b == button) {
			winning+=10;
			score++;
			balance-=5;
			money.setText("Bank Account Balance: $" + balance);
			amount.setText("Amount to Win: $"+winning);
			int slot1 = ran.nextInt(4);
			int slot2 = ran.nextInt(4);
			int slot3 = ran.nextInt(4);
			panelMaddox.removeAll();
			if(balance<-0) {
				JOptionPane.showMessageDialog(null, "You ran out of money, come back when you have more. Your final score was: "+ score);
			
				
			}
			
			if(slot1 == 0) {
				panelMaddox.add(sad);
				
			}
			if(slot1 == 1) {
				panelMaddox.add(poop);
				
			}
			if(slot1 == 2) {
				panelMaddox.add(happy);
				
			}
			if(slot1 == 3) {
				panelMaddox.add(sad);
				
			}
			if(slot2 == 0) {
				panelMaddox.add(sad2);
				
			}
			if(slot2 == 1) {
				panelMaddox.add(poop2);
				
			}
			if(slot2 == 2) {
				panelMaddox.add(happy2);
				
			}
			if(slot2 == 3) {
				panelMaddox.add(poop2);
				
			}
			if(slot3 == 0) {
				panelMaddox.add(sad3);
				
			}
			if(slot3 == 1) {
				panelMaddox.add(poop3);
				
			}
			if(slot3 == 2) {
				panelMaddox.add(happy3);
				
			}
			if(slot3 == 3) {
				panelMaddox.add(happy3);
				
			}
			if(slot1 == 0 && slot2 == 0 && slot3 == 0) {
				balance+= winning;
				winning = 10;
			}
			if(slot1 == 3 && slot2 == 0 && slot3 == 0) {
				balance+= winning;
				winning = 10;
			}
			if(slot1 == 1 && slot2 == 1 && slot3 == 1) {
				balance-= winning/4;
			
			}
			if(slot1 == 1 && slot2 == 3 && slot3 == 1) {
				balance-= winning/4;
				
			}
			if(slot1 == 2 && slot2 == 2 && slot3 == 2) {
				balance+= winning;
				winning = 10;
			}
			if(slot1 == 2 && slot2 == 2 && slot3 == 3) {
				balance+= winning;
				winning = 10;
			}
			panelMaddox.repaint();
			

		}

	}

}