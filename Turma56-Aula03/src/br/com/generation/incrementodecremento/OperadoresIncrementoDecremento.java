package br.com.generation.incrementodecremento;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		
		int a = 1;
		
	System.out.println(a++); //primeiro impre a depois ++
	// se colasse ++a incrementa, dps impreme, pela ordem
	System.out.println(a);
	
	// ++ -> incremento +1
	// -- -> decremento -1
	
	int b = 1;
	System.out.println(b--);
	System.out.println(b);

	}

}
