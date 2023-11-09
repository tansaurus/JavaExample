package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogEx extends JFrame{
	private MyDialog dialog;
	
	public DialogEx() {
		super("DialogEx  예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		dialog = new MyDialog(this, "Test Dialog");
		
		JButton btn = new JButton("Show Dialog");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String text = dialog.getInput();
				if(text ==null) {
					return;
				}
				btn.setText(text);
			}
		});
		
		btn.setBounds(60,50,120,20);
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
		
	}
	
	class MyDialog extends JDialog{
		private JTextField tf = new JTextField(10);
		private JButton okButton = new JButton("OK");
		
		public MyDialog(JFrame frame, String title) {
			super(frame, title, true);
			setLayout(new FlowLayout());
			add(tf);
			add(okButton);
			setSize(200, 100);
			
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
		}
		
		public String getInput() {
			if(tf.getText().length()==0)
				return null;
			else
				return tf.getText();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogEx();
	}

}
