package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a cotação do dólar: ");
		double cotacaoDolar = scan.nextDouble();
		
		double[] vetorA = new double[20];
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacaoDolar * (i+1);
			System.out.println("USD " + (i+1) +",00\t=\tR$ " + df.format(vetorA[i]));
		}
		
	}

}
