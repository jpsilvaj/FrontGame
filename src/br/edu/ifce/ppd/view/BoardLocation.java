package br.edu.ifce.ppd.view;

import br.edu.ifce.ppd.beans.game.Piece;

public class BoardLocation {

	private Boolean ocupied = false;
	private int row;
	private int column;
	private Piece piece;
	
	public BoardLocation(Piece piece, int row, int column){
		this.piece = piece;
		this.row = row;
		this.column = column;
	}
	
	public Boolean getOcupied() {
		return ocupied;
	}
	public void setOcupied(Boolean ocupied) {
		this.ocupied = ocupied;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
}
