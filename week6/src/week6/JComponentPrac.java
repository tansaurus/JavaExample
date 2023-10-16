package week6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; //font 때문에

public class JComponentPrac extends JFrame{
	
	
	public JComponentPrac() {
		setTitle("JComponentPrac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magneta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		
		b2.setEnabled(false);
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getX() + "+" + b.getY());
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentPrac();
	}

}
