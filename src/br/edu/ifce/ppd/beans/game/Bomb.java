package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Bomb extends ImmovablePiece{

	public Bomb(Colors color, Boolean hidden) {
		super(Rank.BOMB, color, hidden);
	}
	public Bomb(Colors color) {
		super(Rank.BOMB, color, true);
	}

}
