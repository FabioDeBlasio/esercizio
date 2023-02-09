package it.bitcamp.Esercizio8Febbraio;

public abstract class Mammifero extends Animale {
	
	private String colorePelo;

	
	
		//GETTER AND SETTER
	public String getColorePelo() {
		return colorePelo;
	}

	public void setColorePelo(String colorePelo) {
		this.colorePelo = colorePelo;
	}
	
	@Override
	public void mangia() {
		
	}
}
