package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero inteiro positivo para o vetor A na posicao " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nVetor A na posição " + i + " = " + vetorA[i] + "\nAbaixo seguem os valores pares de 0 até " + vetorA[i] + ":");
            for (int j = 0; j <= vetorA[i]; j++) {        		
        		if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }

}