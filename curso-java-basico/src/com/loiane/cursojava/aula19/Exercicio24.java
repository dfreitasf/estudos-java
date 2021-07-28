package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com um valor inteiro para o vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		boolean palindromo = true;
		int i = 0;
		
		do {
			if (vetorA[i] != vetorA[vetorA.length-1-i]) {
				palindromo = false;
			}
			i++;
		} while (palindromo && i < vetorA.length/2);
		
		if (palindromo == true) {
			System.out.println("\nÉ palíndromo.");
		} else {
			System.out.println("\nNão é palíndromo.");
		}
		
	}

}
