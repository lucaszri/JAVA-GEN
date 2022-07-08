package br.com.generation.exercicioslacosrepeat;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
		 */
		Scanner entrada = new Scanner(System.in);
		
		double num, input;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		input = num;
		num = num % 2;
		
		
		
		
		if(num == 0) {
			System.out.println("Par");
			System.out.printf("Raiz de quadrda " + input + " = " + "%.3f", Math.sqrt(input));
		} else if(num == 1) {
			System.out.println("Impar");
			System.out.println(input + " elevado ao quadrado é = " + Math.pow(input, 2));
		}
			
		entrada.close();
	}

}
