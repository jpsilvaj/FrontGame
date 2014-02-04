package br.edu.ifce.ppd.beans.game;

import br.edu.ifce.ppd.util.Colors;
import br.edu.ifce.ppd.util.Rank;

public abstract class Piece {

	private Colors color; 
	private Boolean hidden = true;
	public Colors getColor() {
		return color;
	}
	public void setColor(Colors color) {
		this.color = color;
	}
	public Boolean getHidden() {
		return hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	
}
