package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Excercise02 extends JFrame{
	private ImagePanel imgpanel = new ImagePanel();
	int x, y;
	
	public Excercise02() {
		setTitle("Excercise02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = 200;
		y = 100;
		
		setContentPane(imgpanel);
		imgpanel.setLayout(new FlowLayout());
		
		setSize(500,350);
		setVisible(true);
	}
	
	class ImagePanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/sunset.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			addMouseMotionListener(new MouseAdapter() {
				public void mouseMoved(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
			g.setColor(Color.green);
			g.fillOval(x-20,  y-20,  40, 40);
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise02();
	}

}
