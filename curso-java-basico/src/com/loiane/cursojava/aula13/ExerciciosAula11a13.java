package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula11a13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		//Exercicio 1:
		System.out.println("Alo mundo");
		*/
		
		/*		
		//Exercicio 2:
		System.out.println("Entre com um n�mero inteiro:");
		int numero = scan.nextInt();
		System.out.println("O n�mero informado foi " + numero);
		*/

		/*
		//Exercicio 3:
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextByte();
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextByte();
		
		int resultado = num1 + num2; 
		
		System.out.println("A soma dos n�meros �: " + resultado);
		*/
		
		/*
		//Exercicio 4:
		System.out.println("Inserir nota do bimestre 01 de 0 a 25 pontos:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Inserir nota do bimestre 02 de 0 a 25 pontos:");
		double nota2 = scan.nextDouble();
		
		System.out.println("Inserir nota do bimestre 03 de 0 a 25 pontos:");
		double nota3 = scan.nextDouble();
		
		System.out.println("Inserir nota do bimestre 04 de 0 a 25 pontos:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("M�dia Final = " + media);
		*/
		
		/*
		//Exercicio 5:
		System.out.println("Digite a medida em metros:");
		double medida = scan.nextDouble();
		System.out.println("Medida convertida em cent�metros = " + medida * 100);
		*/
		
		/*
		//Exercicio 6:
		System.out.println("Digite o valor do raio do circulo:");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2) ;
		System.out.println("�rea do c�rculo = " + area);
		*/
		
		/*
		//Exercicio 7:
		System.out.println("Digite o valor da medida de um dos lados do quadrado:");
		double lado = scan.nextDouble();
		
		double areaQuadrado = Math.pow(lado, 2);
		System.out.println("�rea do quadrado = " + areaQuadrado);
		
		double dobroAreaQuadrado = areaQuadrado * 2;
		System.out.println("Dobro da �rea do quadrado = " + dobroAreaQuadrado);
		*/
		
		/*
		//Exercicio 8:
		System.out.println("Digite o valor de sua hora trabalhada:");
		double valorHoraTrabalhada = scan.nextDouble();
		System.out.println("Digite quantas horas voc� trabalha no m�s:");
		double qtdHorasTrabalhadasMes = scan.nextDouble();
		System.out.println("Sal�rio no m�s de refer�ncia = " + valorHoraTrabalhada * qtdHorasTrabalhadasMes);
		*/
		
		/*
		//Exercicio 9:
		System.out.println("Digite a temperatura em graus Fahrenheit:");
		double tempF = scan.nextDouble();
		double tempC = (tempF - 32)/9*5;
		System.out.println("Temperatura em graus Celsius = " + tempC);
		*/
		
		/*
		//Exercicio 10:
		System.out.println("Digite a temperatura em graus Celsius:");
		double tempC = scan.nextDouble();
		double tempF = (tempC*9/5)+32;
		System.out.println("Temperatura em graus Fahrenheit = " + tempF);
		*/
		
		/*
		//Exercicio 11:
		System.out.println("Digite o primeiro n�mero inteiro:");
		int inteiro01 = scan.nextInt();
		System.out.println("Digite o segundo n�mero inteiro:");
		int inteiro02 = scan.nextInt();
		System.out.println("Digite um n�mero real:");
		double real01 = scan.nextDouble();
		
		double resultado01 = inteiro01 * 2 * inteiro02 / 2;
		System.out.println("Produto do dobro do primeiro com metade do segundo = " + resultado01);
		
		double resultado02 = inteiro01 * 3 + real01;
		System.out.println("Soma do triplo do primeiro com o terceiro = " + resultado02);
		
		double resultado03 = Math.pow(real01, 3);
		System.out.println("Terceiro elevado ao cubo = " + resultado03);
		*/
		
		/*
		//Exercicio 12:
		System.out.println("Digite sua altura em metros:");
		double altura = scan.nextDouble();
		double peso = altura*72.7-58;
		System.out.println("Seu peso ideal � = " + peso);
		*/
		
		/*
		//Exercicio 13:
		System.out.println("Digite o valor de sua hora trabalhada:");
		double valorHoraTrabalhada = scan.nextDouble();
		System.out.println("Digite quantas horas voc� trabalha no m�s:");
		double qtdHorasTrabalhadasMes = scan.nextDouble();
		
		double salarioBruto = valorHoraTrabalhada * qtdHorasTrabalhadasMes;
		double impostoRenda = 0.11 * salarioBruto;
		double inss = 0.08 * salarioBruto;
		double sindicato = 0.05 * salarioBruto;
		double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
		
		System.out.println("Sal�rio Bruto : " + salarioBruto + "R$ " + "- IR (11%) : " + impostoRenda + "R$ " + "- INSS (8%) : " + inss + "R$ " + "- Sindicato ( 5%) : " + sindicato + "R$ " + "= Sal�rio L�quido : " + salarioLiquido + "R$");
		*/
		
		
		//Exercicio 14:
		System.out.println("Digite o tamanho do arquivo para download (em MB):");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Qual a velocidade do link de internet (em Mbps):");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoDownload = tamanhoArquivo / velocidadeInternet / 60;
				
		System.out.println("Tempo aproximado de download (em minutos): " + tempoDownload);
		
		
	}

}
