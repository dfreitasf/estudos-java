package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
				
		for (int i = 0; i < resultados.length; i++) {
			System.out.print("Entre com o valor da 1º Bimestre do Aluno " + (i+1) + ": ");
			notas1[i] = scan.nextDouble();
			System.out.print("Entre com o valor da 2º Bimestre do Aluno " + (i+1) + ": ");
			notas2[i] = scan.nextDouble();
			resultados[i] = (notas1[i] + notas2[i]) / 2;
		}
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		for (int i = 0; i < resultados.length; i++) {
			System.out.print("Aluno " + (i+1) + " - Nota 1º Bimestre: " + df.format(notas1[i]) + " - Nota 2º Bimestre: " + df.format(notas2[i]) + " - Média: " + df.format(resultados[i]) + " - Situação: ");
			if (resultados[i] >= 7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
		
		}
		
	}

}
