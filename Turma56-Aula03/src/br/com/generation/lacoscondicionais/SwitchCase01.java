package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o 1º número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite a operação: ");
		char operacao = entrada.next().charAt(0);

		System.out.println("Escolha o 2º número: ");
		int numero2 = entrada.nextInt();
		
		int resultado;
		
		switch(operacao) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println("A soma é: " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("A subtração é: " + resultado);
			break;
		case '*', 'x':
			resultado = numero1 * numero2;
			System.out.println("A multiplicação é: " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("A divisão é: " + resultado);
			break;
			default:
				System.out.println("Opção inválida.");
		}
		
		entrada.close();

	}

}
