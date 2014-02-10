package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Spy extends MovablePiece{
	public Spy(Colors color, Boolean hidden) {
		super(Rank.SPY, color, hidden);
	}
	public Spy(Colors color){
		super(Rank.SPY,color, true);
	}
}
