package com.loiane.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do Salário Inicial: ");
		double salarioInicial = scan.nextDouble();
		
		double salarioAtual, aumento = 1.5;
		int ano = 1995;
		
		ano++;
		salarioAtual = salarioInicial * (1 + aumento/100);
		DecimalFormat format = new DecimalFormat("###,###.##");
		System.out.println("Ano: " + ano);
		System.out.println("Aumento: " + aumento + "%");
		System.out.println("Salário: " + salarioAtual);
		
		for (int i = 1997; i <= 2021; i++) {
			aumento *= 2;
			salarioAtual *= (1+aumento/100);
			System.out.println("\nAno: " + i);
			System.out.println("Aumento: " + format.format(aumento) + "%");
			System.out.println("Salário: " + format.format(salarioAtual));
		}

	}

}