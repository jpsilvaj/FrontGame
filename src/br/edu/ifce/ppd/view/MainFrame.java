package br.edu.ifce.ppd.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{

	MenuPanel menuPanel = new MenuPanel();
	ChatPanel chatPanel = new ChatPanel();
	HelperPanel helperPanel = new HelperPanel();
	StatusPanel statusPanel = new StatusPanel();
	BoardPanel boardPanel = new BoardPanel();
	PiecePanel piecePanel = new PiecePanel();
	
	public MainFrame(){
		super("FrontGame");
		this.setSize(1080,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.addPainels();
		this.pack();
	}
	
	private void addPainels(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.add(BorderLayout.NORTH,menuPanel);
		c.add(BorderLayout.SOUTH,chatPanel);
		c.add(BorderLayout.EAST,statusPanel);
		c.add(BorderLayout.WEST,piecePanel);
		c.add(BorderLayout.CENTER,boardPanel);
	};
}
