package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 { //Números Primos

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número a ser checado:");
		int num = scan.nextInt();
		
		/*
		int cont = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		
		if (cont == 1) {
			System.out.println("O número " + num + " é um número primo.");
		} else if (cont == 2) {
			System.out.println("O número " + num + " é um número primo.");
		} else {
			System.out.println("O número " + num + " não é um número primo.");
		}
		*/
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("O número " + num + " não é um número primo.");
				primo = false;
			}
		}
		
		if (primo ) {
			System.out.println("O número " + num + " é um número primo.");
		}

	}

}
