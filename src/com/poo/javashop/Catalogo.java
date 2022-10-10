package com.poo.javashop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codice, codiceIMEI, memoria,  altezza, lunghezza;
		String nome, marca, colore, tipologia;
		double prezzo, iva, prezzoCompresivo;
		boolean smart;
		
		System.out.println("VALORIZZARE IL CATALOGO");
		
		System.out.println("1 - Smarphone");
		System.out.println("2 - Televisori");
		System.out.println("3 - Cuffie");
		
		System.out.print("\nScegliere un'operazione: ");
		int scelta = sc.nextInt();
		
		
				System.out.println("Hai scelto di valorizzare uno smartphone");
				System.out.println("Compilare il modulo\n");
				System.out.print("Codice: ");
				codice = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Marca: ");
				marca = sc.nextLine();
				System.out.print("Prezzo: ");
				prezzo = sc.nextDouble();
				System.out.print("IVA: ");
				iva = sc.nextDouble();
				
				if(scelta == 1) {
					
					System.out.print("CodiceIMEI: ");
					codiceIMEI = sc.nextInt();
					System.out.print("Memoria: ");
					memoria = sc.nextInt();
					
					Prodotto prodotto = new Smartphone(codice,nome, marca, prezzo,iva,codiceIMEI,memoria);
					prezzoCompresivo = prodotto.prezzoComprensivoIva(iva);
					System.out.println("\nDettagli del catalogo "+prodotto.toString());
					System.out.println("Prezzo incluso IVA: "+prezzoCompresivo);
					
					
				}else if(scelta == 2) {
					
					System.out.print("Altezza: ");
					altezza = sc.nextInt();
					System.out.print("Lunghezza: ");
					lunghezza = sc.nextInt();
					System.out.print("Smart: ");
					smart = sc.nextBoolean();
					
					
					Prodotto prodotto = new Televisori(codice,nome, marca, prezzo,iva,altezza,lunghezza);
					prezzoCompresivo = prodotto.prezzoComprensivoIva(iva);
					System.out.println("\nDettagli del catalogo "+prodotto.toString());
					System.out.println("Prezzo incluso IVA: "+prezzoCompresivo);
					
					
				}else if(scelta == 3) {
					sc.nextLine();
					System.out.print("CodiceIMEI: ");
					colore = sc.nextLine();
					System.out.print("Memoria: ");
					tipologia = sc.nextLine();
					
					Prodotto prodotto = new Cuffie(codice,nome, marca, prezzo,iva,colore,tipologia);
					prezzoCompresivo = prodotto.prezzoComprensivoIva(iva);
					System.out.println("\nDettagli del catalogo "+prodotto.toString());
					System.out.println("Prezzo incluso IVA: "+prezzoCompresivo);
					
				}else {
					
					System.out.print("C'è stata un'errore riprovare più tardi!");
				}
						
		
		sc.close();
	}

	
}
