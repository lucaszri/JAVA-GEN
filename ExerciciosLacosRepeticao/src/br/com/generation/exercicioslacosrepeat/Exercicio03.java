package br.com.generation.exercicioslacosrepeat;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* 
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Escreva sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 25) {
			System.out.println("Você é um adulto");
		} else if(idade >= 15 ) {
			System.out.println("Você é um juvenil");
		} else if(idade >= 10) {
			System.out.println("Você é Infantil");
		} else if(idade >= 0) {
			System.out.println("Bebezão");
		}
		
		entrada.close();

	}

}
