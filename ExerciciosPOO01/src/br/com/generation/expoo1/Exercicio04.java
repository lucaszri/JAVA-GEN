package br.com.generation.expoo1;

public class Exercicio04 {

	public static void main(String[] args) {
		/* 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console. */ 
		
		FuncionarioEx04 funcionario = new FuncionarioEx04();
		
		funcionario.setNome("Lucas");
		funcionario.setCargo("Desenvolvedor Web");
		funcionario.setSalario(5000.0);
		
		funcionario.trabalhar();
		System.out.println();
		
		System.out.println("Nome do funcionario �: " + funcionario.getNome());
		System.out.println("Cargo do funcionario �: " + funcionario.getCargo());
		System.out.println("Sal�rio do funcionario �: R$ " + funcionario.getSalario());

	}

}
