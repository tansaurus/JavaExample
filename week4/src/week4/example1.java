package week4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class example1 extends JFrame{
	
	private JLabel text = new JLabel("hello");
	
	public example1() {
		setTitle("실습예제01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		
		text.setSize(50,20); //16line 배치관리자를 null로해서
		text.setLocation(30,30);
		c.add(text);
		
		setSize(500,500);
		setVisible(true);
	}
	
	public class MyMouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			text.setLocation(e.getX(), e.getY());
		}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example1();
		}

}
