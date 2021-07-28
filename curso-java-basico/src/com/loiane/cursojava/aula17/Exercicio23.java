package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$" + i*1.99);
		}

	}

}