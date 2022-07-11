package br.com.beecrowd.exercicios;

public class Exercicio3302_RCerta {

	public static void main(String[] args) {

		int N = 3;
		int vetor[] = new int[N];
		
		for(int i = 0; i <= 2; i++ ) {
			int x = 10;
			x = x * i;
			x += 10;
			vetor[i] = x;				
		} for(int i = 0; i <=2 ; i++) {
			
			System.out.println("Resposta " + (i + 1) + ": " + vetor[i]);
		}

	}

}
