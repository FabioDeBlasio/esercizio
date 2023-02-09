package it.bircamp.Esercizio9Febbraio;

public class Libro {
	private String titolo;
	private String autore;
	private int pagine;
	private int isbn;
	
	
	public Libro() {
		
	}
	
	public Libro (String titolo, String autore, int pagine, int isbn) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
		this.isbn = isbn;
	}
				
	
	//GETTER AND SETTER
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", isbn=" + isbn + "]";
	}
	
	

}


