package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
			
		for (int i = 5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + " e j tem valor: " + j);
		}
		
		int count = 0;
		for ( ; count < 5 ; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		
		// igual ao bloco "for" acima
		/*
		for (int cont = 0; cont < 5; cont += 2) {
			System.out.println("valor de count: " + cont);
		}
		*/
		
		//loop infinito. Obs.: N�o fa�a isso, o computador trava.
		//for ( ; ; );
		//while (true);
		
		int soma = 0;
		
		for (int i = 1; i < 5; soma += i++) {
		} // corpo vazio
		System.out.println("O valor da soma � " + soma);
		
		for (int i = 1; i < 5; soma += i++); // corpo vazio sem uso de chaves, fechando com o ponto e v�rgula
		System.out.println("O valor da soma � " + soma);
		
		for (int i = 1; i < 5; soma += i++)
			System.out.println("O valor da soma � " + soma); //quando n�o abre chaves apenas a primeira linha do for � executada
	}

}
