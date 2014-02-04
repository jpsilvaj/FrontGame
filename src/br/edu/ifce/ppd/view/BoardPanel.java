package br.edu.ifce.ppd.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.ifce.ppd.util.SquareBoardSize;

public class BoardPanel extends JPanel{

	final int i = SquareBoardSize.DIMENSION;
	private BoardLocation[][] board = new BoardLocation[i][i];	
	
	public BoardPanel(){
		setLayout(new GridLayout(i,i));
		JLabel label = new JLabel();
		
	}

	public BoardLocation getBoardLocation(int row, int column) {
		return board[row][column];
	}

	public void setBoardLocation(int row, int column, BoardLocation boardLocation) {
		board[row][column] = boardLocation;
	}
	
	
}
