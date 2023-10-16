package week5;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class example4 extends JFrame{
	public JLabel result1=new JLabel("0");
	public JLabel result2=new JLabel("0");
	public JLabel result3=new JLabel("0");
	public JLabel result4=new JLabel("Gambling Game");
	public int count = 0;
	
	public example4() {
		setTitle("Gambling Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		result1.setOpaque(true);
		result1.setBackground(Color.PINK);
		result1.setSize(100,50);
		result1.setLocation(40,80);
		result1.setHorizontalAlignment(SwingConstants.CENTER);
		
		result2.setOpaque(true);
		result2.setBackground(Color.PINK);
		result2.setSize(100,50);
		result2.setLocation(180,80);
		result2.setHorizontalAlignment(SwingConstants.CENTER);
		
		result3.setOpaque(true);
		result3.setBackground(Color.PINK);
		result3.setSize(100,50);
		result3.setLocation(320,80);
		result3.setHorizontalAlignment(SwingConstants.CENTER);
		
		result4.setSize(300,50);
		result4.setLocation(80,150);
		
		
		c.add(result1);
		c.add(result2);
		c.add(result3);
		c.add(result4);
		
		
		
		setSize(500, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			
			Random rd = new Random();
			int first = rd.nextInt(5);
			int second = rd.nextInt(5);
			int third = rd.nextInt(5);
			
			if(keyCode == KeyEvent.VK_ENTER) {
				result1.setText(Integer.toString(first));
				result2.setText(Integer.toString(second));
				result3.setText(Integer.toString(third));
				count++;
				if(first == second) {
					if(second == third) {
						result4.setText("시도횟수 " + count + "번 축하합니다!");
						count = 0;
					}
					else {
					
					result4.setText("아쉽군요");
					result4.setText("시도횟수 " + count);
				}
					
				}
				else {
				result4.setText("아쉽군요");
				result4.setText("시도횟수 " + count);
			}
			}
			
			
			
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example4();
	}

}
