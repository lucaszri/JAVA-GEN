package br.com.generation.exercicioslacosrepeat;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int valor1, valor2, valor3, valorM = 0;
		
		System.out.println("Digite o valor 1: ");
		valor1 = entrada.nextInt();

		System.out.println("Digite o valor 2: ");
		valor2 = entrada.nextInt();

		System.out.println("Digite o valor 3: ");
		valor3 = entrada.nextInt();
		
		if(valorM <= valor1) {
			valorM = valor1;
		} if(valorM <= valor2) {
			valorM = valor2;
		} if(valorM <= valor3) {
			valorM = valor3;
		}
		
		System.out.println("O maior valor � " + valorM);

		entrada.close();
	}

}
