package it.bitcamp.esercizio1pari;

public class ProvaPunto {

	public static void main(String[] args) {

		// coordinata punto 1
		double p1x = 2.0;
		double p1y = 3.2;

		// coordinate punto 2
		double p2x = 1.5;
		double p2y = 0.7;

		Punto p1 = new Punto(p1x, p1y);
		Punto p2 = new Punto(p2x, p2y);

		// OR NEL CASO LA CLASSE NON ABBIA PARAMETRI DI INGRESSO
////	Punto p1 = new Punto();
////	Punto p2 = new Punto();
//		
//		p1.setX(p1x);
//		p1.setX(p2x);
//		p2.setX(p1y);
//		p2.setX(p2y);

		// CALCOLO DISTANZA
		double distanza = p1.distanzaDa(p2);
		System.out.println("La distanza tra due punti è :" + distanza);

		// OR
		// System.out.println("La distanza è: " + p1.distanzaDa(p2));

		// CONFRONTO DI UGUAGLIANZA
		System.out.println("Punti uguali: " + p1.equals(p2));

		Punto p3 = new Punto(2.0 , 3.2);
		System.out.println("Punti uguali: " + p1.equals(p3));
	}

}
