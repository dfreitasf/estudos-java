package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtdPar = 0, qtdImpar = 0, num;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			if (num%2 == 0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}
		}
		
		System.out.println("Qtd. números pares: " + qtdPar);
		System.out.println("Qtd. números ímpares: " + qtdImpar);
	
	}

}
