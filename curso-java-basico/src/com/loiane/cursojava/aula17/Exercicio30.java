package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		System.out.print("Começar por: ");
		int inicio = scan.nextInt();
		int termino;
		
		do {
			System.out.print("Terminar em: ");
			termino = scan.nextInt();
			if (termino < inicio) {
				System.out.println("Inválido. o término deverá ser maior que o início. Digite novamente.");
			}
		} while (termino < inicio);
		
		System.out.println("\nVou montar a tabuada de " + num + " começando em " + inicio + " e terminando em " + termino + ":");
		
		for (int i = inicio; i <= termino; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}

	}

}