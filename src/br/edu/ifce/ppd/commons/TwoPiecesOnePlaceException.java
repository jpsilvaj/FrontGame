package br.edu.ifce.ppd.commons;

public class TwoPiecesOnePlaceException extends Exception{

	public TwoPiecesOnePlaceException(){
		super("N�o � poss�vel mover para um local que j� possui uma pe�a da mesma cor");
	}
}
