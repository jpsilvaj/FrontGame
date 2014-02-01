package br.edu.ifce.ppd.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Board extends JPanel{

	public Board(){
		setBorder(new TitleBoard("FrontGame"))
		setLayout(new GridLayout(10,10));
		
	}
}
