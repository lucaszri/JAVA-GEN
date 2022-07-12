package br.com.generation.exvetoresmatrizes;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */ 
		 Random numRandom = new Random();
		 int[] dadosTent = new int[10];
		 int soma = 0, media = 0, maiorPon = 0, contadorMaiorPont = 0;
		 
		 for(int i = 0; i < dadosTent.length; i++) {
			 dadosTent[i] = numRandom.nextInt(6) + 1;
			 if(dadosTent[i] > maiorPon) {
				 maiorPon = dadosTent[i];
			 }
		 }
	
		for(int i = 0; i < dadosTent.length; i++) {
			 System.out.print((i + 1) + "º Arremesso: " + dadosTent[i] + "\n");
			 soma += dadosTent[i];
			 media = soma / dadosTent.length;
			 if(dadosTent[i] == maiorPon) {
				 contadorMaiorPont++;
			 }
		}
		 System.out.println("Soma: " + soma + " , e a Media: " + media);
		 System.out.println("Maior pontuação apareceu: " + contadorMaiorPont + " vezes");
	}

}
