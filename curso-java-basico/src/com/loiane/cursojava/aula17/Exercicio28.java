package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio28 { //N�meros Primos

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero a ser checado:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("O n�mero " + num + " n�o � um n�mero primo.");
				primo = false;
			}
		}
		
		if (primo ) {
			System.out.println("O n�mero " + num + " � um n�mero primo.");
		}

	}

}