package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um valor inteiro para o vetor A na posi��o " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i] + " ");
				if (i == vetorA.length-1) {
					System.out.println("\nTodas as posi��es do vetor A s�o pares!");
				}
			} else {
				System.out.println("\nO vetor A possui ao menos um valor �mpar armazenado na posi��o " + i + ".");
				break;
			}
		}
		
	}

}
