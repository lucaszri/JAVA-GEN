package br.com.generation.exercicioslacosrepeat;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner entrada = new Scanner(System.in);
		
		double num, input;
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		input = num;
		num = num % 2;
		
		
		
		
		if(num == 0) {
			System.out.println("Par");
			System.out.printf("Raiz de quadrda " + input + " = " + "%.3f", Math.sqrt(input));
		} else if(num == 1) {
			System.out.println("Impar");
			System.out.println(input + " elevado ao quadrado � = " + Math.pow(input, 2));
		}
			
		entrada.close();
	}

}
