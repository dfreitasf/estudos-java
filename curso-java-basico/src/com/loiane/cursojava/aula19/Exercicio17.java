package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com a idade da pessoa " + (i+1) + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		int qtdMaior35 = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				qtdMaior35++;
			}
		}
		
		System.out.println("\n\nQuantidade de pessoas que possuem idade superior a 35 anos = " + qtdMaior35);

	}

}
