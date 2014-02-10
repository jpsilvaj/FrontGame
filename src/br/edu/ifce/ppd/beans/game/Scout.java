package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Scout extends MovablePiece{
	public Scout(Colors color, Boolean hidden) {
		super(Rank.SCOUT, color, hidden);
	}
	public Scout(Colors color){
		super(Rank.SCOUT,color, true);
	}
}
