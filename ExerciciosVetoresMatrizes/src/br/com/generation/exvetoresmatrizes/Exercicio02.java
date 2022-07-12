package br.com.generation.exvetoresmatrizes;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o. */ 
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
			 System.out.print((i + 1) + "� Arremesso: " + dadosTent[i] + "\n");
			 soma += dadosTent[i];
			 media = soma / dadosTent.length;
			 if(dadosTent[i] == maiorPon) {
				 contadorMaiorPont++;
			 }
		}
		 System.out.println("Soma: " + soma + " , e a Media: " + media);
		 System.out.println("Maior pontua��o apareceu: " + contadorMaiorPont + " vezes");
	}

}
