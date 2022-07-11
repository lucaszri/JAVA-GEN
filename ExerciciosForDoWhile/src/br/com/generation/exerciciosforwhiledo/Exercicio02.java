package br.com.generation.exerciciosforwhiledo;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

		for(int i = 1; i <=11; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " Esse número é par");
			} else {
				System.out.println(i + " Esse número é ímpar");
			}
		}
	}

}
