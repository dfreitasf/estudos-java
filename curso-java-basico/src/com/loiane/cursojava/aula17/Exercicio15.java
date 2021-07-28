package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 { //Fibonacci

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int anterior1 = 1, anterior2 = 1, atual = 0, n = 0;
		
		System.out.println("Quantos números da sequência Fibonacci você gostaria de visualizar?: ");
		n = scan.nextInt();
		
		if (n <= 0) {
			System.out.println("Ok. Programa encerrado.");
		} else {
			System.out.println("Série Fibonacci abaixo:\n");
			if (n == 1) {
				System.out.println("1");
			} else if (n >= 2) {
				System.out.print("1 1");
				for (int i = 2; i < n; i++) {
					atual = anterior1 + anterior2;
					System.out.print(" " + atual);
					anterior2 = anterior1;
					anterior1 = atual;
				}
			}
		}

	}

}
