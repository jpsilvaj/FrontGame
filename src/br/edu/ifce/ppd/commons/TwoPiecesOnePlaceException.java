package br.edu.ifce.ppd.commons;

public class TwoPiecesOnePlaceException extends Exception{

	public TwoPiecesOnePlaceException(){
		super("Não é possível mover para um local que já possui uma peça da mesma cor");
	}
}
