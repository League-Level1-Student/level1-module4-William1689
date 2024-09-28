package _11_lights_out;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JPanel gamePanel = new JPanel();
	JLabel[] labels;
	JFrame frame = new JFrame();
	
	
	

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
			gamePanel.setLayout(new GridLayout (5,5));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//2. Add 25 JLabels to your gamePanel (these are your lights)
			labels = new JLabel[25];
			for (int i = 0; i < labels.length; i++) {
				labels[i] = new JLabel();
				if(new Random().nextBoolean()) {
				labels[i].setBackground(Color.YELLOW);
				}else {
					labels[i].setBackground(Color.WHITE);
				}
				labels[i].setOpaque(true);
				labels[i].setBorder(new LineBorder(Color.black,5));
				labels[i].setText(Integer.toString(i));
				labels[i].addMouseListener(this);
				
				
				gamePanel.add(labels[i]);
			}
		
			//3. Use setText() to add a position number to each light (0-24).
			
			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);

			//5. Add a mouseListener to each light
		
		
		//6. Add your panel to a frame
			gamePanel.setPreferredSize(new Dimension(1250,1000));
			frame.add(gamePanel);
		//7. Set the size of the frame
	frame.setVisible(true);
	frame.pack();
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
		JLabel j = (JLabel) e.getSource();
		
			
		
		// 2. Get the number (position) of the light
		
		int num = Integer.parseInt(j.getText());
		// 3. Now use the makeMove method to code which lights turn on and off.
		makeMove(num);
		// 4.Check if the player has won (i.e. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color
		boolean won = true;
		for(JLabel label:labels) {
			if(label.getBackground() == Color.YELLOW) {
				
				won = false;
			}
			
				
		}
		
		if(won) {
			JOptionPane.showMessageDialog(null, "You have won!!!!");
		}
		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.YELLOW);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
