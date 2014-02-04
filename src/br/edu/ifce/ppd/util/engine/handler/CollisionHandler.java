package br.edu.ifce.ppd.util.engine.handler;

import br.edu.ifce.ppd.commons.TwoPiecesOnePlaceException;
import br.edu.ifce.ppd.view.BoardLocation;

public class CollisionHandler {

	private static void checkIfMovementResultInTwoPiecesInOnePlace(BoardLocation location1, BoardLocation location2) throws TwoPiecesOnePlaceException{
		if(location1.getPiece().getColor() == location2.getPiece().getColor()){
			throw new TwoPiecesOnePlaceException();
		}
	}
	
}
