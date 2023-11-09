package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Excercise01 extends JFrame{
	private ImagePanel imgpanel = new ImagePanel();
	private MyButton b = new MyButton("Hide/Show");
	int n; //누른 횟수(교수님은 bool 타입을 사용해 구현하심)
	private ImageIcon icon = new ImageIcon("images/sunset.jpg");
	private Image img = icon.getImage(); //이미지를 출력하기 위해서 객체를 만드는 전형적인 코드
	//여기에 이미지를 정의해도됨
	
	public Excercise01() {
		setTitle("Excercise01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		n = 0;
		
		b.addActionListener(new HideShowBtn());
		
		setContentPane(imgpanel); //백그라운드가 이미지로 그려지는
		imgpanel.setLayout(new FlowLayout());
		imgpanel.add(b);
		
		setSize(500,350);
		setVisible(true);
	}
	
	class ImagePanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(n%2==0) {//toggle
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
			repaint(); //paintComponent를 다시 호출해 다시 뿌려줘
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise01();
	}

}
