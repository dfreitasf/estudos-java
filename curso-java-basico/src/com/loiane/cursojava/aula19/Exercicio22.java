package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random());
		}
		
		int qtd0 = 0;
		int qtd1 = 0;
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 0) {
				qtd0++;
			} else {
				qtd1++;
			}
			System.out.print(vetorA[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		double tamVetor = vetorA.length;
		
		System.out.println("\n\n% de 0 armazenados neste vetor = " + df.format(qtd0 / tamVetor * 100) + "%");
		System.out.println("% de 1 armazenados neste vetor = " + df.format(qtd1 / tamVetor * 100) + "%");
	}

}