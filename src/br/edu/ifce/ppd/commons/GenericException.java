package br.edu.ifce.ppd.commons;

public class GenericException extends Exception{
	
	private String message;
	
	public GenericException(String message){
		super(message);
		this.message = message;
	}
	public String getMessage(){
		return this.message;
	}
	
}