package week10;

import javax.swing.*;
import java.awt.*;


public class ToolTipDelayEx extends JFrame{
	public ToolTipDelayEx() {
		setTitle("툴팁 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel cherryLabel = new JLabel(new ImageIcon("images/cherry.jpg"));
		cherryLabel.setToolTipText("체리 이미지");
		
		JLabel appleLabel = new JLabel(new ImageIcon("images/apple.jpg"));
		appleLabel.setToolTipText("사과 이미지");
		
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(500);
		m.setDismissDelay(1000);
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolTipDelayEx();
	}

}
