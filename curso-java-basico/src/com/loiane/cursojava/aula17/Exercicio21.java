package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de turmas:");
		int qtdTurmas = scan.nextInt();
		int qtdAlunos = 0, soma = 0;
		double media = 0;
		
		/*
		for (int i = 1; i <= qtdTurmas; i++) {
			System.out.println("Entre com a quantidade de alunos da turma " + i + ":");
			qtdAlunos = scan.nextInt();
			if (qtdAlunos > 40) {
				System.out.println("As turmas não podem ter mais que 40 alunos. Tente novamente.");
				i--;
			} else {
				soma += qtdAlunos;
			}
		}
		*/
		
		boolean invalido = true;
		
		for (int i = 1; i <= qtdTurmas; i++) {
			invalido = true;
			do {
				System.out.println("Entre com a quantidade de alunos da turma " + i + ":");
				qtdAlunos = scan.nextInt();
				
				if (qtdAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("As turmas não podem ter mais que 40 alunos. Tente novamente.");
				}
			} while (invalido);
			soma += qtdAlunos;
		}
		
		media = soma / qtdTurmas;
		System.out.println("A média de alunos por turma é de " + media + " alunos.");
		
	}

}