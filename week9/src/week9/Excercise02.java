package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Excercise02 extends JFrame{
	private ImagePanel imgpanel = new ImagePanel();
	int x, y;
	private ImageIcon icon = new ImageIcon("images/sunset.jpg");
	private Image img = icon.getImage();
	
	public Excercise02() {
		setTitle("Excercise02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = 200;
		y = 100;
		
		setContentPane(imgpanel);
		imgpanel.setLayout(null);//배치할게 없어서 null로 지정해도됨
		
		setSize(500,350);
		setVisible(true);
	}
	
	class ImagePanel extends JPanel{//panel 위에서 마우스의 위치를 알수있는 것은 panel 밖에 없음 그래서 panel에 actionListener을 달아야됨
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			addMouseMotionListener(new MouseMotionAdapter() {//어떤 Listener를 달지 고민해봐야됨 여기서는 MotionListener와 mouseMoved 사용
				//panel 안에 구현하기 때문에 panel.을 할 필요 없음 그냥 addMouseMotionListener을 바로 호출
				public void mouseMoved(MouseEvent e) {
					x = e.getX() - 20;//커서가 가운데에 오게
					y = e.getY() - 20;//oval의 시작 위치를 설정함
					repaint(); //얘가 순간적으로 계~속 동작함
				}
			});
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40); 
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise02();
	}

}
