package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um número inteiro para o vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			/*
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
			*/	
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
