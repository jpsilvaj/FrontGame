package br.edu.ifce.ppd.util;

public enum MessageCode {
	PLAYER_NAME(1),
	WAIT_PLAYER(2),
	SEND_READY(3),
	GAME_ON(4),
	PLACING_PIECE(5),
	SETUP_ERROR(6),
	PIECE_REMOVED(7),
	CONFIRM_PIECE_REMOVED(8),
	TWO_PLAYERS_READY(9),
	PLAYER_TURN(10),
	CONFIRM_VALID_MOVEMENT(11),
	FIGHT(12),
	VICTORY_MESSAGE(13),
	PING(14),
	PONG(15),
	CHAT_MESSAGE(16);
	
	private int ID;
	
	private MessageCode(int id){
		this.ID = id;
	}
	
	public int getRank(){
		return ID;
	}
}
