package br.com.bytebank.banco.modelo;

/**
 * 
 * @author roquelaecio
 *
 */
public class ContaPoupanca extends Conta {
	
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {
		
		return  "Conta Poupanca " + super.toString();
	}

}
