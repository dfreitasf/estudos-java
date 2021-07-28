package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiraString = "Esta é";
		String segundaString = "uma String concatenada.";
		String terceiraString = primeiraString + segundaString;
		System.out.println(terceiraString);

		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		resultado = -resultado;
		System.out.println(resultado);
		boolean success = false;
		
		System.out.println(success);
		System.out.println(!success);
		
		int i = 3;
		i++;
		// output 4
		System.out.println(i);
		
		++i;
		// output 5
		System.out.println(i);
		
		// output 6
		System.out.println(++i);
		/*mesma coisa que:
		 i += 1;
		 System.out.println(i);*/
		
		// output 6
		System.out.println(i++);
		/*mesma coisa que:
		System.out.println(i);
		i = i + 1; ou i += 1;*/
		
		// output 7
		System.out.println(i);
		
	}

}
