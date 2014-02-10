package br.edu.ifce.ppd.util;

public enum Rank {
	SPY(1),
	SCOUT(2),
	MINER(3),
	SERGEANT(4),
	LIEUTENANT(5),
	CAPTAIN(6),
	MAJOR(7),
	COLONEL(8),
	GENERAL(9),
	MARSHALL(10),
	BOMB(11),
	FLAG(12);

	private int rank;
	
	private Rank(int rank){
		this.rank = rank;
	}
	
	public int getRank(){
		return rank;
	}
}
