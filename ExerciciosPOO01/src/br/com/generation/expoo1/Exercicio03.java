package br.com.generation.expoo1;

public class Exercicio03 {

	public static void main(String[] args) {
		/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console. */
		
		EletronicoEx03 eletronico = new EletronicoEx03();
		
		eletronico.setTipo("Televisão");
		eletronico.setMarca("LG");
		eletronico.setPreco(1000.0);
		
		eletronico.ligar();
		
		System.out.println();
		
		System.out.println("Tipo do eletrônico: " + eletronico.getTipo());
		System.out.println("Marca do eletrônico: " + eletronico.getMarca());
		System.out.println("Preço do eletrônico: " + eletronico.getPreco());
		
	}

}
