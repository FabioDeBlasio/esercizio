package it.bitcamp.Esercizio8Febbraio;

public interface Vola {
	
	
	public default void vola(String Addestratore) {
		System.out.println("Vola verso: " + Addestratore);
	}
}
