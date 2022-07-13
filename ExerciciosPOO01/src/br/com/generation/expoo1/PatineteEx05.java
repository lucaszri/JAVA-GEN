package br.com.generation.expoo1;

public class PatineteEx05 {
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	//caracteristicas...atributos
	private int velocidade;
	private int curva;
	private int freio;
	
	//getters and setters
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getCurva() {
		return curva;
	}
	public void setCurva(int curva) {
		this.curva = curva;
	}
	public int getFreio() {
		return freio;
	}
	public void setFreio(int freio) {
		this.freio = freio;
	}
	
	//metodos..ações
	void tirarCarta() {
		System.out.println("Os atributos da sua carta são: ");
	}
	
	

}
