package week3;
import java.awt.*;
import javax.swing.*;

public class TestEx01 extends JFrame{
	
	public TestEx01() {
		setTitle("TestEx01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3,5,5,5);
		
		
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i = 1; i <= 10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setBackground(Color.GREEN);
			c.add(jb);
		}
		
		JButton jb = new JButton(Integer.toString(1));
		jb.setBackground(Color.BLACK);
		jb.setForeground(Color.WHITE);
		c.add(jb);
		
		JButton jb2 = new JButton(Integer.toString(2));
		jb2.setBackground(Color.GRAY);
		c.add(jb2);
		
		JButton jb3 = new JButton(Integer.toString(3));
		jb3.setBackground(Color.PINK);
		c.add(jb3);
		
		
		
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestEx01();
	}

}
