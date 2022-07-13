package br.com.generation.expoo1;

public class Exercicio07 {

	public static void main(String[] args) {
		/* 7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */ 
		
		PacienteEx07 paciente = new PacienteEx07();
		
		paciente.setNome("Lucas");
		paciente.setIdade(35);
		paciente.setEnfermidade("Dor de cabeça");
		
		paciente.ficha();

	}

}
