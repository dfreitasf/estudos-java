package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor de H: ");
		double H = scan.nextInt();
		
		double soma = 0;
		
		for (double i = 1; i <= H; i++) {
			System.out.print("1/" + i + " +");
			soma += (1 / i);
		}
		
		System.out.println("\nSoma = " + soma);

	}

}