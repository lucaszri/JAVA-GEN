package br.com.generation.exerciciosforwhiledo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */
		Scanner entrada = new Scanner(System.in);
		
		int numero, contador3 = 0;
		double media = 0;
		
		do {
			System.out.println("Digite um número:             [Digite 0 para finalizar]");
			numero = entrada.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				contador3++;
				media = media + numero;
			} if (numero == 0) {
				break;
			}
			
		} while (numero != 0);
		
		System.out.println("A média dos números múltiplos de 3 é: " + media / contador3);
		entrada.close();
	}

}
