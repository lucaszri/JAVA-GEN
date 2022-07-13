package br.com.generation.expoo1;

public class Exercicio01 {

	public static void main(String[] args) {
		/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
		
		MetodoExercicio01 cliente1 = new MetodoExercicio01();
		
		cliente1.setNome("Lucas");
		cliente1.setIdade(20);
		cliente1.setTelefone("(11)9-9191-9191");
		
		System.out.println("Nome do cliente: " + cliente1.getNome());
		System.out.println("Idade do cliente: " + cliente1.getIdade());
		System.out.println("Telefone do cliente: " + cliente1.getTelefone());
		
		cliente1.comprar();

	}

}
