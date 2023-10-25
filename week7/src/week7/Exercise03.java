package week7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import week7.Radio.MyItemListener;

import java.awt.*;
import java.awt.event.*;

public class Exercise03 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[2];
	private String[] text = {"색상", "크기"};
	private JLabel[] color = new JLabel[3];
	private JSlider[] sl = new JSlider[3];
	private JLabel colorLabel = new JLabel("I Love Coffee");
	
	public Exercise03() {
		
		setTitle("Exercise03");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		color[0] = new JLabel("R");
		color[1] = new JLabel("G");
		color[2] = new JLabel("B");
		
		JPanel radioPanel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		for(int i = 0; i < radio.length; i++) {
		    radio[i] = new JRadioButton();
		    radio[i].setText(text[i]);
		    radioPanel.add(radio[i]);
		    group.add(radio[i]);
		}
		radio[0].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		
		JPanel colorPanel = new JPanel();
		colorPanel.setLayout(new BoxLayout(colorPanel, BoxLayout.Y_AXIS));
		for(int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int r = sl[0].getValue();
					int g = sl[1].getValue();
					int b = sl[2].getValue();
					colorLabel.setForeground(new Color(r,g,b));
				}
			});
			
			colorPanel.add(color[i]);
			colorPanel.add(sl[i]);
			
		}
		
		c.add(colorPanel);
		c.add(colorLabel);	
		
		
		
		radio[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel sizePanel = new JPanel();
				color[0].setText("크기");
				color[1].setVisible(false);
				color[2].setVisible(false);
					
				colorLabel.setForeground(Color.BLACK);
				sl[0].setVisible(false);
				sl[1].setVisible(false);
				sl[2].setVisible(false);
					
				sl[0] = new JSlider(JSlider.HORIZONTAL, 0, 70, 20);
				sl[0].setPaintLabels(true);
				sl[0].setPaintTicks(true);
				sl[0].setPaintTrack(true);
				sl[0].setMajorTickSpacing(50);
				sl[0].setMinorTickSpacing(10);
				
				sl[0].addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						int size = sl[0].getValue();
						colorLabel.setFont(new Font("", Font.PLAIN, size));
					}

				});
				c.add(sizePanel);
				sizePanel.add(color[0]);
				sizePanel.add(sl[0]);
				c.add(colorLabel);	
				
			
			}
		});

		colorLabel.setOpaque(true);
		
		
		
		setSize(300, 400);
		setVisible(true);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise03();
	}

}
