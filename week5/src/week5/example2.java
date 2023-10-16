package week5;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import week5.KeyListener.MyKeyListener;



public class example2 extends JFrame{
	public JLabel result = new JLabel();
	
	public example2() {
		setTitle("Key Code 실습예제 : F1키:초록색, %키:노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(result);
		
		c.addKeyListener(new MyKeyListener());
		
		setSize(500,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if(KeyEvent.getKeyText(keyCode).equals("F1")) {
				result.setText("F1");
				getContentPane().setBackground(Color.green);
			}else if(KeyEvent.getKeyText(keyCode).equals("5")) {
				result.setText("%");
				getContentPane().setBackground(Color.yellow);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example2();
	}

}
