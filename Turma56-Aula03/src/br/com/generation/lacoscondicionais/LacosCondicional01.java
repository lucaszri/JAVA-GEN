package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class LacosCondicional01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite as primeira nota: ");
		nota1 = entrada.nextDouble();

		System.out.println("Digite as segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Sua media � " + media);
		
		//se --------> if
		// senao --->  else
		// senao se -> else if
			
	if(media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
		} else if(media > 10) {
			System.out.println("Voc� digitou a nota errada, fa�a novamente.");
		}
		else if(media >= 5) {
			System.out.println("Est� de recupera��o");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();

	}

}
