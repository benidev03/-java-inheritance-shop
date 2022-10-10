package com.poo.javashop;

public class Prodotto {
	
	private int codice;
	private String nome, marca;
	private double prezzo, iva, prezzoCompresivo;
	
	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
		
	}
	
	public double prezzoComprensivoIva(double aliquotaIva) {
		
		
		prezzoCompresivo = prezzo * ((iva/100)+1);
		
		return prezzoCompresivo;
	}
	
	
	public int getCodice() {
		return codice;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}
	
}
