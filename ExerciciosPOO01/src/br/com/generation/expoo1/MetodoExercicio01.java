package br.com.generation.expoo1;

public class MetodoExercicio01 {
	
	/* Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */
	
	//caracteristicas - cliente
	private String nome;
	private int idade;
	private String telefone;
	
	//getters e setters
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//metodos..a��es
	void comprar() {
		System.out.println("Cliente est� comprando...");
	}
	
	
	
	
	

}
