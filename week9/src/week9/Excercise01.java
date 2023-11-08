package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Excercise01 extends JFrame{
	private ImagePanel imgpanel = new ImagePanel();
	private MyButton b = new MyButton("Hide/Show");
	int n;
	
	public Excercise01() {
		setTitle("Excercise01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		n = 0;
		
		b.addActionListener(new HideShowBtn());
		
		setContentPane(imgpanel);
		imgpanel.setLayout(new FlowLayout());
		imgpanel.add(b);
		
		setSize(500,350);
		setVisible(true);
	}
	
	class ImagePanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/sunset.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(n%2==0) {
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
			
		}
	}
	
	class MyButton extends JButton{
		MyButton(String s){
			super(s);
		}
	}
	
	public class HideShowBtn implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			n++;
			repaint();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise01();
	}

}
