package week6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JButtonPrac extends JFrame{

	public JButtonPrac() {
		setTitle("JButtonPrac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//c.setLayout(null);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		//btn.setSize(300,200);
		//btn.setLocation(150,150);
		//btn.setVerticalAlignment(SwingConstants.BOTTOM);
		c.add(btn);
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonPrac();
	}

}
