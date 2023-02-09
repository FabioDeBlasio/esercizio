package it.bitcamp.esercizio1pari;

public class ProgettoMix {
	
	public static int [] mix(int[] a1 , int []a2) {
		
		if(a1.length != a2.length) {
			
			return null;
		}
		
		
		int[] a3 = new int[a1.length + a2.length];
		//OR int[] a3 = new int[a1.length * 2];
		
		for(int i = 0; i < a1.length; i++) {
			
			a3[i * 2] = a1[i];
			a3[(i * 2)+1] = a2[i];
		}
		
		return a3;
		
		
		
		
		
	}
}
