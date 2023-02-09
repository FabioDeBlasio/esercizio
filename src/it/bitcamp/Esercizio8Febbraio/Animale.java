package it.bitcamp.Esercizio8Febbraio;

public abstract class Animale {

	private String specie;

	// METODI ASTRATTI
	public abstract void mangia();

	public abstract void dorme();

	public abstract void cresce();

	// GETTER AND SETTER
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	@Override
	public String toString() {
		return "Animale [specie=" + specie + "]";
	}

}
