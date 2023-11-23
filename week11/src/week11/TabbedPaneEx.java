package week11;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame{
	public TabbedPaneEx() {
		setTitle("탭팬 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		
		c.add(pane, BorderLayout.CENTER);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.addTab("Tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("Tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("Tab3", new MyPanel());
		return pane;
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.PINK);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillRect(10,  10,  50,  50);
			g.setColor(Color.BLUE);
			g.fillRect(10 , 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3에 들어가는 JPanel입니다.", 10, 150);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabbedPaneEx();
	}

}
