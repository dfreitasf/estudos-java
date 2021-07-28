package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de pessoas a serem analisadas:");
		int qtdPessoas = scan.nextInt();
		int idade = 0, soma = 0;
		double media = 0;
		
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			soma += idade;
		}
		
		media = soma / qtdPessoas;
		
		if (media >= 0 && media <= 25) {
			System.out.println("A média de idade é de " + media + " anos. A turma é jovem.");
		} else if (media > 25 && media <= 60) {
			System.out.println("A média de idade é de " + media + " anos. A turma é adulta.");
		} else if (media > 60) {
			System.out.println("A média de idade é de " + media + " anos. A turma é idosa.");
		}
		
	}

}