package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;


/**
 * 
 * @author roquelaecio
 *
 */
public class ContaEspecial extends Conta {
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void deposita(double valor) {
		super.deposita(valor);
		super.saldo += valor;
	}

}
