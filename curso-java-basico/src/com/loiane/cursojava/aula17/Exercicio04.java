package com.loiane.cursojava.aula17;

public class Exercicio04 {

	public static void main(String[] args) {

		int qtdAnos = 0;
		int popA = 80000;
		int popB = 200000;
		
		for ( ; popA <= popB; popA += popA*0.03, popB += popB*0.015) {
			qtdAnos++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);		
		System.out.println("Quantidade de anos necess�rios para popula��o do pa�s A ultrapassar a popula��o do pa�s B = " + qtdAnos + " anos.");

	}

}
