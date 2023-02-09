package it.bitcamp.Esercizio6FEbbraio;

public class Gatto extends Animale {


	private String colorePelo;
	private String coloreOcchi;
	
	
	
	
	public Gatto() {
		
	}
	
	
	public Gatto(String razza, String nome, char sesso, int eta, String colorePelo, String coloreOcchi) {
		super(razza, nome, sesso, eta);
		this.colorePelo = colorePelo;
		this.coloreOcchi = coloreOcchi;

	}


	public String getColorePelo() {
		return colorePelo;
	}


	public void setColorePelo(String colorePelo) {
		this.colorePelo = colorePelo;
	}


	public String getColoreOcchi() {
		return coloreOcchi;
	}


	public void setColoreOcchi(String coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}


	@Override
	public void verso() {
		System.out.println(getNome() + "sta miagolando");
	}


	@Override
	public String toString() {
		return "Gatto colore" + colorePelo +  super.toString();
	}
	
	
	
	
	
	

	
	


	
	

}
