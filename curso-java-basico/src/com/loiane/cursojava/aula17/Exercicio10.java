package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, menor = Integer.MIN_VALUE, maior = Integer.MAX_VALUE;

		System.out.println("Entre com um numero inteiro:");
		num1 = scan.nextInt();
		menor = num1;
		maior = num1;
		
		System.out.println("Entre com outro numero inteiro:");
		num2 = scan.nextInt();
		if (num2 < num1) { 
			menor = num2;
		} else { maior = num2; }
		
		int i = menor;
		
		while (i < maior-1) {
			i++;
			System.out.print(i + " ");
		}
		

	}

}
