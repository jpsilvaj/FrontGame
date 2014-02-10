package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Colonel extends MovablePiece{
	
	public Colonel(Colors color, Boolean hidden) {
		super(Rank.COLONEL, color, hidden);
	}
	public Colonel(Colors color){
		super(Rank.COLONEL,color, true);
	}
	
}
