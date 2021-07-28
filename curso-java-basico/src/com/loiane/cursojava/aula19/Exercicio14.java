package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		int soma = 0;
		double qtdImpar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				qtdImpar++;
			}			
		}
		
		double media = soma / qtdImpar;
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("\n\nSoma dos números ímpares armazenados no vetor A = " + soma);
		System.out.println("Total de números ímpares armazenados no vetor A = " + qtdImpar);
		System.out.println("Média dos números ímpares armazenados no vetor A = " + df.format(media));
		
	}

}
