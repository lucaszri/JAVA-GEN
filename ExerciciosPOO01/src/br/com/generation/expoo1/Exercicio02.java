package br.com.generation.expoo1;

public class Exercicio02 {

	public static void main(String[] args) {
		/* 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
		
		AviaoEx02 aviao = new AviaoEx02();
		
		aviao.setModelo("Boeing");
		aviao.setVelocidade(1051.0);
		aviao.setIdade(105);
		
		System.out.println("Modelo do avião é: " + aviao.getModelo());
		System.out.println("Velocidade do avião é: " + aviao.getVelocidade() + " km/h");
		System.out.println("Idade do avião é: " + aviao.getIdade());
		
		aviao.voar();

	}

}
