package it.bitcamp.Esercizio3Febbraio;

public class MainImpiegato {

	public static void main(String[] args) {
		
		
		Impiegato i1 = new Impiegato("Marco", "Rossi", 366, 30, 3000.50);
		Impiegato i2 = new Impiegato("Giuseppe", "Verdi", 800 , 50, 1800.35);
		Impiegato i3 = new Impiegato("Luisa" ,  "Bianchi", 2000 , 10 , 2000.89 );
		
		i1.stampaFerie();
		
		i1.richiestaFerie(10);
//		i2.richiestaFerie(50);
//		i3.richiestaFerie(40); //Setto un valore maggiore del possibile per vedere se mi stampa l alert
		
		i3.diffAnzianita(i2);
		
//				//1 METODO: SBLOCCARLO NEL MAIN
//		System.out.println(i2.calcoloAumento());
//		System.out.println(i2.aumentoSalario);
		
		System.out.println(i2.aumentoPaga());
		
		i1.maggioreGuadagno(i2, i3);
		

	}

}
