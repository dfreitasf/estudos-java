package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int posB = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com um numero inteiro para o vetor A na posicao " + i + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.println("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B = ");
        for (int i = 0; i < posB; i++){
            System.out.print(vetorB[i] + " ");
        }

    }

}
