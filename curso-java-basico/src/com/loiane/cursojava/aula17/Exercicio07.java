package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double maior = Integer.MIN_VALUE;
		
		/*
		System.out.println("Digite o primeiro número:");
		double num1 = scan.nextDouble();
		maior = num1;
		
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
		if (num2 > maior) { maior = num2; }
		
		System.out.println("Digite o terceiro número:");
		double num3 = scan.nextDouble();
		if (num3 > maior) { maior = num3; }
		
		System.out.println("Digite o quarto número:");
		double num4 = scan.nextDouble();
		if (num4 > maior) { maior = num4; }
		
		System.out.println("Digite o primeiro número:");
		double num5 = scan.nextDouble();
		if (num5 > maior) { maior = num5; }
		
		*/
		
		double num = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			num = scan.nextDouble();
			if (num > maior) { maior = num; }
		}
		
		System.out.println("O maior número digitado foi: " + maior);

	}

}
