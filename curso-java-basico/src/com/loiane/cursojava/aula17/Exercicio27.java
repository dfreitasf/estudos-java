package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		double temp = 0, soma = 0, media = 0;
		
		System.out.println("Entre com a quantidade de temperaturas:");
		int qtdTemperaturas = scan.nextInt();
		
		for (int i=1; i<=qtdTemperaturas; i++) {
			System.out.println("Entre com a temperatura em graus Celsius:");
			temp = scan.nextDouble();
			if (temp > maior) {
				maior = temp;
			}
			if (temp < menor && temp != 0) {
				menor = temp;
			}
			soma += temp;
		}
		
		media = soma / qtdTemperaturas;
		
		System.out.println("A maior temperatura registrada foi: " + maior);
		System.out.println("A menor temperatura registrada foi: " + menor);
		System.out.println("A média das temperaturas registradas foi de: " + media);

	}

}