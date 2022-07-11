package br.com.generation.exerciciosforwhiledo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE) */ 
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um n�mero:           [Para encerrar digite 0]");
			numero = entrada.nextInt();
			System.out.println(soma + " + " + numero);
			soma += numero;
			System.out.println(" = " + soma);
			if(numero == 0) {
				System.out.println("Programa encerrado, o calculo final est� abaixo: \n");
			}
		} while(numero != 0);
		
		System.out.println("Soma final �: " + soma);
		
		entrada.close();
	}

}
