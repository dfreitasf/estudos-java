package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com um número inteiro para o vetor A na posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
            System.out.print("Entre com um número inteiro para o vetor B na posição " + i + ": ");
            vetorB[i] = scan.nextInt();
            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.println("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\n\nVetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }

    }

}
