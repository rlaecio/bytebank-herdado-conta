package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * @author roquelaecio
 *
 */

public class ContaCorrente extends Conta implements Tributavel {
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoException {
		double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}

	@Override
	public double getValorImporto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		
		return  "Conta Corrente " + super.toString();
	}

}
