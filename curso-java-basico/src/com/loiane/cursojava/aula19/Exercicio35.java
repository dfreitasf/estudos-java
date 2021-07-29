package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero inteiro positivo para o vetor A na posicao " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nVetor A na posição " + i + " = " + vetorA[i] + "\nAbaixo seguem os divisores de " + vetorA[i] + ":");
            for (int j = 1; j <= vetorA[i]; j++) {        		
        		if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }

}