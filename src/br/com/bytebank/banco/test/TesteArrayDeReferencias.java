package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		/** modelo - in[] idades = new int[5]; */		
		Object [] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		
		ContaCorrente cc1 = new ContaCorrente(22, 21);
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(22, 34);
		referencias[1] = cp2;
				
		Object referenciaGenerica = referencias[1];
		ContaPoupanca ref2 = (ContaPoupanca) referencias[1]; //type cast
						
		System.out.println(cp2.getNumero());		
		System.out.println(ref2.getNumero());
		
	}
}
