package br.edu.ifce.ppd.commons;

public class MoveToLakeException extends GenericException{
	public MoveToLakeException(){
		super("Can't move piece to lake");
	}
	
	//Water in (4,2) (4,3) (5,2) (5,3) and (4, 6) (4,7) (5,6) (5,7)

}
