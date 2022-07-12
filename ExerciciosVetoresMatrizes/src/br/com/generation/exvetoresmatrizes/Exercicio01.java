package br.com.generation.exvetoresmatrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maiorPont = 0;
		
		System.out.println("Digite um valor: ");
		
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();
			if (vetor[i] > maiorPont) {
				maiorPont = vetor[i];
			}
			System.out.print("");
		}
		
		System.out.println("O maior valor digitado foi: " + maiorPont);
		entrada.close();
	}

}
