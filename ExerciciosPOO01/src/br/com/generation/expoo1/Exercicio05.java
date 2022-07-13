package br.com.generation.expoo1;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
		
		PatineteEx05 patinete = new PatineteEx05();
		
		patinete.setVelocidade(6);
		patinete.setCurva(8);
		patinete.setFreio(3);
		
		System.out.println("Sorteio do Super Trunfo de patinetes: \n");
		patinete.tirarCarta();
		
		System.out.println("Velocidade: " + patinete.getVelocidade());
		System.out.println("Curva: " + patinete.getCurva());
		System.out.println("Freio: " + patinete.getFreio());

	}

}
