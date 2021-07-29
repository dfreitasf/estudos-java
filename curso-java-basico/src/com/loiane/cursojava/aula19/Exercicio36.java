package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio36 {

    public static void main(String[] args) {

        double[] vetorA = new double[11];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.pow(2, i);
        }
        
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }

    }

}