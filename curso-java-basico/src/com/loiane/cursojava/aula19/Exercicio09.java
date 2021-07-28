package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		float vetorB[] = new float[vetorA.length];
		float vetorC[] = new float[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor A na posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor do vetor B na posição " + i + ": ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.print("Vetor A =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "\t");
		}
		
		System.out.print("\nVetor B =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + "\t");
		}
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		System.out.print("\nVetor C =\t");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorC[i]) + "\t");
		}
	}

}