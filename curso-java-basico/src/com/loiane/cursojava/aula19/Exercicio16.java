package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nVetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		int somaMenor15 = 0, qtdIgual15 = 0, somaMaior15 = 0;
		double qtdMaiorQuinze = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				qtdIgual15++;
			} else {
				qtdMaiorQuinze++;
				somaMaior15 += vetorA[i];
			}
		}
		
		double mediaMaior15 = somaMaior15 / qtdMaiorQuinze;
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.println("\n\na) Soma dos elementos armazenados no vetor A inferiores a quinze: " + somaMenor15);
		System.out.println("b) Quantidade dos elementos armazenados no vetor A iguais a quinze: " + qtdIgual15);
		System.out.println("c) Média dos elementos armazenados no vetor A superiores a quinze: " + df.format(mediaMaior15));

	}

}
