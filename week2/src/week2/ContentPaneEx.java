package week2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ContentPaneEx extends JFrame{

	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //전체 프레임 코딩할때 같이 넣어줌
		//setDefaultCloseOperation 프레임 종료버튼이 클릭될 때 프레임을 닫고 응용 프로그램이 종료하도록 하는 방법
		//프레임 종료버튼이 클릭되면 윈도우가 닫히지만 실제로 응용프로그램이 종료된것이 아님->가비지임!
		//다시 setVisible(true) 호출하면 보이게 되고 이전처럼 작동함
		
		Container cp = getContentPane();
		
		cp.setBackground(Color.BLUE); //컨텐트팬의 배경색 설정
		cp.setLayout(new FlowLayout()); //컨텐트팬 내 컴포넌트들의 배치방법 설정
		//배치관리자 중에 flowlayout을 고를거야
		
		//JButton jb = new JButton("ok");
		//cp.add(jb); //jb를 저장해두고 계속해서 쓸 때 다회용으로 만들기
		
		cp.add(new JButton("ok")); //버튼 하나 달고 말거면 일회용으로 만들기
		cp.add(new JButton("cancel"));
		cp.add(new JButton("Ignore"));
		
		setSize(400,100); // 프레임 크기
		setVisible(true);
		//이 두개를 여기에 다는 이유.. ready 상태를 보여주려고.. 교수님 방식임
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
