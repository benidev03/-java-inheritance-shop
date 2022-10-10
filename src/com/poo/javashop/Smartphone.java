package com.poo.javashop;

public class Smartphone extends Prodotto{

	int codiceIMEI;
	int memoria;
	
	public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int codiceIMEI, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
		
	}

	@Override
	public String toString() {
		return "\nCodice: " + getCodice()
				+ "\nNome: " + getNome() 
				+ "\nMarca: " + getMarca() 
				+ "\nPrezzo" + getPrezzo() + "Euro"
				+ "\nIVA: " + getIva() + "%" 
				+ "\ncodiceIMEI: " + codiceIMEI 
				+ "\nMemoria: " + memoria;
				
	}

}
