package _08_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Translator implements ActionListener {


JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JButton button = new JButton();
JButton button2 = new JButton();
JTextField text = new JTextField();
JTextField text2 = new JTextField();







public Translator(){
	frame.setVisible(true);
	button.addActionListener(this);
	button2.addActionListener(this);
	button.setText("Translate to Latin");
	button2.setText("Translate to English");
	frame.setTitle("Enlgish/Pig Latin Translator");
	panel.setLayout(null);
	panel.setPreferredSize(new Dimension(400,150));
	text.setBounds(20, 32, 350, 30);
	text2.setBounds( 20,90, 350,30);
	button.setBounds(5, 62, 170, 30);
	button2.setBounds(220,62, 170, 30);
	panel.add(text2);
	frame.add(panel);
	panel.add(button2);
	panel.add(text);
	panel.add(button);
	frame.pack();
}


public static void main(String[] args) {
	new Translator();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b = (JButton) e.getSource();
	if(b == button) {
		text2.setText(PigLatinTranslator.translateEnglishToPigLatin(text.getText()));
	}
	
	if(b == button2) {
		text.setText(PigLatinTranslator.translatePigLatinToEnglish(text2.getText()));
	}
}
}
