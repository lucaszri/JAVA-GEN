package br.com.generation.aula02;
import java.util.Scanner;

public class GalaoLitro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite o n�mero de gal�es: ");
		galoes = leia.nextInt();
		litros = galoes * 3.600;
		
		System.out.println((int)galoes + " galoes s�o: "  +  litros + " litros.");
		
		leia.close();
	}

}
