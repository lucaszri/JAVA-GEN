package br.com.generation.expoo1;

public class Exercicio03 {

	public static void main(String[] args) {
		/* 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console. */
		
		EletronicoEx03 eletronico = new EletronicoEx03();
		
		eletronico.setTipo("Televis�o");
		eletronico.setMarca("LG");
		eletronico.setPreco(1000.0);
		
		eletronico.ligar();
		
		System.out.println();
		
		System.out.println("Tipo do eletr�nico: " + eletronico.getTipo());
		System.out.println("Marca do eletr�nico: " + eletronico.getMarca());
		System.out.println("Pre�o do eletr�nico: " + eletronico.getPreco());
		
	}

}
