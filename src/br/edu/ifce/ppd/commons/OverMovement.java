package br.edu.ifce.ppd.commons;

public class OverMovement extends GenericException{

	public OverMovement(){
		super("Para esta peça não é possível movimentar mais que uma casa");
	
	}

}
