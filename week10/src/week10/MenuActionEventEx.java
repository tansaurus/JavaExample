package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame{
	private JLabel imgLabel = new JLabel();
	
	public MenuActionEventEx() {
		setTitle("MEnu에 Action 리스너 만들기");
		createMenu();
		
		JScrollPane pane = new JScrollPane(imgLabel);
		getContentPane().add(pane, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,800);
		setVisible(true);
	}
	
	private void createMenu() {//MenuActionEventEx의 생성자를 간단하게 만들기 위해 생성한 메소드
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem [] menuItem = new JMenuItem [4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		
		for(int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
			}
		
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon() != null)
					return;
				imgLabel.setIcon(new ImageIcon("images/apple.jpg"));
				pack();
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "ReShow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEventEx();
	}

}
