package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[8];
		int vetorB[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.print("Vetor A =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		System.out.print("\nVetor B =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + "\t");
		}
	}

}