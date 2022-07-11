package br.com.generation.exerciciosforwhiledo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. */
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		int novatos = 0,ancioes = 0;
		
		while(i <= 5) {
			System.out.println("Escreva " + (i + 1) + "ª idade: "+"                [Para finalizar digite -99]"); 
			int idade = entrada.nextInt();	
			i++;
			if(idade < 21 && idade > 0) {
				novatos++;
			} else if(idade > 50 && idade < 200) {
				ancioes++;
			} if(i == 6) {
				System.out.println("Sistema finalizado, resultado abaixo: \n");
			} if(idade == -99) {
				System.out.println("Você finalizou o sistema, resultado abaixo: \n");
				break;
			}
		}
		
		System.out.println("Total de pessoa com menos de 21 anos é: " + novatos);
		System.out.println("Total de pessoas com mais de 50 anos é: " + ancioes);
		
		entrada.close();

	}

}
