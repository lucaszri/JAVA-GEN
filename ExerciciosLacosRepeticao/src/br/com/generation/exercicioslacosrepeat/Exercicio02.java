package br.com.generation.exercicioslacosrepeat;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, valor3, resultado;
		
		System.out.println("Digite o valor 1: ");
		valor1 = entrada.nextInt();
		System.out.println("Digite o valor 2: ");
		valor2 = entrada.nextInt();
		System.out.println("Digite o valor 3: ");
		valor3 = entrada.nextInt();
		
		
		if(valor2 < valor1) {
			resultado = valor1;
			valor1 = valor2; 
			valor2 = resultado;
		}
		
		else if(valor3 < valor1) {
			resultado = valor1;
			valor1 = valor3; 
			valor3 = resultado; 
		}
		else if(valor3 < valor2) {
			resultado = valor2;
			valor2 = valor3;
			valor3 = resultado;
		}
		System.out.println("a ordem crescente é " + valor1 +", "  + valor2 + ", " + valor3);
		entrada.close();	
		}
	}


