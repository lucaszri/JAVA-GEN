package br.com.generation.expoo1;

public class AviaoEx02 {

	/* 2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */
	
	//caracteristicas
	private String modelo;
	private double velocidade;
	private int idade;
	
	//setters e getters 
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo, ação
	void voar() {
		System.out.println("Avião voando...");
	}
	
	
}
