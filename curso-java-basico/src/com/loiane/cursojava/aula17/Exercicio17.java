package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 { //Fatorial

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, resultado = 1;
		
		System.out.print("Entre com o n�mero para c�lculo do fatorial: ");
		num = scan.nextInt();
		
		for (int i = num; i > 0; i--) {
			resultado *= i;
		}
		
		System.out.println("O fatorial de " + num + " �: " + resultado);

	}

}