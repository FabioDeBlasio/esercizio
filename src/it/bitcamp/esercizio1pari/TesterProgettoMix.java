package it.bitcamp.esercizio1pari;

import java.util.Arrays;

public class TesterProgettoMix {

	public static void main(String[] args) {

		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		int[] array2 = new int[3];
		array2[0] = 4;
		array2[1] = 5;
		array2[2] = 6;
		
		
		
		ProgettoMix.mix(array, array2);
		System.out.println(Arrays.toString(ProgettoMix.mix(array, array2)));

	}

}
