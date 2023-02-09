package it.bitcamp.Esercizio3Febbraio;

public class Impiegato {

	private String nome;
	private String cognome;
	private int anzianita;
	private int ferie;
	private double salario;
	private double aumentoSalario;
	public static int personale;

	// COSTRUTTORE1
	public Impiegato() {

	}

	// COSTRUTTORE2
	public Impiegato(String nome, String cognome, int anzianita, int ferie, double salario) {
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		this.ferie = ferie;
		this.salario = salario;
		personale++;
	}

	// METODI
	public int calcoloFerie(int ferie) {
		return this.ferie - ferie;

	}

	public void richiestaFerie(int ferieRichieste) {
		if (this.ferie < ferieRichieste) {
			System.out.println(
					"Attenzione le ferie richieste sono maggiori delle ferie disponibili. Hai a disposizione : "
							+ this.ferie + " giorni");

		} else {

			this.aggiornaFerie(ferieRichieste);
			this.stampaFerie();

		}

	}

	public void aggiornaFerie(int ferie) {
		this.ferie = this.calcoloFerie(ferie);
	}

	public void stampaFerie() {
		System.out.println("Le tue ferie sono :" + this.ferie);
	}

	public void diffAnzianita(Impiegato i) {
		if (this.anzianita == i.anzianita) {
			System.out.println("Assunti nello stesso periodo");
		} else if (this.anzianita > i.anzianita) {
			System.out.println(this.nome + " " + this.cognome + " lavora da più tempo");
		} else {
			System.out.println(i.nome + " " + i.cognome + " lavora da più tempo");
		}

	}

					//1 POSSIBILITA'
//	public double calcoloAumento() {
//		if (this.anzianita >= 365 * 5) {
//			this.aumentoSalario = this.salario * 20 / 100;
//		} else if (this.anzianita >= 365 * 2) {
//			this.aumentoSalario = this.salario * 10 / 100;
//		}
//		
//		return this.aumentoSalario;
//
//		
//	}
//	
//	
//	
//	public double aumentoSalario () {
//		return  this.salario + this.aumentoSalario;
//		
//	}
	
			
	public double aumentoPaga() {
		if (this.anzianita >= 365 * 5) {
			this.salario = (this.salario * 15 / 100) + this.salario;
		} else if (this.anzianita >= 365 * 2) {
			this.salario = (this.salario * 10 / 100) + this.salario;
		}
		return this.salario;

	}
	
	

	public void maggioreGuadagno(Impiegato x, Impiegato y) {
		if ((this.salario > x.salario) && (this.salario > y.salario)) {
			System.out.println(this.nome + " " + this.cognome + " guadagna più di tutti.");
		} else if ((x.salario > this.salario) && (x.salario > y.salario)) {
			System.out.println(x.nome + " " + x.cognome + " guadagna più di tutti.");

		} else {
			System.out.println(y.nome + " " + y.cognome + " guadagna più di tutti.");
		}

	}

	public int getNumDipendenti() {
		return personale;
	}

	// GETTER AND SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public int getFerie() {
		return ferie;
	}

	public void setFerie(int ferie) {
		this.ferie = ferie;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int getPersonale() {
		return personale;
	}

	public static void setPersonale(int personale) {
		Impiegato.personale = personale;
	}

	@Override
	public String toString() {
		return nome + " " + cognome + " " + anzianita + " " + ferie + " " + salario;
	}

}
