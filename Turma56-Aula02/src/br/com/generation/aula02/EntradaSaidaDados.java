package br.com.generation.aula02;

import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //entrada de dados do usu�rio
		
		int a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();

		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de " + a + " + " + b + " � " + soma);
		
		leia.close(); //fechar o scanner
	}

}
