package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 { //Cálculo de Potências

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int base, expoente, resultado = 0;
		
		System.out.println("Entre com o valor da base:");
		base = scan.nextInt();
		
		System.out.println("Entre com o valor do expoente:");
		expoente = scan.nextInt();
		
		for (int i = 0; i <= expoente; i++) {
			if (i == 0) {
				resultado = base/base;
			} else if (i == 1) {
				resultado = base;
			} else if (i > 1) {
				resultado *= base;
			}
			
		}
 		
		System.out.println("O resultado de " + base + " elevado à " + expoente + "ª potência é igual a: " + resultado);

	}

}
