package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ExerciciosAula14a15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		//Exercicio 1
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("Este é o maior número digitado: " + num1);
		} else if (num1 < num2) {
			System.out.println("Este é o maior número digitado: " + num2);
		} else {
			System.out.println("Os números são iguais.");
		}
		*/
		
		/*
		//Exercicio 2
		System.out.println("Entre com um número:");
		int numero = scan.nextInt();
						
		if (numero > 0) {
			System.out.println("Este número é positivo.");
		} else if (numero < 0) {
			System.out.println("Este número é negativo.");
		} else {
			System.out.println("Este número é nulo. Valor igual a 0.");
		}
		*/
		
		/*
		//Exercicio 3
		System.out.println("Entre com o sexo (F ou M):");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
		*/
		// Opção B
		/*
		switch (sexo) {
			case "F": System.out.println("F - Feminino"); break;
			case "M": System.out.println("M - Masculino"); break;
			default: System.out.println("Sexo inválido"); 
		}
		*/
		
		
		/*
		//Exercicio 4
		System.out.println("Entre com uma letra (a-z):");
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida!");
		} else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Letra " + letra + " é vogal.");
		} else {
			System.out.println("Letra " + letra + " é consoante.");
		}
		*/
		// Opção B
		/*
		switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Letra " + letra + " é vogal."); break;	
			default: System.out.println("Letra " + letra + " é consoante.");
		}
		*/
		
		/*
		//Exercicio 5
		System.out.println("Entre com a nota 1 (0 a 10):");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a nota 2 (0 a 10):");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média = " + media);
		
		if (media < 7) {
			System.out.println("Reprovado");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else {
			System.out.println("Intervalo inválido");
		}
		*/
		
		/*
		//Exercicio 6
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
				
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = scan.nextInt();*/		
		/*
		// Opção A
		int comparativo1;
		if (num1 > num2) {
			comparativo1 = num1;
		} else {
			comparativo1 = num2;
		}
		
		if (num3 > comparativo1) {
			System.out.println("O maior número digitado é o " + num3);
		} else {
			System.out.println("O maior número digitado é o " + comparativo1);
		}*/
		/*
		//Opção B
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior número digitado é o " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número digitado é o " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O maior número digitado é o " + num3);
		}
		*/
			
		/*
		//Exercicio 7
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
				
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = scan.nextInt();
		
		int maiorParcial;
		int menorParcial;
		
		if (num1 > num2) {
			maiorParcial = num1;
			menorParcial = num2;
		} else {
			maiorParcial = num2;
			menorParcial = num1;
		}
		
		if (num3 > maiorParcial) {
			System.out.println("O maior número digitado é o " + num3);
		} else {
			System.out.println("O maior número digitado é o " + maiorParcial);
		}
		
		if (num3 < menorParcial) {
			System.out.println("O menor número digitado é o " + num3);
		} else {
			System.out.println("O menor número digitado é o " + menorParcial);
		}
		*/
		
		/*
		//Exercicio 8
		System.out.println("Entre com o preço do primeiro produto:");
		double preco1 = scan.nextDouble();
				
		System.out.println("Entre com o preço do segundo produto:");
		double preco2 = scan.nextDouble();
		
		System.out.println("Entre com o preço do terceiro produto:");
		double preco3 = scan.nextDouble();
		
		double menorPreco;
		if (preco1 < preco2) {
			menorPreco = preco1;
		} else {
			menorPreco = preco2;
		}
		if (preco3 < menorPreco) {
			menorPreco = preco3;
		}
		
		if (menorPreco == preco1) {
			System.out.println("Você deve optar pela compra do primeiro produto.");
		} else if (menorPreco == preco2) {
			System.out.println("Você deve optar pela compra do segundo produto.");
		} else {
			System.out.println("Você deve optar pela compra do terceiro produto.");
		}
		*/
		
		/*
		//Exercicio 9
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
				
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = scan.nextInt();
		
		int maior;
		int menor;
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		int meio;
		
		if (num3 > maior) {
			meio = maior;
			maior = num3;
		} else if (num3 < menor) {
			meio = menor;
			menor = num3;
		} else {
			meio = num3;
		}
		
		System.out.println("Números digitados em ordem decrescente: " + maior + " >= " + meio + " >= " + menor);
		*/
		
		/*
		//Exercicio 10
		System.out.println("Em que turno você estuda?\nDigite uma das opções abaixo:\nM - Matutino; V - Vespertino; N - Noturno");
		String turno = scan.next();
								
		switch (turno) {
			case "m":
			case "M": System.out.println("Bom dia!"); break;
			case "v":
			case "V": System.out.println("Boa tarde!"); break;
			case "n":
			case "N": System.out.println("Boa noite!"); break;
			default: System.out.println("Valor inválido!");
		}
		*/
		
		/*
		//Exercicio 11
		System.out.println("Entre com o valor do salário:");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			double reajuste = salario * 0.20;
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("% aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + reajuste);
			System.out.println("Novo salário após o aumento: " + (salario + reajuste));
		} else if (salario > 280 && salario <= 700) {
			double reajuste = salario * 0.15;
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("% aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + reajuste);
			System.out.println("Novo salário após o aumento: " + (salario + reajuste));
		} else if (salario > 700 && salario <= 1500) {
			double reajuste = salario * 0.10;
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("% aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + reajuste);
			System.out.println("Novo salário após o aumento: " + (salario + reajuste));
		} else if (salario > 1500) {
			double reajuste = salario * 0.05;
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println("% aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + reajuste);
			System.out.println("Novo salário após o aumento: " + (salario + reajuste));
		}
		*/
		
		/*
		//Exercicio 12
		System.out.println("Entre com o valor da hora trabalhada:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
		int qtdHoras = scan.nextInt();
		
		double salarioBruto = valorHora * qtdHoras;
		double sindicato = 3;
		double fgts = 11;
		double inss = 10;
		double ir = 0;
				
		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = 10;
		} else if (salarioBruto > 2500) {
			ir = 20;
		}
		
		double totalDescontos = (sindicato + inss + ir) / 100 * salarioBruto;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ")\t: R$\t" + salarioBruto);
		System.out.println("(-) IR (" + ir + "%)\t\t\t: R$\t" + ir / 100 * salarioBruto);
		System.out.println("(-) INSS (" + inss + "%)\t\t: R$\t" + inss / 100 * salarioBruto);
		System.out.println("(-) Sindicato (" + sindicato + "%)\t\t: R$\t" + sindicato / 100 * salarioBruto);
		System.out.println("FGTS (" + fgts + "%)\t\t\t: R$\t" + fgts / 100 * salarioBruto);
		System.out.println("Total de descontos\t\t: R$\t" + totalDescontos);
		System.out.println("Salário Líquido\t\t\t: R$\t" + salarioLiquido);
		 */
	
		/*
		//Exercicio 13
		System.out.println("Entre com o dia da semana (1-Domingo, 2-Segunda, etc.):");
		int diaSemana = scan.nextInt();
	
		switch (diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Valor inválido!");
	
		}
		*/
		
		/*
		//Exercicio 14
		System.out.println("Entre com a nota 1:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a nota 2:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		char conceito = 'z';
		boolean aprovacao = false;
		
		if (media >= 9 && media <= 10) {
			conceito = 'A';
			aprovacao = true;
		} else if (media >= 7.5 && media < 9) {
			conceito = 'B';
			aprovacao = true;
		} else if (media >= 6 && media < 7.5) {
			conceito = 'C';
			aprovacao = true;
		} else if (media >= 4 && media < 6) {
			conceito = 'D';
			aprovacao = false;
		} else if (media >= 0 && media < 4) {
			conceito = 'E';
			aprovacao = false;
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média de Aproveitamento: " + media);
		System.out.println("Conceito: " + conceito);
				
		if (aprovacao == true) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
		*/
		
		/*
		//Exercicio 15
		System.out.println("Entre com o primeiro lado do triângulo:");
		double lado1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo lado do triângulo:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Entre com o terceiro lado do triângulo:");
		double lado3 = scan.nextDouble();
		
		double testeTriangulo = 0;
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
			System.out.print("Pode ser um triângulo ");
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("equilátero.");
			} else if ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado3) || (lado2 == lado3 && lado2 != lado1)) {
				System.out.println("isósceles.");
			} else {
				System.out.println("escaleno.");
			}
		} else {
			System.out.println("Não pode ser um triângulo.");
		}
		*/
		
		/*
		//Exercicio 16
		System.out.println("Entre com o valor 'a' da equação de segundo grau:");
		int a = scan.nextInt();
				
		if (a == 0) {
			System.out.println("A equação não é de segundo grau.\nPrograma encerrado.");
		} else {
			
			System.out.println("Entre com o valor 'b' da equação de segundo grau:");
			int b = scan.nextInt();
			
			System.out.println("Entre com o valor 'c' da equação de segundo grau:");
			int c = scan.nextInt();
			
			double delta = Math.pow(b, 2) - 4 * a * c;
						
			if (delta < 0) {
				System.out.println("Valor de delta = " + delta + ". Valor negativo. A equação não possui raízes reais.\nPrograma encerrado.");
			} else {
				
				double raiz1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double raiz2 = ((-b) - Math.sqrt(delta)) / (2*a);
				if (delta == 0) {
					System.out.println("Valor de delta = " + delta + ". Valor igual a zero. A equação possui apenas uma raiz real:\nRaiz = " + (-b) + "\nPrograma encerrado.");
				} else if (delta > 0) {
					System.out.println("Valor de delta = " + delta + ". Valor positivo. A equação possui duas raízes reais:\nRaiz x' = " + raiz1 + "\nRaiz x'' = " + raiz2 + "\nPrograma encerrado.");
				}
			}
					
		}
		*/
		
		/*
		//Exercicio 17
		System.out.println("Entre com o ano a ser analisado:");
		int ano = scan.nextInt();
				
		if ((ano % 400 == 0) || (ano % 100 != 0) && (ano % 4 == 0)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		*/
		
		/*
		//Exercicio 18
		System.out.println("Entre com um número inteiro:");
		int num = scan.nextInt();
				
		if (num % 2 == 0) {
			System.out.println(num + " é um número par.");
		} else {
			System.out.println(num + " é um número ímpar.");
		}
		*/
		
		/*
		//Exercicio 19 - Calculadora
		System.out.println("Entre com o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação você quer realizar (Digite uma das opções abaixo):\n1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
		int opcao = scan.nextInt();
		
		if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
			int resultado = 0;
			switch (opcao) {
				case 1: resultado = num1 + num2; break;
				case 2: resultado = num1 - num2; break;
				case 3: resultado = num1 * num2; break;
				case 4: resultado = num1 / num2; break;	
			}
			if (resultado % 2 == 0 && resultado >= 0) {
				System.out.println(resultado + " é um número par e positivo.");
			} else if (resultado % 2 == 0 && resultado < 0) {
				System.out.println(resultado + " é um número par e negativo.");
			} else if (resultado % 2 != 0 && resultado >= 0) {
				System.out.println(resultado + " é um número ímpar e positivo.");
			} else if (resultado % 2 != 0 && resultado < 0) {
				System.out.println(resultado + " é um número ímpar e negativo.");
			}
		} else {
			System.out.println("Opção inválida.");
		}
		*/	
		
		/*
		//Exercicio 20 - Investigação
		int cont = 0;
		
		System.out.println("Telefonou para a vítima? (S/N)");
		String a = scan.next();
		if (a.equalsIgnoreCase("s")) { cont++; }
		
		System.out.println("Esteve no local do crime? (S/N)");
		String b = scan.next();
		if (b.equalsIgnoreCase("s")) { cont++; }
		
		System.out.println("Mora perto da vítima? (S/N)");
		String c = scan.next();
		if (c.equalsIgnoreCase("s")) { cont++; }
		
		System.out.println("Devia para a vítima? (S/N)");
		String d = scan.next();
		if (d.equalsIgnoreCase("s")) { cont++; }
		
		System.out.println("Já trabalhou com a vítima? (S/N)");
		String e = scan.next();
		if (e.equalsIgnoreCase("s")) { cont++; }
		
		if (cont < 2) {
			System.out.println("Inocente!");
		} else if (cont == 2) {
			System.out.println("Suspeito!");
		} else if (cont > 2 && cont <= 4) {
			System.out.println("Cúmplice!");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		}
		*/
		
		/*
		//Exercicio 21 - Posto de Gasolina
		System.out.println("Quantidade de litros vendidos:");
		double qtdLitros = scan.nextDouble();
		
		System.out.println("Qual o tipo de combustível? Escolha uma das opções abaixo:\nA-álccol G-gasolina");
		String tipoComb = scan.next();
		
		if (tipoComb.equalsIgnoreCase("a") || tipoComb.equalsIgnoreCase("g")) {
			
			double desc = 0;
			double valorFinal = 0;
			double precoGasolina = 2.50;
			double precoAlcool = 1.90;
					
			if (tipoComb.equalsIgnoreCase("a") && qtdLitros < 20) {
				desc = 0.97;
				valorFinal = qtdLitros * precoAlcool * desc;
			} else if (tipoComb.equalsIgnoreCase("a") && qtdLitros >= 20) {
				desc = 0.95;
				valorFinal = qtdLitros * precoAlcool * desc;
			} else if (tipoComb.equalsIgnoreCase("g") && qtdLitros < 20) {
				desc = 0.96;
				valorFinal = qtdLitros * precoGasolina * desc;
			} else if (tipoComb.equalsIgnoreCase("g") && qtdLitros >= 20) {
				desc = 0.94;
				valorFinal = qtdLitros * precoGasolina * desc;
			}
			
			System.out.println("Valor a ser pago: R$" + valorFinal);
		
		} else {
			System.out.println("Tipo de combustível inválido.");
		}
		*/
		
		/*
		//Exercicio 22 - Varejão
		System.out.println("Você comprou quantos Kg de Morango?");
		double pesoMorango = scan.nextDouble();
		double precoMorango = 0;
		if (pesoMorango < 5) { precoMorango = 2.50;
		} else { precoMorango = 2.20; }
		double compraMorango = pesoMorango * precoMorango;
		
		System.out.println("Você comprou quantos Kg de Maçã?");
		double pesoMaca = scan.nextDouble();
		double precoMaca = 0;
		if (pesoMaca < 5) { precoMaca = 1.80;
		} else { precoMaca = 1.50; }
		double compraMaca = pesoMaca * precoMaca;
		
		double pesoTotal = pesoMorango + pesoMaca;
		double compraTotal = compraMorango + compraMaca;
		
		if (compraTotal >= 25 || pesoTotal >= 8) {
			compraTotal = compraTotal * 0.90;
		}
		
		System.out.println("Valor final de sua compra = R$" + compraTotal);
		*/
		
		
		//Exercicio 23 - Açougue
		System.out.println("Escolha apenas um tipo de carne (Opções abaixo):\n1-File Duplo; 2-Alcatra; 3-Picanha");
		int tipoCarne = scan.nextInt();
		
		boolean valido = true;
		
		System.out.println("Digite a quantidade de carne comprada (Kg):");
		double qtdCarne = scan.nextDouble();
		
		System.out.println("Pagamento será com o cartão Tabajara? (S/N)");
		String cartaoTabajara = scan.next();
		
		double precoKg = 0;
				
		if (tipoCarne == 1 && qtdCarne < 5) {
			precoKg = 4.90;
		} else if (tipoCarne == 1 && qtdCarne >= 5) {
			precoKg = 5.80;
		} else if (tipoCarne == 2 && qtdCarne < 5) {
			precoKg = 5.90;
		} else if (tipoCarne == 2 && qtdCarne >= 5) {
			precoKg = 6.80;
		} else if (tipoCarne == 3 && qtdCarne < 5) {
			precoKg = 6.90;
		} else if (tipoCarne == 3 && qtdCarne >= 5) {
			precoKg = 7.80;
		} else {
			System.out.println("Tipo de carne inválido.\nPrograma encerrado.");
			valido = false;
		}
		
		if (valido == true) {
			double valorParcial = qtdCarne * precoKg;
			double desconto = 0;
			if (cartaoTabajara.equalsIgnoreCase("s")) {
				desconto = 5;
			}
			double valorFinal = valorParcial * (1-desconto/100);
			System.out.println(valorFinal);
			
			switch (tipoCarne) {
				case 1: System.out.println("Tipo de carne: 1 - Filé Duplo"); break;
				case 2: System.out.println("Tipo de carne: 2 - Alcatra"); break;
				case 3: System.out.println("Tipo de carne: 3 - Picanha"); break;
			}
			System.out.println("Quantidade de carne comprada: " + qtdCarne + "Kg");
			System.out.println("Preço total: R$" + valorParcial);
			if (desconto == 0) {
				System.out.println("Cliente não utilizou cartão Tabajara.");
			} else {
				System.out.println("Cliente utilizou cartão Tabajara.");
			}
			System.out.println("Desconto " + desconto + "%");
			System.out.println("Valor do desconto: R$" + (valorParcial*desconto/100));
			System.out.println("Valor a pagar: R$" + valorFinal);
		}	
		
	}
	
}
