package it.bitcamp.esercizio1pari;

public class PosizioniConsecutive {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 3, 3, 4, 5, 6, 7, 10 };//Cambiare array per ottenere risultati diversi

//								1 METODO
//		boolean f = false;
//		for (int i = 0; i < array.length - 2; i++) {
//			for (int k = i + 1; k < array.length - 1; k++) {
//				for (int z = k + 1; z < array.length; z++) {
//					if ((array[i] == array[k]) && (array[k] == array[z])) {
//						f = true;
//						break;
//					}
//				}
//
//			}
//		}
//
//		if (f == true) {
//			System.out.println("Tre valori consecutivi uguali");
//		} else {
//			System.out.println("NO");
//		}

//								2 METODO

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
				System.out.println("Tre valori consecutivi uguali");
				return;

			}
		}
		System.out.println("No!");

	}

}
