package br.com.generation.exvetoresmatrizes;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal. */ 
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal;
		
		System.out.println("Digite os valores: ");
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				matriz[l][c] = entrada.nextInt();
				soma += matriz[l][c];
			}
		}
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println();
		}
		
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma é: " + soma);
		System.out.println("A soma da diagonal é: " + somaDiagonal);
		
		entrada.close();

	}

}
