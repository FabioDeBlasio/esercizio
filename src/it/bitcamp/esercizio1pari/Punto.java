package it.bitcamp.esercizio1pari;

public class Punto {

	private double x, y;

	// COSTRUTTORI
	public Punto() {

	}

	public Punto(double cordx, double cordy) {

		this.x = cordx; // OR this.setx(cordx)
		this.y = cordy; // OR this.sety(cordy)

	}

	// GETTER AND SETTER
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// METODO

	public double distanzaDa(Punto p) {

		double distanza;
		distanza = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
		return distanza;
	}

	public boolean equals(Punto p) {

		boolean verifica;
		if (this.x == p.x && this.y == p.y) {
			verifica = true;
		}else {
		verifica = false;
		}
		return verifica;
	}

	@Override
	public String toString() {

		String stringa = "Coordinata x: " + this.x + " Coordinata y: " + this.y;

		return stringa;

		// OR return "Coordinata x: " + this.x + " Coordinata y: " + this.y;
	}
}
