package it.bitcamp.esercizio1pari;

public class ArrayCrescente {

//	Esercizio 5: ArrayCrescente
//
//	• Scrivere un metodo boolean crescente(int[ ] a) che
//	verifica se a è ordinato in modo crescente
//	• NOTA: un array è ordinato in modo crescente se
//	per ogni indice k, l’elemento di indice k è maggiore
//	di tutti gli elementi di indice minore di k

//						1 METODO

//	public static boolean crescente(int[] vett) {
//		boolean isCrescente = false;
//		for (int k = 0; k < vett.length - 1; k++) {
//			if (vett[k] < vett[k + 1]) {
//				isCrescente = true;
//
//			} else {
//				isCrescente = false;
//				System.out.println("L' array non è crescente");
//				return isCrescente;
//			}
//
//		}
//		System.out.println("L' array è crescente");
//		return isCrescente;
//
//	}

//	                   2 METODO
	public static boolean crescente(int[] vett) {
		for (int k = 0; k < vett.length - 1; k++) {
			if (vett[k] >= vett[k + 1]) {
				System.out.println("L' ARRAY non è cresente");
				return false;

			}

		}
		System.out.println("L' array è crescente");
		return true;

	}

	public static void main(String[] args) {

		int[] vett = { 1, 2, 3, 4, 5, 6 };

		boolean risultato = crescente(vett);
		System.out.println(risultato);

	}

}
