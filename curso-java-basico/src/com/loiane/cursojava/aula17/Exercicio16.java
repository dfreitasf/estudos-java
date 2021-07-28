package com.loiane.cursojava.aula17;

public class Exercicio16 { //Fibonacci

	public static void main(String[] args) {
		
		int anterior1 = 1, anterior2 = 1, atual = 0;
		
		System.out.print("1 1");
		while (atual <= 500) {
			atual = anterior1 + anterior2;
			System.out.print(" " + atual);
			anterior2 = anterior1;
			anterior1 = atual;
		}
		
		

	}

}
