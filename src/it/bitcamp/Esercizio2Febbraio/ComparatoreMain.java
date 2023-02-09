package it.bitcamp.Esercizio2Febbraio;

public class ComparatoreMain {

	public static void main(String[] args) {

//		Realizzare una classe che astragga il
//		concetto di Laptop considerando che la
//		classe sarà utilizzata per un gestionale di
//		un negozio di informatica.
//		Realizzare un metodo che permetta di
//		comparare due Laptop e di stabilire
//		quale sia il più costoso.
//		N.B. : il metodo di comparazione deve
//		essere presente nella classe Laptop

		LatTop lat1 = new LatTop(1000, "Microsoft", "AllInlusive");

		LatTop lat2 = new LatTop(900, "Apple", "Comprateli");

		System.out.println(lat1.comparatore(lat2));

	}

}
