package br.edu.ifce.ppd.commons;

public class TwoPiecesOnePlaceException extends Exception{

	public TwoPiecesOnePlaceException(){
		super("Can't move two pieces with same color on a square");
	}
}
