package br.com.generation.exerciciosforwhiledo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */ 
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número:           [Para encerrar digite 0]");
			numero = entrada.nextInt();
			System.out.println(soma + " + " + numero);
			soma += numero;
			System.out.println(" = " + soma);
			if(numero == 0) {
				System.out.println("Programa encerrado, o calculo final está abaixo: \n");
			}
		} while(numero != 0);
		
		System.out.println("Soma final é: " + soma);
		
		entrada.close();
	}

}
