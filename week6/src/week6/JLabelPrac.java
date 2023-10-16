package week6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JLabelPrac extends JFrame{

	
	public JLabelPrac() {
		setTitle("JLabelPrac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel("사랑합니다", beauty, SwingConstants.RIGHT);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("전화하세요", normalIcon, SwingConstants.LEFT);
		
		//c.add(textLabel);
		c.add(imageLabel,BorderLayout.NORTH);
		c.add(label,BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JLabelPrac();
	}

}
