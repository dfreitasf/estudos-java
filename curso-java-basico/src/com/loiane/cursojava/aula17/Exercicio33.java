package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor de n: ");
		double num = scan.nextInt();
		
		double denominador = 1;
		double soma = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "/" + denominador + " + ");
			soma += (i / denominador);
			denominador += 2;
		}
		
		System.out.println("Soma = " + soma);

	}

}
