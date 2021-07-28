package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio01 { //Validação de notas

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double nota = 0;
		
		do {
			System.out.println("Entre com uma nota de 0 a 10:");
			nota = scan.nextDouble();
			if (nota < 0 || nota > 10) {
				System.out.println("Valor inválido, digite novamente.");
			}
		} while (nota < 0 || nota > 10);

	}

}
