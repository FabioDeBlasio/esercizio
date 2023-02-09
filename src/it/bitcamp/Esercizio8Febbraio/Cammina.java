package it.bitcamp.Esercizio8Febbraio;

public interface Cammina {
	
	public default void cammina (String tana){
		System.out.println("Striscia verso :" + tana);
	}

}
