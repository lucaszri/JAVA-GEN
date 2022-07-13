package br.com.generation.expoo1;

public class ContaEx06 {
	
	/* 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console. */
	
	//caracteristicas;
	private String titular;
	private double saldo;
	private String banco;
	
	//getters and setters;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	void abrirConta() {
		System.out.println("Dados do Usuário: ");
		System.out.println();
		System.out.println("Nome do titular: " + titular);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("Banco: " + banco);
	}
	
	

}
