package br.com.generation.expoo1;

public class Exercicio06 {

	public static void main(String[] args) {
		/* 6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console. */
		
		ContaEx06 conta = new ContaEx06();
		
		conta.setTitular("Lucas");
		conta.setSaldo(5.0);
		conta.setBanco("Ita�");
		
		conta.abrirConta();
		

	}

}
