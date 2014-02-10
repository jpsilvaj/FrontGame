package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public class Miner extends MovablePiece{
	public Miner(Colors color, Boolean hidden) {
		super(Rank.MINER, color, hidden);
	}
	public Miner(Colors color){
		super(Rank.MINER,color, true);
	}
}
