package week2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("500*500 스윙 프레임 만들기");
		setSize(500,500); // 프레임 크기
		setVisible(true); // 프레임 출력 (이거 안하면 해당 JFrame이 안보임 실행도 안됨)
	}
	//스윙 응용프로그램에서는 main 메소드의 기능은 최소화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}

}
