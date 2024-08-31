package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	int moleHit = 0;
	int moleMiss = 0;
Date gameStart;
	public void run() {
		// frame.setSize(700, 700);
		panel.setPreferredSize(new Dimension(700, 150));
		frame.setTitle("Whack a Mole");
		frame.setVisible(true);
		// panel.setBounds(350,350, 700,700);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	public void drawButton(int i) {

		int num = 1+ran.nextInt(i);
		while (i > 0) {

			JButton button = new JButton("             ");
			// button.setBounds(i, i, i, i);
			panel.add(button);

			button.addActionListener(this);
			if (i == num) {
				button.setText("Mole ._.");
			}
			i--;
		}
		frame.pack();
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		moleHit = 0;
		moleMiss =0;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		WhackAMole whackAMole = new WhackAMole();
		whackAMole.run();
		whackAMole.drawButton(24);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equalsIgnoreCase("mole ._.")) {
			if(moleHit == 0) {
				gameStart = new Date();
			}
			
			moleHit += 1;
		

		} else {
		
			moleMiss ++;
			
		}
		if(moleHit>=10) {
			endGame(gameStart,10);
		}
		panel.removeAll();
		drawButton(24);

	}
}
