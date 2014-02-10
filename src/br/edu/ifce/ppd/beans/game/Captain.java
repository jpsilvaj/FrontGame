package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Captain extends MovablePiece{

	public Captain(Colors color, Boolean hidden) {
		super(Rank.CAPTAIN, color, hidden);
	}
	public Captain(Colors color){
		super(Rank.CAPTAIN,color, true);
	}
	
}
