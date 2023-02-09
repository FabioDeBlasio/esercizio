package it.bitcamp.Esercizio8Febbraio;

public class Canarino extends Volatile implements Vola {

	char addestramento; // s or n

	// METODO SPECIFICO DI CLASSE
	public void canta() {

	}

	// GETTER AND SETTER
	public char getAddestramento() {
		return addestramento;
	}

	public void setAddestramento(char addestramento) {
		this.addestramento = addestramento;
	}

	// OVERRIDE DELLE CLASSI ASTRATTE EREDITATE

	@Override
	public void mangia() {

	}

	@Override
	public void dorme() {

	}

	@Override
	public void cresce() {

	}

	@Override
	public String toString() {

		return super.toString();
	}

}
