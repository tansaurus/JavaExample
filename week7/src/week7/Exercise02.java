package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise02 extends JFrame{
	
	private JTextField tField = new JTextField(10);
	private JLabel tArea1 = new JLabel();
	private JLabel tArea2 = new JLabel();
	private JLabel tArea3 = new JLabel();
	private JLabel tArea4 = new JLabel();
	private JLabel tArea5 = new JLabel();
	
	public Exercise02() {
		setTitle("Exercise02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		GridLayout grid = new GridLayout(5,2);
		
		Panel north = new Panel();
		north.setLayout(new FlowLayout());
		
		Panel center = new Panel();
		center.setLayout(grid);
		
		
		JButton btn = new JButton("계산");
		JLabel total = new JLabel("금액");
		JLabel oman = new JLabel("오만원");
		JLabel man = new JLabel("만원");
		JLabel ocheon = new JLabel("오천원");
		JLabel cheon = new JLabel("천원");
		JLabel coin = new JLabel("동전");
		
		north.add(total);
		north.add(tField);
		north.add(btn);
		add(north, BorderLayout.NORTH);
		
		center.add(oman);
		center.add(tArea1);
		center.add(man);
		center.add(tArea2);
		center.add(ocheon);
		center.add(tArea3);
		center.add(cheon);
		center.add(tArea4);
		center.add(coin);
		center.add(tArea5);
		add(center, BorderLayout.CENTER);
		
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number = Integer.parseInt(tField.getText());
				tArea1.setText(String.valueOf(number / 50000) + "장");
				tArea2.setText(String.valueOf(number % 50000 / 10000) + "장");
				tArea3.setText(String.valueOf(number % 10000 / 5000) + "장");
				tArea4.setText(String.valueOf(number % 5000 / 1000) + "장");
				tArea5.setText(String.valueOf(number % 1000) + "원");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise02();
	}

}
