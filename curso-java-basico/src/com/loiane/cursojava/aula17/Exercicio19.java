package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas você gostaria de dar entrada para verificação da média?:");
		int qtdNotas = scan.nextInt();
		double soma = 0, nota = 0, media = 0;
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Entre com o valor da nota:");
			nota = scan.nextDouble();
			soma += nota;
		}
		
		media = soma / qtdNotas;
		System.out.println("A média das notas foi de: " + media);		

	}

}
