package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o 1� n�mero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite a opera��o: ");
		char operacao = entrada.next().charAt(0);

		System.out.println("Escolha o 2� n�mero: ");
		int numero2 = entrada.nextInt();
		
		int resultado;
		
		switch(operacao) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println("A soma �: " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("A subtra��o �: " + resultado);
			break;
		case '*', 'x':
			resultado = numero1 * numero2;
			System.out.println("A multiplica��o �: " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("A divis�o �: " + resultado);
			break;
			default:
				System.out.println("Op��o inv�lida.");
		}
		
		entrada.close();

	}

}
