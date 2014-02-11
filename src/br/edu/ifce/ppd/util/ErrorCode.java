package br.edu.ifce.ppd.util;

public enum ErrorCode {
	UNIT_ALREADY_USED(1),
	MOVING_OUTSIDE_BOARD(2),
	MOVING_BOMB(3),
	MOVING_FLAG(4),
	MOVING_LAKE(5),
	OVER_MOVEMENT(6),
	REPEAT_MOVEMENT_THIRD_TIME(7);
	
	private int ID;
	
	private ErrorCode(int id){
		this.ID = id;
	}
	
	public int getID(){
		return ID;
	}
	
}
