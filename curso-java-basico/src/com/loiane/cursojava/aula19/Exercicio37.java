package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
			
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um valor inteiro positivo para o vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = 1;
			for (int j = vetorA[i]; j > 0; j--) {
				vetorB[i] *= j;
			}
		}
		
		System.out.println("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("\n\nVetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
