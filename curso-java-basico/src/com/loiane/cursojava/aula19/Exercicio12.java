package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
		}
		
		System.out.print("\nVetor A =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		System.out.println("\nA soma dos valores digitados é de: " + soma);

	}

}
