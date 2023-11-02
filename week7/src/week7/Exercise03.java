package week7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import java.awt.*;
import java.awt.event.*;

public class Exercise03 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[2];
	private JLabel colorLabel = new JLabel("I Love Coffee");
	
	private JLabel[] color = new JLabel[3];
	private JSlider[] sl = new JSlider[3];
	
	private menuPanel MyPanel = new menuPanel();
	
	
	public Exercise03() {
		setTitle("EXERCISE_03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Container c = getContentPane();
		c.setLayout(null);
		
		MyPanel.setBounds(0,0,500,300);
		colorLabel.setBounds(50,200,500,300);
		colorLabel.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		c.add(MyPanel);
		c.add(colorLabel);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	class menuPanel extends JPanel{
		public menuPanel() {
			setLayout(null);
			
			ButtonGroup menuGroup = new ButtonGroup();
			MyItemListener listener = new MyItemListener();
			
			radio[0] = new JRadioButton("색상", true);
			radio[0].addItemListener(listener);
			radio[1] = new JRadioButton("크기");
			radio[1].addItemListener(listener);
			
			menuGroup.add(radio[0]);
			menuGroup.add(radio[1]);
			
			radio[0].setSize(100,50);
			radio[0].setLocation(50,20);
			
			radio[1].setSize(100,50);
			radio[1].setLocation(250,20);
			
			add(radio[0]);
			add(radio[1]);
			
			for(int i = 0; i < sl.length; i++) {
				sl[i] = new JSlider(JSlider.HORIZONTAL,0,255,128);
				sl[i].setPaintLabels(true);
				sl[i].setPaintTicks(true);
				sl[i].setPaintTrack(true);
				sl[i].setMajorTickSpacing(50);
				sl[i].setMinorTickSpacing(10);
				sl[i].addChangeListener(new MyChangeListener());
				sl[i].setSize(300,50);
				sl[i].setLocation(100, 60*i+90);
				add(sl[i]);
			}
			
			for(int i = 0; i < color.length; i++) {
				color[i] = new JLabel();
				color[i].setSize(50,50);
				color[i].setLocation(20, 60*i+90);
				add(color[i]);
			}
			color[0].setText("R");
			color[1].setText("G");
			color[2].setText("B");
			
		}
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			
			if(radio[1].isSelected()) {
				sl[0].setMaximum(70);
				sl[0].setValue(35);
				sl[0].setPaintLabels(true);
				sl[0].setMajorTickSpacing(10);
				sl[0].setMinorTickSpacing(5);
				colorLabel.setFont(new Font("TimesRoman", Font.PLAIN, 20));
				colorLabel.setForeground(new Color(0,0,0));
				color[0].setText("크기");
				
				for(int i = 1; i < sl.length; i++) {
					sl[i].setVisible(false);
					color[i].setVisible(false);
				}
			}
			if(radio[0].isSelected()) {
				sl[0].setMaximum(255);
				sl[0].setValue(127);
				sl[0].setMajorTickSpacing(50);
				sl[0].setMinorTickSpacing(10);
				color[0].setText("R");
				
				for(int i=1; i < sl.length; i++) {
					sl[i].setVisible(true);
					sl[i].setValue(127);
					color[i].setVisible(true);
				}
				colorLabel.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			}
		}
	}
	
	class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			if(sl[2].isVisible()) {
				int r = sl[0].getValue();
				int g = sl[1].getValue();
				int b = sl[2].getValue();
				colorLabel.setForeground(new Color(r,g,b));
			}
			if(!sl[2].isVisible())
				colorLabel.setFont(new Font("TimesRoman", Font.PLAIN, sl[0].getValue()));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise03();
	}

}
