package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Especificação\tCódigo\tPreço");
		System.out.println("Cachorro Quente\t100\tR$ 1,20");
		System.out.println("Bauru Simples\t101\tR$ 1,30");
		System.out.println("Bauru com ovo\t102\tR$ 1,50");
		System.out.println("Hambúrguer\t103\tR$ 1,20");
		System.out.println("Cheeseburguer\t104\tR$ 1,30");
		System.out.println("Refrigerante\t105\tR$ 1,00");
		
		boolean continua = false;
		String resp = "", output = "";
		int codigo, quantidade;
		double compra = 0;
		
		System.out.println("\nOlá! Seja bem-vindo! Nova compra.");
		
		do {
			continua = false;
			System.out.print("Deseja inserir um novo item? (S/N)");
			resp = scan.next();
			if (resp.equalsIgnoreCase("s")) {
				continua = true;
				System.out.print("Entre com o código do item: ");
				codigo = scan.nextInt();
				
				if (codigo == 100) {
					System.out.print("Cachorro Quente. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1.2;
					output += "Cachorro Quente -> 1,20 * " + quantidade + " = " + quantidade*1.2 + "\n";
				} else if (codigo == 101) {
					System.out.print("Bauru Simples. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1.3;
					output += "Bauru Simples -> 1,30 * " + quantidade + " = " + quantidade*1.3 + "\n";
				} else if (codigo == 102) {
					System.out.print("Bauru com ovo. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1.5;
					output += "Bauru com ovo -> 1,50 * " + quantidade + " = " + quantidade*1.5 + "\n";
				} else if (codigo == 103) {
					System.out.print("Hambúrguer. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1.2;
					output += "Hambúrguer -> 1,20 * " + quantidade + " = " + quantidade*1.2 + "\n";
				} else if (codigo == 104) {
					System.out.print("Cheeseburguer. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1.3;
					output += "Cheeseburguer -> 1,30 * " + quantidade + " = " + quantidade*1.3 + "\n";
				} else if (codigo == 105) {
					System.out.print("Refrigerante. Entre com a quantidade: ");
					quantidade = scan.nextInt();
					compra += quantidade*1;
					output += "Refrigerante -> 1,00 * " + quantidade + " = " + quantidade*1 + "\n";
				} else {
					System.out.println("Código inválido!");
				}				
			} else if (resp.equalsIgnoreCase("n")) {
				continua = false;
			} else {
				continua = true;
				System.out.println("Opção inválida.");
			}
		} while (continua);
		
		System.out.println("\n" + output + "Total = R$ " + compra);
		System.out.println("Programa encerrado.");
	}

}
