package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		String continuarCompra;
		int numero = 1;
		double preco = 0, soma = 0, dinheiro = 0;
		
		do {
			System.out.println("Lojas Tabajara");
			numero = 1;
			soma = 0;
			
			do {
				System.out.print("Produto " + numero + ": R$ ");
				preco = scan.nextDouble();
				soma += preco;
				numero++;
			} while (preco != 0);
			
			System.out.println("Total: R$ " + soma);
			System.out.print("Dinheiro: R$ ");
			dinheiro = scan.nextDouble();
			System.out.println("Troco: R$ " + (dinheiro-soma) + "\n...");
			System.out.println("Deseja informar uma nova compra? (S/N)");
			continuarCompra = scan.next();
			if (continuarCompra.equalsIgnoreCase("n")) {
				sair = true;
				System.out.println("Programa encerrado.");
			}
		} while (!sair);

	}

}