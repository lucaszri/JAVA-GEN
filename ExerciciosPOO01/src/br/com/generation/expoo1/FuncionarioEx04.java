package br.com.generation.expoo1;

public class FuncionarioEx04 {
	/* 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console. */ 

	//caracteristicas
	private String nome;
	private String cargo;
	private double salario;
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//modulos..a��es
	void trabalhar() {
		System.out.println("O funcion�rio " + nome + " est� trabalhando...");
	}
	
}
