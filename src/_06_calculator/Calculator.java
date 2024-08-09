package _06_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
 JFrame frame = new JFrame();
 JButton add = new JButton();
 JButton subtract = new JButton();
 JButton multiply = new JButton();
 JButton divide = new JButton();
 JLabel label = new JLabel();
 JPanel panel = new JPanel();
 JTextField num1 = new JTextField();
 JTextField num2 = new JTextField();
 public void run() {
	 add.setText("Add");
	 subtract.setText("Subtract");
	 multiply.setText("Multiply");
	 divide.setText("Divide");
	 frame.setVisible(true);
	// frame.setSize(500, 400);
	 panel.setPreferredSize(new Dimension(500,500));
	 panel.setLayout(null);
	 frame.add(panel);
	 panel.add(label);
	 panel.add(add);
	 panel.add(subtract);
	 panel.add(multiply);
	 panel.add(divide);
	 panel.add(num1);
	 panel.add(num2);
	label.setBounds(250, 350, 100, 100);
	 add.setBounds(100,250 ,50, 50);	
	 subtract.setBounds(175,250,50,50);
	 multiply.setBounds(250,250,50,50);
	 divide.setBounds(325,250,50,50);
	 num1.setBounds(150, 100, 40, 30);
	 num2.setBounds(300, 100, 40, 30);
	 add.addActionListener(this);
	 subtract.addActionListener(this);
	 multiply.addActionListener(this);
	 divide.addActionListener(this);
 frame.pack();
	 
	
 }


public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.run();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b = (JButton) e.getSource();
	if(b == add) {
		
		int input1= Integer.parseInt(num1.getText());
		int input2= Integer.parseInt(num2.getText());
		int answer = input1 + input2;
		
		label.setText(  String.valueOf(answer)    );
		
}
if(b == subtract) {
	int input1= Integer.parseInt(num1.getText());
	int input2= Integer.parseInt(num2.getText());
	int answer = input1 - input2;
	
	label.setText(  String.valueOf(answer)    );
}
if (b == multiply) {
	int input1= Integer.parseInt(num1.getText());
	int input2= Integer.parseInt(num2.getText());
	int answer = input1 * input2;
	
	label.setText(  String.valueOf(answer)    );
}
if (b == divide) {
	int input1= Integer.parseInt(num1.getText());
	int input2= Integer.parseInt(num2.getText());
	int answer = input1 / input2;
	
	label.setText(  String.valueOf(answer)    );
}



















}


















}
