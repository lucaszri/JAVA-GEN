package AppCalculoObra;

import java.util.Scanner;

public class CalculoObra {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		double altura, largura;
		double tijoloAltura = 0.11, tijoloLargura = 0.24, drywallAltura = 2.40, drywallLargura = 1.20;
		double tijoloNecAlt, tijoloNecLar, tijoloTotal, precoTijolo = 1.39;
		double dryNecAlt, dryNecLar, dryTotal, precoDry = 52.90;
		
		System.out.println("Digite a altura: ");
		altura = entrada.nextDouble();
		System.out.println("Digite a largura: ");
		largura = entrada.nextDouble();
		
		tijoloNecAlt = altura / tijoloAltura;
		tijoloNecLar = largura / tijoloLargura;
		tijoloTotal = tijoloNecAlt * tijoloNecLar;
		precoTijolo = precoTijolo * tijoloTotal;
		
		dryNecAlt = altura / drywallAltura;
		dryNecLar = largura / drywallLargura;
		dryTotal = dryNecAlt * dryNecLar;
		precoDry = precoDry * dryTotal;
		
		System.out.printf("Você vai precisar de "+ "%.2f", tijoloNecAlt);
		System.out.println(" tijolos para dar a altura necessária.");
		System.out.printf("Você vai precisar de "+ "%.2f", tijoloNecLar); 
		System.out.println(" tijolos para dar a largura necessária.");
		System.out.printf("Você vai precisar de " + "%.2f", tijoloTotal);
		System.out.println(" tijolos por parede");
		System.out.printf("O valor total será: R$ " + "%.2f", precoTijolo);
		
		System.out.printf("\n \n" + "Você vai precisar de "+ "%.2f", dryNecAlt);
		System.out.println(" peças de drywall para dar a altura necessária.");
		System.out.printf("Você vai precisar de "+ "%.2f", dryNecLar); 
		System.out.println(" peças de drywall para dar a largura necessária.");
		System.out.printf("Você vai precisar de " + "%.2f", dryTotal);
		System.out.println(" peças de drywall por parede");
		System.out.printf("O valor total será: R$ " + "%.2f", precoDry);
		
		entrada.close();
		
		
		
		
		
		
		

	}

}
