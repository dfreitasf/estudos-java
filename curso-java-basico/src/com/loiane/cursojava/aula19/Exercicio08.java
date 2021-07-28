package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor B na posição " + i + ": ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.print("Vetor A =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		System.out.print("\nVetor B =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + "\t");
		}
		System.out.print("\nVetor C =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + "\t");
		}
	}

}