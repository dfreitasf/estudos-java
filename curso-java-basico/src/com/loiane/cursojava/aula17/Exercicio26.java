package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio26 { //Fatorial

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, resultado = 1;
		
		System.out.print("Entre com o número para cálculo do fatorial: ");
		num = scan.nextInt();
		System.out.print(num + "! = ");
		
		for (int i = num; i > 1; i--) {
			resultado *= i;
			System.out.print(i + " x ");
		}
		
		System.out.println("1 = " + resultado);

	}

}