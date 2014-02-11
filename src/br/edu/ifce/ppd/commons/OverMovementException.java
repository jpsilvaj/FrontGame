package br.edu.ifce.ppd.commons;

public class OverMovementException extends GenericException{

	public OverMovementException(){
		super("Can't move more which one square");
	
	}

}
