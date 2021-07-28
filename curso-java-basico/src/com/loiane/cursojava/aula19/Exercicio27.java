package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um número inteiro para o vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] < 7) {
				vetorB[i] = 97;
			} else if (vetorA[i] == 7) {
				vetorB[i] = 98;
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 99;
			} else if (vetorA[i] == 10) {
				vetorB[i] = 100;
			} else if (vetorA[i] > 10) {
				vetorB[i] = 101;
			}
		}
		
		System.out.println("\nVetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("\n\nVetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
