package br.edu.ifce.ppd.commons;

public class OverMovement extends GenericException{

	public OverMovement(){
		super("Para esta pe�a n�o � poss�vel movimentar mais que uma casa");
	
	}

}
