package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 { //TABUADA

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		boolean valido = true;
		
		do {
			System.out.println("Entre com um número de 1 a 10 para ver sua tabuada:");
			num = scan.nextInt();
			if (num < 0 || num > 10) {
				System.out.println("Inválido. Digite novamente.");
			} else { valido = false; }
		} while (valido);
		
		System.out.println("Tabuada de " + num + ":");
		
		int produto = 0;
		
		for (int i = 1; i <= 10; i++) {
			produto = num * i;
			System.out.println(num + " x " + i + " = " + produto);
		}
		
	}

}
