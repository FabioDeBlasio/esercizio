package it.bitcamp.Esercizio3Febbraio;

public class MetodoContatore {

	public static int contatore;
	
	public MetodoContatore() {
		contatore++;
	}
	
	
	public static  int incrementoContatore(){
		return ++contatore;
	}
	
	
	public static int decrementoContatore(){
		return --contatore;
	}
	
	public static int resetContatore(){
		return contatore = 0;
	}
	
	
	public static int getContatore() {
		return contatore;
	}
	
	
	public static void main(String[]args) {
		
		MetodoContatore c = new MetodoContatore();

		MetodoContatore c1 = new MetodoContatore();

		MetodoContatore c2 = new MetodoContatore();
		
		
		
		System.out.println(MetodoContatore.getContatore());
		System.out.println(MetodoContatore.incrementoContatore());
		System.out.println(MetodoContatore.decrementoContatore());
		System.out.println(MetodoContatore.resetContatore());
		
		
	}
	
}
