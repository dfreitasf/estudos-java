package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com um valor inteiro para o vetor A na posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[vetorA.length - 1 - i] = vetorA[i];
        }

        System.out.println("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }

}
