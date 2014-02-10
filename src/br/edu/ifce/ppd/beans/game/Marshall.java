package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Marshall extends MovablePiece{
	public Marshall(Colors color, Boolean hidden) {
		super(Rank.MARSHALL, color, hidden);
	}
	public Marshall(Colors color){
		super(Rank.MARSHALL,color, true);
	}
}
