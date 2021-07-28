package com.loiane.cursojava.aula11;

public class VariaveisPontoFlutuante {

	public static void main(String[] args) {

		double valorPassagem = 2.90;
		
		//float valorTomate = 3.95f;
		float valorTomate = 3.95F;

		double d1 = 123.4;
		
		//mesmo valor que d1, mas em notação científica
		double d2 = 1.234e2; 
		
		
		System.out.println ("Valor da passagem = " + valorPassagem);

		System.out.println ("Valor do tomate = " + valorTomate);
		
		System.out.println("Valor Notação Científica d1 = " + d1);
		
		System.out.println("Valor Notação Científica d2 = " + d2);
		
	}

}
