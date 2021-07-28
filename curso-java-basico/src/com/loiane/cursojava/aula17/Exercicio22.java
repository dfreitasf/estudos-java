package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CD's em sua cole��o:");
		int qtd = scan.nextInt();
		double preco = 0, media = 0, soma = 0;
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Qual o pre�o do CD " + i + ":");
			preco = scan.nextDouble();
			soma += preco;
		}
		
		media = soma / qtd;
		
		System.out.println("Valor total de sua cole��o de CD's = R$" + soma);
		System.out.println("Valor m�dio gasto por CD nesta cole��o = R$" + media);
	
	}

}