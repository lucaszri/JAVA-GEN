package br.com.generation.exerciciosforwhiledo;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

		for(int i = 1; i <=11; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " Esse n�mero � par");
			} else {
				System.out.println(i + " Esse n�mero � �mpar");
			}
		}
	}

}
