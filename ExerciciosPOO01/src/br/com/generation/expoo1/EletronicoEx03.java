package br.com.generation.expoo1;

public class EletronicoEx03 {
	/* 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console. */

	//caracteristicas
	private String marca;
	private String tipo;
	private double preco;
	
	//getters and setters 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//modulo, a��o
	void ligar() {
		System.out.println("ligou o(a) " + tipo);
	}

	
	
	
	
}
