package br.com.generation.expoo1;

public class Exercicio04 {

	public static void main(String[] args) {
		/* 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console. */ 
		
		FuncionarioEx04 funcionario = new FuncionarioEx04();
		
		funcionario.setNome("Lucas");
		funcionario.setCargo("Desenvolvedor Web");
		funcionario.setSalario(5000.0);
		
		funcionario.trabalhar();
		System.out.println();
		
		System.out.println("Nome do funcionario é: " + funcionario.getNome());
		System.out.println("Cargo do funcionario é: " + funcionario.getCargo());
		System.out.println("Salário do funcionario é: R$ " + funcionario.getSalario());

	}

}
