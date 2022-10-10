package com.poo.javashop;

public class Cuffie extends Prodotto{

	
	String colore, tipologia;
	
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, String tipologia) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.tipologia = tipologia;
	}
	
	@Override
	public String toString() {
		return "\nCodice: " + getCodice()
				+ "\nNome: " + getNome() 
				+ "\nMarca: " + getMarca() 
				+ "\nPrezzo: " + getPrezzo() + "Euro"
				+ "\nIVA: " + getIva() + "%" 
				+ "\nColore: " + colore  
				+ "\nTipologia: " + tipologia;
				
				
	}

}
