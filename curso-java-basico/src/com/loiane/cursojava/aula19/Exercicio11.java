package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		int qtdPares = 0;
		
		System.out.println("\nOs valores pares que foram digitados seguem abaixo:");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i] + "\t");
				qtdPares++;
			}
		}
		System.out.println("\n\nO total de números pares neste vetor é: " + qtdPares);
		
	}
	
}
