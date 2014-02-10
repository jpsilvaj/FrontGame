package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class ImmovablePiece extends Piece{
	
	public ImmovablePiece(Rank rank, Colors color, Boolean hidden) {
		super(rank,color, hidden);
		this.setRank(rank);
	}
	
}
