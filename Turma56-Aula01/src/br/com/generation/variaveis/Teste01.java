package br.com.generation.variaveis;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int y = 1;
		int x;
		
		
		
		System.out.println("D� um valor para x: ");
		x = leia.nextInt();
		
		
		System.out.println("Voc� declarou que x �: " + x);
		
		int res = x + y;
		
		System.out.println("x + y �: " + res);
		System.out.println("y �: " + y);
		
		
		
		
		

	}

}
