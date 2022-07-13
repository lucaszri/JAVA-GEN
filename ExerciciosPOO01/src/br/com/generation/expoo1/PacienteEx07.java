package br.com.generation.expoo1;

public class PacienteEx07 {
	
	/* 7) Crie uma classe paciente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */ 
	
	//caracteristicas
	private String nome;
	private int idade;
	private String enfermidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEnfermidade() {
		return enfermidade;
	}
	public void setEnfermidade(String enfermidade) {
		this.enfermidade = enfermidade;
	}
	
	void ficha() {
		System.out.println("Ficha do paciente: ");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Enfermidade: " + enfermidade);
	}
	

}
