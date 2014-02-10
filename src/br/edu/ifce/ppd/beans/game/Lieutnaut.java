package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Lieutnaut extends MovablePiece{
	public Lieutnaut(Colors color, Boolean hidden) {
		super(Rank.LIEUTENANT, color, hidden);
	}
	public Lieutnaut(Colors color){
		super(Rank.LIEUTENANT,color, true);
	}
}
