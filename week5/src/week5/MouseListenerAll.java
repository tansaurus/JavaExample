package week5;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAll extends JFrame{

	private JLabel la = new JLabel("No mouse event");
	
	public MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed (" + e.getX() + ", " + e.getY() + ")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased (" + e.getX() + ", " + e.getY() + ")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			la.setText("MouseExited");
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + ", " + e.getY() + ")");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAll();
	}

}
