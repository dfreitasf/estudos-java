package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio29 { //Números Primos

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você deseja visualizar a lista de números primos até qual valor?:");
		int limitePrimos = scan.nextInt();
		
		boolean primo = true;
		
		for (int num = 1; num <= limitePrimos; num++) {
			primo = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.print(num + " ");
			}
		}
		
	}

}