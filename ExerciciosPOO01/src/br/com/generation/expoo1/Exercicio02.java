package br.com.generation.expoo1;

public class Exercicio02 {

	public static void main(String[] args) {
		/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */
		
		AviaoEx02 aviao = new AviaoEx02();
		
		aviao.setModelo("Boeing");
		aviao.setVelocidade(1051.0);
		aviao.setIdade(105);
		
		System.out.println("Modelo do avi�o �: " + aviao.getModelo());
		System.out.println("Velocidade do avi�o �: " + aviao.getVelocidade() + " km/h");
		System.out.println("Idade do avi�o �: " + aviao.getIdade());
		
		aviao.voar();

	}

}
