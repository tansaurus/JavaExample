package week3;
import java.awt.*;
import javax.swing.*;

public class TestEx02 extends JFrame{
	
	public TestEx02() {
		setTitle("TestEx02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4,5,5);
		
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		c.add(p1, BorderLayout.CENTER);
		p1.setLayout(grid);
		for(int i = 0; i < 15; i++) {
			JButton jb = new JButton("1");
			p1.add(jb);
		}
		
		JPanel p2 = new JPanel();
		c.add(p2, BorderLayout.NORTH);
		p2.add(new JLabel("Title"));
		
		
		JPanel p3 = new JPanel();
		c.add(p3, BorderLayout.SOUTH);
		p3.add(new JLabel("Tail"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestEx02();
	}

}
