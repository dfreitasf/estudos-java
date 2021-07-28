package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtdAnos = 0, popA = 0, popB = 0;
		double txCrescA = 0, txCrescB = 0;
		boolean valido = false;
		
		do {
			System.out.println("Entre com a popula��o do pa�s A:");
			popA = scan.nextInt();
			if (popA < 0) {
				System.out.println("Valor inv�lido, digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a popula��o do pa�s B (necess�rio que seja maior que pa�s A):");
			popB = scan.nextInt();
			if (popB < 0 || popB < popA) {
				System.out.println("Valor inv�lido, digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a taxa de crescimento da popula��o do pa�s A (% a.a.):");
			txCrescA = scan.nextDouble();
			if (txCrescA < 0) {
				System.out.println("Taxa de crescimento negativa. Valor inv�lido. Digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a taxa de crescimento da popula��o do pa�s B (% a.a.):\nObs.: Necess�rio que seja menor que a taxa de crescimento do pa�s A.");
			txCrescB = scan.nextDouble();
			if (txCrescB < 0 || txCrescB > txCrescA) {
				System.out.println("Valor inv�lido. Digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		while (popA <= popB) {
			popA += popA*txCrescA/100;
			popB += popB*txCrescB/100;
			qtdAnos++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);		
		System.out.println("Quantidade de anos necess�rios para popula��o do pa�s A ultrapassar a popula��o do pa�s B = " + qtdAnos + " anos.");	
		
	}

}
