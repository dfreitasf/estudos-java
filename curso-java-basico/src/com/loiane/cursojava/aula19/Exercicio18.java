package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int indexMenor = 0, indexMaior = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.print("Entre com a idade da pessoa " + (i+1) + ": ");
			idades[i] = scan.nextInt();
			if (i == 0) {
				menor = idades[i];
				maior = idades[i];
				indexMenor = i;
				indexMaior = i;
			} else {
				if (idades[i] > maior) {
					maior = idades[i];
					indexMaior = i;
				} else if (idades[i] < menor) {
					menor = idades[i];
					indexMenor = i;
				}
			}
		}
		
		System.out.println("\nVetor A =");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + "\t");
		}
		
		System.out.println("\n\nMenor idade armazenada deste grupo de pessoas = " + menor + ", inserida na posição " + indexMenor);
		System.out.println("Maior idade armazenada deste grupo de pessoas = " + maior + ", inserida na posição " + indexMaior);
		
	}

}
