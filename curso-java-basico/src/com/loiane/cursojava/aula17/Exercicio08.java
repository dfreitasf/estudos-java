package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double soma = 0, media = 0, num = 0;
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um n�mero:");
			num = scan.nextDouble();
			soma += num;
		}
		
		media = soma / i;
		
		System.out.println("A m�dia dos valores digitados �: " + media);
		System.out.println("A soma dos valores digitados �: " + soma);

	}

}
