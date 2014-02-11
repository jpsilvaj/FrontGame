package br.edu.ifce.ppd.util;

import java.net.URL;

import javax.swing.ImageIcon;

import br.edu.ifce.ppd.beans.game.Bomb;
import br.edu.ifce.ppd.beans.game.Captain;
import br.edu.ifce.ppd.beans.game.Colonel;
import br.edu.ifce.ppd.beans.game.Flag;
import br.edu.ifce.ppd.beans.game.Lieutnaut;
import br.edu.ifce.ppd.beans.game.Major;
import br.edu.ifce.ppd.beans.game.Marshall;
import br.edu.ifce.ppd.beans.game.Miner;
import br.edu.ifce.ppd.beans.game.Piece;
import br.edu.ifce.ppd.beans.game.Scout;
import br.edu.ifce.ppd.beans.game.Sergeant;
import br.edu.ifce.ppd.beans.game.Spy;
import br.edu.ifce.ppd.commons.IconNotFoundException;

public class PickUpImages {

	public ImageIcon getImageIconByPieceAndColor(Piece piece) throws IconNotFoundException{
		ImageIcon newImageIcon = null;
		
		switch(piece.getColor()){
			case BLUE:
				try {
					newImageIcon = piece.getHidden() == true ? new ImageIcon(getClass().getResource("/blue/mistery.png")):
													getIcon(piece,getClass().getResource("/blue"));
				}catch (IconNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case RED:
				try {
				newImageIcon = piece.getHidden() == true ? new ImageIcon(getClass().getResource("/red/mistery.png")):
												getIcon(piece,getClass().getResource("/red"));
				}catch (IconNotFoundException e) {
					e.printStackTrace();
				}
				break;
		}
		return newImageIcon;
	}
	
	private ImageIcon getIcon(Piece piece, URL directoryColors) throws IconNotFoundException{
		if(piece instanceof Bomb){
			return new ImageIcon(directoryColors+"/bomb.png");
		}
		else if(piece instanceof Flag){
			return new ImageIcon(directoryColors+"/flag.gif");
		}
		else if(piece instanceof Spy){
			return new ImageIcon(directoryColors+"/spy.png");
		}
		else if(piece instanceof Scout){
			return new ImageIcon(directoryColors+"/scout.png");
		}
		else if(piece instanceof Miner){
			return new ImageIcon(directoryColors+"/miner.png");
		}
		else if(piece instanceof Sergeant){
			return new ImageIcon(directoryColors+"/sergeant.png");
		}
		else if(piece instanceof Lieutnaut){
			return new ImageIcon(directoryColors+"/lieutnaut.png");
		}
		else if(piece instanceof Captain){
			return new ImageIcon(directoryColors+"/captain.png");
		}
		else if(piece instanceof Major){
			return new ImageIcon(directoryColors+"/major.png");
		}
		else if(piece instanceof Colonel){
			return new ImageIcon(directoryColors+"/colonel.png");
		}
		else if(piece instanceof Marshall){
			return new ImageIcon(directoryColors+"/marshall.png");
		}
		throw new IconNotFoundException();
	}
	
}
