package br.edu.ifce.ppd.commons;

public class MoveToLakeException extends GenericException{
	public MoveToLakeException(){
		super("Não é possível mover a peça para o lago");
	}
}
