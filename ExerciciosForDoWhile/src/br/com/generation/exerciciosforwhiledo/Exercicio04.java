package br.com.generation.exerciciosforwhiledo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)

 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */
		
		
		Scanner entrada = new Scanner(System.in);
		
		int sexo, person;
		int pCalma = 0, mNervosa = 0, hAgressivo = 0, oCalmos = 0, nMais40 = 0, cMenos18 = 0;
		int i = 0, idade = 0;
		
		while(i <= 3) {
			System.out.println("Digite seu genêro: 1 - Feminino | 2 - Masculino | 3 - Outros");
			sexo = entrada.nextInt();
			System.out.println("Você é uma pessoa: 1 - Calma | 2 - Nervosa | 3 - Agressiva");
			person = entrada.nextInt();
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			i++;
			if(person == 1) {
				pCalma++;
			} if(sexo == 1 && person == 2) {
				mNervosa++;
			} if(sexo == 2 && person == 3) {
				hAgressivo++;
			} if(sexo == 3 && person == 1) {
				oCalmos++;
			} if(person == 2 && idade > 40) {
				nMais40++;
			} if(person == 1 && idade < 18) {
				cMenos18++;
			}
		}
		
		System.out.println("O número total de pessoas calmas é: " + pCalma);
		System.out.println("O número de mulheres nervosas é: " + mNervosa);
		System.out.println("O número de homens agressivos é: " + hAgressivo);
		System.out.println("O número de outros calmos é: " + oCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nMais40);
		System.out.println("o número de pessoas calmas com menos de 18 anos é: " + cMenos18);
	
		entrada.close();
	}

}
