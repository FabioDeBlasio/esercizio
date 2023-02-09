package it.bitcamp.esercizio1pari;

public class Pari {

	public static void main(String[] args) {
		

//		Esercizio 1: Pari
//
//		Scrivere un programma, costituito da
//		un’unica classe, che sfruttando
//		esclusivamente un ciclo infinito,
//		l’operatore modulo, due costrutti if,
//		un break, ed un continue, stampi
//		solo i primi 5 numeri pari.
		
		for (int j = 0; 1 == 1; j++) {
			
			if(j%2 == 0) {
				System.out.println("Il valore di j è: " + j);
				continue;
			}
			if(j >= 8 ) {
				System.out.println("Hai stampato i primi cinque numeri pari.");
				break;
			}
		}
			
		System.out.println("--------------------------------------------------");
		
		//Esempi ciclo infinito
		
//		for (; ;) {
//			System.out.println("Ciclo infinito");
//		}
//		
		
		//In questo modo non andremo a stampare lo 0
		
		int numero = 0;
		while(true) {
			numero++;
			
			if(numero > 10) {
				break;
			}
			
			if(numero%2 != 0) {
				continue;
			}
			
			System.out.println(numero);
		}
		

	}

}
