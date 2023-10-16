package week3;
import java.awt.*;

import javax.swing.*;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4,5,5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		//c.add(new JLabel(" 이름", JLabel.CENTER));
		//c.add(new JTextField(""));
		//c.add(new JLabel(" 학번", JLabel.CENTER));
		//c.add(new JTextField(""));
		//c.add(new JLabel(" 학과", JLabel.CENTER));
		//c.add(new JTextField(""));
		//c.add(new JLabel(" 과목", JLabel.CENTER));
		//c.add(new JTextField(""));
		for(int i = 0; i < 15; i++) {
			c.add(new JButton("1"));
		}//가로가 우선순위가 아니라 표를 맞추는 것을 우선순위로 함 최대한 정사각형으로
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
