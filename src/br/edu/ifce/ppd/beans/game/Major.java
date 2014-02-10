package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Major extends MovablePiece{
	public Major(Colors color, Boolean hidden) {
		super(Rank.MAJOR, color, hidden);
	}
	public Major(Colors color){
		super(Rank.MAJOR,color, true);
	}
}
