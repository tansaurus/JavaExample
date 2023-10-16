package week4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{

	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제_Inner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener());
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			setTitle(b.getText());
			//InnerClassListener.this.setTitle(b.getText());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}
	

}

