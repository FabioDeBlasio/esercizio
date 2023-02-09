package it.bitcamp.Esercizio6FEbbraio;

public class Animale {
	
	private String razza;
	private String nome;
	private char sesso;
	private int eta;
	
	
	public Animale() {
		
	}


	public Animale(String razza, String nome, char sesso, int eta) {
		this.razza = razza;
		this.nome = nome;
		this.sesso = sesso;
		this.eta = eta;
	}


	public void mangia() {
		System.out.println("Sta mangiando");
	}
	
	
	public void dorme() {
		System.out.println("Sta dormendo");
	}
	
	
	public void verso() {
		System.out.println("Sta facendo il suo verso");
	}
	
	
	public void cresce() {
		System.out.println("Sta crescendo");
	}
	
	
	//GETTER E SETTER
	public String getRazza() {
		return razza;
	}


	public void setRazza(String razza) {
		this.razza = razza;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getSesso() {
		return sesso;
	}


	public void setSesso(char sesso) {
		this.sesso = sesso;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Animale [razza=" + razza + ", nome=" + nome + ", sesso=" + sesso + ", eta=" + eta + "]";
	}
	
	
	
	
	

	
	
	

	
		
	
	
	
	
	
	
	

	
	
	
}
