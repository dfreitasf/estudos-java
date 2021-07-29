package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com um numero inteiro para o vetor A na posicao " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("\nTabuada de " + vetorA[i] + ":");
            for (int j = 0; j <= 10; j++){
                System.out.println(vetorA[i] + " x " + j + " = " + vetorA[i] * j);
            }
        }

    }

}
