package it.bitcamp.Esercizio2Febbraio;

import java.util.Iterator;
import java.util.Scanner;

public class Esercizio1Metodi {

//	• metodo che , presi in input due numeri con
//	virgola, ne restituisce la somma

	public static void somma(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

//	• metodo che , richiesti in input da tastiera
//	nome e cognome, restituisce : "Il tuo nome è
//	<nome>, il tuo cognome è <cognome>"

	public static String anagrafica() {
		Scanner mioScanner = new Scanner(System.in);
		String nome = mioScanner.nextLine();
		String cognome = mioScanner.nextLine();
		String database = "Il tuo nome è: " + nome + " - Il tuo cognome è: " + cognome;
		return database;
	}

//	• metodo che presi in input 4 numeri interi,
//	restuisce la loro somma moltiplicata per 10

	public static void sommaMoltiplicata(int x, int y, int z, int k) {
		int h = (x + y + z + k) * 10;
		System.out.println(h);
		;
	}

//	• metodo che , presa in input una stringa, la
//	restituisce fra parentesi quadre

	public static void StampString(String x) {
		System.out.println("[" + x + "]");
	}

	public static void main(String[] args) {

		// SOMMA
		double a = 3.3;
		double b = 5.5;
		somma(a, b);
		System.out.println("--------------------------------------");

		// METODO INPUT ESTERNO
		System.out.println(anagrafica());
		System.out.println("--------------------------------------");

		// SOMMA MOLTIPLICATA PER DIECI
		int x = 5;
		int y = 6;
		int z = 8;
		int k = 6;
		sommaMoltiplicata(x, y, z, k);
		System.out.println("--------------------------------------");

		// METODO CHE RESTITUISCE UNA STRINGA CIRCONDATA DA PARENTESI

		StampString(" ");
		System.out.println("--------------------------------------");

//		•Ciclo infinito che stampa i primi
//		dieci numeri tranne il 6

		int x1;

		for (x1 = 0; x1 <= 10; x1++) {
			if (x1 == 6) {
				continue;
			}
			System.out.println(x1);

		}
		System.out.println("--------------------------------------");

//		// •Un ciclo che stampi a ritroso 10
//		numeri (per esempio da 10 a 0,
//				oppure da 20 a 10);
		int n = 20;
		int x2;

		for (x2 = n; x2 >= n - 10; x2--) {
			System.out.println(x2);
		}
		System.out.println("--------------------------------------");

//		Un ciclo for che stampa i numeri da 1 a
//		100 considerando però che ogni volta
//		che verrà incontrato un numero
//		divisibile per 3 stamperà Fizz e ogni
//		volta che incontrerà un numero
//		divisibile per 5 stamperà Fuzz e nel caso
//		in cui dovesse incontrare un numero
//		divisibile sia per 3 che per 5 stampi
//		FizzBuzz

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 5 == 0) {
				System.out.println("FUZZ");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");
			} else
				System.out.println(i);
		}

		System.out.println("--------------------------------------");
		
//		Realizzare, stesso all’interno del main,
//		grazie a due cicli for la seguente figura:
//
//		*
//		**
//		***
//		****
//		*****
//		******

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");

		for (int i = 0; i < i * i - 1; i++) {
			System.out.println(i);
		}

	}

}
