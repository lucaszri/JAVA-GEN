package br.com.generation.aula02;
import java.util.Scanner;

public class GalaoLitro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite o número de galões: ");
		galoes = leia.nextInt();
		litros = galoes * 3.600;
		
		System.out.println((int)galoes + " galoes são: "  +  litros + " litros.");
		
		leia.close();
	}

}
