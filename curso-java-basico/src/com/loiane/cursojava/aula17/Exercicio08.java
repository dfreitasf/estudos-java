package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double soma = 0, media = 0, num = 0;
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			num = scan.nextDouble();
			soma += num;
		}
		
		media = soma / i;
		
		System.out.println("A média dos valores digitados é: " + media);
		System.out.println("A soma dos valores digitados é: " + soma);

	}

}
