package week5;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class example3 extends JFrame{
	private JLabel text = new JLabel("HELLO");
	
	public example3() {
		setTitle("실습예제03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new MyKeyListener());
		
		text.setSize(50,20);
		text.setLocation(100,100);
		c.add(text);
		
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			int a = 10;
			if(keyCode == KeyEvent.VK_UP) {
				text.setLocation(text.getX(), text.getY()-a);
			}
			else if(keyCode == KeyEvent.VK_DOWN) {
				text.setLocation(text.getX(), text.getY()+a);
			}
			else if(keyCode == KeyEvent.VK_LEFT) {
				text.setLocation(text.getX()-a, text.getY());
			}
			else if(keyCode == KeyEvent.VK_RIGHT) {
				text.setLocation(text.getX()+a, text.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example3();
	}

}
