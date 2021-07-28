package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 { //Senha e Usuário

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario = "";
		String senha = "";
		
		do {
			System.out.println("Entre com o usuário:");
			usuario = scan.next();
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usuário e senha não podem ser iguais. Digite novamente.");
			} else { System.out.println("Senha e usuário válidos."); }
			
		} while (usuario.equalsIgnoreCase(senha));
		
	}

}
