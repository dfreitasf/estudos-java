package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int j = 0, k = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com um número inteiro para o vetor A na posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[j] = vetorA[i];
                j++;
            } else {
                vetorC[k] = vetorA[i];
                k++;
            }
        }

        System.out.println("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B = ");
        for (int i = 0; i < j; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\n\nVetor C = ");
        for (int i = 0; i < k; i++){
            System.out.print(vetorC[i] + " ");
        }

    }

}