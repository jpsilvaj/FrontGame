package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Sergeant extends MovablePiece{
	public Sergeant(Colors color, Boolean hidden) {
		super(Rank.SERGEANT, color, hidden);
	}
	public Sergeant(Colors color){
		super(Rank.SERGEANT,color, true);
	}
}
