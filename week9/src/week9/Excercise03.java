package week9;

import javax.swing.*;

import week9.GraphicsDrawStringEx.MyPanel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Excercise03 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Excercise03() {
		setTitle("Excercise03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);//창 자체를 panel로 지정
		panel.setLayout(null);
		
		setSize(500,350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Integer> vx = new Vector<Integer>();
		Vector<Integer> vy = new Vector<Integer>();
		
		public MyPanel() { //panel 생성자
			//panel 위에 바로 위에 그릴거니까 panel에 Listener를 달아야함
			addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e) {
					vx.add((int)e.getX()); //vector에 x의 좌표를 add 시킴
					//혹시라도 int type이 아닐수도있으니까 다시 한번 형변환을 해줌
					//혹시에 대한 연습이 필요함 ->안정적인 코드를 위해서
					vy.add(e.getY()); //vector에 y의 좌표를 add 시킴
					repaint(); //다시 repaint를 통해서 paintComponent를 호출해줌
					//상태 바뀌었으니까 paintComponent 호출 다시해!
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int[] x = new int[vx.size()]; //vector의 size를 가져와!
			int[] y = new int[vx.size()];
			for(int i = 0; i < vx.size(); i++) { //vector size만큼 (전부 다) array에 저장해!
				x[i] = vx.get(i); //vector의 구성요소를 array에 넣어줌
				y[i] = vy.get(i);
			}
			g.drawPolygon(x, y, vx.size()); //다각형을 그리기 위해서 매개변수를 배열로 만들기 위해 생각해봐야됨
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise03();
	}

}
