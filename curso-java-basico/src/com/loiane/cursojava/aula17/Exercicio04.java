package com.loiane.cursojava.aula17;

public class Exercicio04 {

	public static void main(String[] args) {

		int qtdAnos = 0;
		int popA = 80000;
		int popB = 200000;
		
		for ( ; popA <= popB; popA += popA*0.03, popB += popB*0.015) {
			qtdAnos++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);		
		System.out.println("Quantidade de anos necessários para população do país A ultrapassar a população do país B = " + qtdAnos + " anos.");

	}

}
