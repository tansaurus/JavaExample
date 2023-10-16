package week6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JCheckBoxItemEventPrac extends JFrame{

	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	public JCheckBoxItemEventPrac() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		c.add(new JLabel("사과 1000원 ,배 2000원, 체리 3000원"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		sumLabel = new JLabel("현재 0 원입니다.");
		c.add(sumLabel);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 1000;
				else if(e.getItem() == fruits[1])
					sum += 2000;
				else
					sum += 3000;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 1000;
				else if(e.getItem() == fruits[1])
					sum -= 2000;
				else
					sum -= 3000;
			}
			sumLabel.setText("현재 " + sum + "원입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBoxItemEventPrac();
	}

}
