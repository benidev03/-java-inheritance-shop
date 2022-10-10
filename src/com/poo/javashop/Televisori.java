package com.poo.javashop;

public class Televisori extends Prodotto {

	int altezza, lunghezza;
	
	boolean smart;
	
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, int altezza, int lunghezza) {
		super(codice, nome, marca, prezzo, iva);
		this.altezza = altezza;
		this.lunghezza = lunghezza;
		this.smart = false;
	}
	
	@Override
	public String toString() {
		return "\nCodice: " + getCodice()
				+ "\nNome: " + getNome() 
				+ "\nMarca: " + getMarca() 
				+ "\nPrezzo: " + getPrezzo() + "Euro"
				+ "\nIVA: " + getIva() + "%" 
				+ "\nAltezza: " + altezza + "cm" 
				+ "\nLunghezza: " + lunghezza + "cm"
				+ "\nSmart: " + smart;
				
	}

}
