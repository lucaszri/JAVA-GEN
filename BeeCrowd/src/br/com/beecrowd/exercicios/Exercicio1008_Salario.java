package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1008_Salario {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numFuncionario;
		int horasTrab;
		double salHora;
		
		System.out.println("Informe seu n�mero de funcion�rio: ");
		numFuncionario = leia.nextInt();

		System.out.println("Informe seu n�mero de horas trabalhadas: ");
		horasTrab = leia.nextInt();

		System.out.println("Informe qual seu sal�rio por hora trabalhada: ");
		salHora = leia.nextFloat();
		
		double salario = salHora * horasTrab;
		
		System.out.println("Number: " + numFuncionario);
		System.out.printf("Salary: " + "%.2f", salario);
		
		leia.close();
	}

}
