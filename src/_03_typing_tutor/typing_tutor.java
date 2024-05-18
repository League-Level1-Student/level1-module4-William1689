package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing_tutor {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter);
	}











public static void main(String[] args) {
	

}

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

}





