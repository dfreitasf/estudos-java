package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o pre�o do p�o:");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$" + i*preco);
		}

	}

}