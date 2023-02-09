package it.bitcamp.Esercizio2Febbraio;

public class LatTop {
	
	int prezzo;
	String marca;
	String Hardware; //Hardware presenti internamente

	
	
	LatTop (int prezzo, String marca, String Hardware){
		this.prezzo = prezzo;
		this.marca = marca;
		this.Hardware = Hardware;
	}
	
	
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getHardware() {
		return Hardware;
	}
	public void setHardware(String hardware) {
		Hardware = hardware;
	}
	
	
	//Metodo Comparazione
	
	public String comparatore (LatTop x){
		
		if(this.prezzo > x.prezzo) {
			return "Il prezzo di: " + this.marca + " è maggiore di: " + x.marca;
		}else {
			return "Il prezzo di: " + this.marca + " è minore  di: " + x.marca;
		}
		

		}
		
	}


