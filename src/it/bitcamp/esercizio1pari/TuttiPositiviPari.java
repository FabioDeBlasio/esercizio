package it.bitcamp.esercizio1pari;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		
		
		
		
//		Scrivere un programma TuttiPositiviPari che data una
//		sequenza arbitraria di interi, stampa "Tutti positivi e
//		pari" se i numeri sono tutti positivi e pari, altrimenti
//		stampa "NO".
		
		
		

		int[] posPar = { 2, 4, 6, 8, 10, 12, 16 };
		
		
//						1 METODO CON BOOLEANO
//		boolean k = false;
//		for (int i = 0; i < posPar.length; i++) {
//			if ((posPar[i] % 2 == 0) && (posPar[i] >= 0)) {
//				k = true;
//			} else {
//				k = false;
//				break;
//			}
//		}
//
//		if (k == true)
//
//		{
//			System.out.println("Tutti positivi e pari");
//		} else {
//			System.out.println("NO");
//
//		}

//						2 METODO

		for (int i = 0; i < posPar.length; i++) {
			if (posPar[i] < 0 || posPar[i] % 2 != 0) {
				System.out.println("No!");
				return;
			}
		}

		System.out.println("Tutti positivi e pari");

	}
}
