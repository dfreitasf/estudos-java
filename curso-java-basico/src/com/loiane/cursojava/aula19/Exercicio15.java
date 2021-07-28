package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[11];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		int qtdPar = 0, qtdImpar = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}
		}
		
		double tamVetor = vetorA.length;
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("\n\nPercentual de valores pares:\t" + df.format(qtdPar/tamVetor*100) + "%");
		System.out.println("Percentual de valores ímpares:\t" + df.format(qtdImpar/tamVetor*100) + "%");
	}

}
