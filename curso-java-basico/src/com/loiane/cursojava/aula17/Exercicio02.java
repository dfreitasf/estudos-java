package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 { //Senha e Usu�rio

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usuario = "";
		String senha = "";
		
		do {
			System.out.println("Entre com o usu�rio:");
			usuario = scan.next();
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usu�rio e senha n�o podem ser iguais. Digite novamente.");
			} else { System.out.println("Senha e usu�rio v�lidos."); }
			
		} while (usuario.equalsIgnoreCase(senha));
		
	}

}
