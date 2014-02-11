package br.edu.ifce.ppd.beans.game;

import javax.swing.ImageIcon;

import br.edu.ifce.ppd.commons.IconNotFoundException;
import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.PickUpImages;
import br.edu.ifce.ppd.util.Rank;

public abstract class Piece {

	protected Colors color; 
	protected Rank rank;
	protected Boolean hidden = true;
	protected ImageIcon icon;
	
	public Piece(Rank rank, Colors color, Boolean hidden) {
		this.rank = rank;
		this.color = color;
		this.hidden = hidden;
		this.icon = setPieceImage();
	}
	
	public Rank getRank(){
		return this.rank;
	}
	
	public void setRank(Rank rank){
		this.rank = rank;
	}

	public Colors getColor() {
		return this.color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	public Boolean getHidden() {
		return this.hidden;
	}

	public void setHidden(Boolean hidden) {
		if ( this.hidden != hidden){
			this.hidden = hidden;
			this.icon = setPieceImage();
		}
	}
	
	private ImageIcon setPieceImage(){
		ImageIcon newImageIcon = null;
		try {
			PickUpImages pickupImages = new PickUpImages();
			newImageIcon = pickupImages.getImageIconByPieceAndColor(this);
		} catch (IconNotFoundException e) {
			e.printStackTrace();
		}
		return newImageIcon;
	}
	
	public ImageIcon getIcon(){
		return icon;
	}
	
}
