package br.edu.ifce.ppd.view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;

import br.edu.ifce.ppd.util.SquareBoardSize;

public class BoardPanel extends JPanel{

	int i = SquareBoardSize.dimension;
	private BoardLocation[][] board = new BoardLocation[i][i];
	
	public BoardPanel(){
		setLayout(new GridLayout(i,i));
		
		
	}
	
	
}
