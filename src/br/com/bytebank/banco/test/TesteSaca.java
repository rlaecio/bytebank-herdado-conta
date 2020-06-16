package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoException;

/**
 * 
 * @author roquelaecio
 *
 */

public class TesteSaca {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Conta  conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(200.0);
		} catch (SaldoException ex) {
			System.out.println(ex.getMessage());

		}
		
		System.out.println(conta.getSaldo());

	}

}
