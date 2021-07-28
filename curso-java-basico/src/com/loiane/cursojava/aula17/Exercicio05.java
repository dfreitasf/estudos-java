package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtdAnos = 0, popA = 0, popB = 0;
		double txCrescA = 0, txCrescB = 0;
		boolean valido = false;
		
		do {
			System.out.println("Entre com a população do país A:");
			popA = scan.nextInt();
			if (popA < 0) {
				System.out.println("Valor inválido, digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a população do país B (necessário que seja maior que país A):");
			popB = scan.nextInt();
			if (popB < 0 || popB < popA) {
				System.out.println("Valor inválido, digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a taxa de crescimento da população do país A (% a.a.):");
			txCrescA = scan.nextDouble();
			if (txCrescA < 0) {
				System.out.println("Taxa de crescimento negativa. Valor inválido. Digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		do {
			System.out.println("Entre com a taxa de crescimento da população do país B (% a.a.):\nObs.: Necessário que seja menor que a taxa de crescimento do país A.");
			txCrescB = scan.nextDouble();
			if (txCrescB < 0 || txCrescB > txCrescA) {
				System.out.println("Valor inválido. Digite novamente.\n");
				valido = true;
			} else { valido = false; } 
		} while (valido);
		
		while (popA <= popB) {
			popA += popA*txCrescA/100;
			popB += popB*txCrescB/100;
			qtdAnos++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);		
		System.out.println("Quantidade de anos necessários para população do país A ultrapassar a população do país B = " + qtdAnos + " anos.");	
		
	}

}
