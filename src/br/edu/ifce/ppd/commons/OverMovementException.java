package br.edu.ifce.ppd.commons;

public class OverMovementException extends GenericException{

	public OverMovementException(){
		super("Para esta peça não é possível movimentar mais que uma casa");
	
	}

}
