package br.edu.ifce.ppd.commons;

public class OverMovementException extends GenericException{

	public OverMovementException(){
		super("Para esta pe�a n�o � poss�vel movimentar mais que uma casa");
	
	}

}
