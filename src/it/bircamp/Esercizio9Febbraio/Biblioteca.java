package it.bircamp.Esercizio9Febbraio;

public class Biblioteca {

	private Libro[] libri;

	public Biblioteca() {
		libri = new Libro[3];
	}

	public void aggiungiLibro(Libro l) {
		if (libri[libri.length - 1] != null) {
			aumentaCapienza();
		}
		for (int i = 0; i < this.libri.length; i++) {
			if (this.libri[i] == null) {
				this.libri[i] = l;
				break;
			}
		}
	}

	private void aumentaCapienza() {

		Libro[] nuovoArray = new Libro[this.libri.length + 1];
		for (int i = 0; i < this.libri.length; i++) {
			nuovoArray[i] = this.libri[i];
		}
		this.libri = nuovoArray;
	}

	public void stampaLibro() {
		for (int i = 0; i < libri.length; i++) {
			if (libri[i] != null) {
				System.out.println(libri[i]);
			}
		}
	}

	public Libro cercaLibro(int isbn) {
		for (int i = 0; i < libri.length; i++) {
			if (libri[i].getIsbn() == isbn) {
				System.out.println(libri[i].toString());
				return libri[i];
			}
		}
		return null;
	}

	public void rimuoviLibro(int isbn) {
		for (int i = 0; i < this.libri.length; i++) {
			if (this.libri[i].getIsbn() == isbn) {
				this.libri[i] = null;
			}
		}
		//completare il metodo per ordinare i libri
	}
}
