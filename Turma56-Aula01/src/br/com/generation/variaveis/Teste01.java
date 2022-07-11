package br.com.generation.variaveis;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int y = 1;
		int x;
		
		
		
		System.out.println("Dê um valor para x: ");
		x = leia.nextInt();
		
		
		System.out.println("Você declarou que x é: " + x);
		
		int res = x + y;
		
		System.out.println("x + y é: " + res);
		System.out.println("y é: " + y);
		
		
		
		
		

	}

}
