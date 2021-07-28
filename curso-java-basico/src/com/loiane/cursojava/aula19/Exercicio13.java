package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		System.out.println("\n\nA soma de todos os valores múltiplos de 5 armazenados neste vetor é de: " + soma);
		
	}

}
