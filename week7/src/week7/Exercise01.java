package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise01 extends JFrame{
	private JComboBox<String> strCombo = new JComboBox<String>();
	
	private JTextField tField = new JTextField(10);
	
	public Exercise01() {
		setTitle("Exercise01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tField);
		c.add(strCombo);
		
		tField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String str = t.getText();
				strCombo.addItem(str);
				tField.setText("");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise01();
	}

}
