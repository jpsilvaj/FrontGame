package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Flag extends ImmovablePiece{
	public Flag(Colors color, Boolean hidden) {
		super(Rank.FLAG, color, hidden);
	}
	public Flag(Colors color){
		super(Rank.FLAG,color, true);
	}
}
