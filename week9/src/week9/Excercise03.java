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
		
		setContentPane(panel);
		panel.setLayout(null);
		
		setSize(500,350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Integer> vx = new Vector<Integer>();
		Vector<Integer> vy = new Vector<Integer>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					vx.add(e.getX());
					vy.add(e.getY());
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int[] x = new int[vx.size()];
			int[] y = new int[vx.size()];
			for(int i = 0; i < vx.size(); i++) {
				x[i] = vx.get(i);
				y[i] = vy.get(i);
			}
			g.drawPolygon(x, y, vx.size());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Excercise03();
	}

}
