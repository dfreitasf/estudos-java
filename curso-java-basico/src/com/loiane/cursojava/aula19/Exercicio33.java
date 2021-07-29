package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero inteiro positivo para o vetor A na posicao " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        boolean primo = true;

        /*
        int j = 2;

        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            j = 2;
            while (primo && vetorA[i] != j && vetorA[i] > 2) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                } else {
                    j++;
                }
            }
            if (vetorA[i] == 1 || vetorA[i] == 2 || vetorA[i] == j) {
                System.out.println(vetorA[i] + " eh primo.");
            } else {
                System.out.println(vetorA[i] + " nao eh primo.");
            }
        }*/

        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo && vetorA[i] != 0) {
                System.out.println(vetorA[i] + " eh primo.");
            } else {
                System.out.println(vetorA[i] + " nao eh primo.");
            }
        }

    }

}
