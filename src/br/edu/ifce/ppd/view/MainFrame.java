package br.edu.ifce.ppd.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	MenuPanel menuPanel = new MenuPanel();
	ChatPanel chatPanel = new ChatPanel();
	HelperPanel helperPanel = new HelperPanel();
	StatusPanel statusPanel = new StatusPanel();
	BoardPanel boardPanel = new BoardPanel();
	
	
	public MainFrame(){
		super("FrontGame");
		this.setSize(1080,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addPainels();
	}
	
	private void addPainels(){
		Container c = getContentPane();
		c.add(BorderLayout.NORTH,menuPanel);
		c.add(BorderLayout.SOUTH,chatPanel);
		c.add(BorderLayout.EAST,statusPanel);
		c.add(BorderLayout.CENTER,boardPanel);
	};
}
