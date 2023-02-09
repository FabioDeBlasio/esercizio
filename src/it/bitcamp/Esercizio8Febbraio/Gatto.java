package it.bitcamp.Esercizio8Febbraio;

public class Gatto extends Mammifero implements Corre , Cammina {

	String nome;

	// METODO SPECIFICO DI CLASSE
	public void miagola() {

	}

	// GETTER AND SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// OVERRIDE DELLE CLASSI ASTRATTE EREDITATE

	public void x() {
		Gatto g = new Gatto();
		g.mangia();
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
