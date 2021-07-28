package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome = "";
		
		do {
			System.out.println("Entre com seu nome:");
			nome = scan.next();
			if (nome.length() <= 3) {
				System.out.println("Nome precisa ter mais que 3 caracteres, digite novamente.\n");
			}
		} while (nome.length() <= 3);
		
		int idade = 0;
		
		do {
			System.out.println("Entre com sua idade:");
			idade = scan.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("Idade inválida, digite novamente.\n");
			}
		} while (idade < 0 || idade > 150);
		
		double salario = 0;
		
		do {
			System.out.println("Entre com seu salário:");
			salario = scan.nextDouble();
			if (salario < 0) {
				System.out.println("Valor inválido, digite novamente.\n");
			}
		} while (salario < 0);
		
		String sexo = "";
		
		do {
			System.out.println("Entre com seu sexo (M/F):");
			sexo = scan.next();
			if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
				System.out.println("Sexo inválido, digite novamente.\n");
			}
		} while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
		
		String estadoCivil = "";
		
		do {
			System.out.println("Entre com seu estado civil. Opções abaixo:\nS-solteiro; C-casado; V-viúvo; D-divorciado");
			estadoCivil = scan.next();
			if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("Estado civil inválido, digite novamente.\n");
			}
		} while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));

		System.out.println("Nome: " + nome);
		System.out.println(idade + " anos");
		System.out.println("R$" + salario);
		
		switch (sexo) {
			case "m":
			case "M": System.out.println("Sexo: Masculino"); break;
			case "f":
			case "F": System.out.println("Sexo: Feminino"); break;
		}
		
		switch (estadoCivil) {
		case "s":
		case "S": System.out.println("Estado civil: Solteiro"); break;
		case "c":
		case "C": System.out.println("Estado civil: Casado"); break;
		case "v":
		case "V": System.out.println("Estado civil: Viúvo"); break;
		case "d":
		case "D": System.out.println("Estado civil: Divorciado"); break;
		}
		
	}

}
