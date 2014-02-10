package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class MovablePiece extends Piece{
	
	private Boolean canMove = true;
	
	public MovablePiece(Rank rank, Colors color, Boolean hidden){
		super(rank,color,hidden);
		this.rank = rank;
	}

	public Boolean getCanMove() {
		return canMove;
	}

	public void setCanMove(Boolean canMove) {
		this.canMove = canMove;
	}
	
}

