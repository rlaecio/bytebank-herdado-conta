package br.com.bytebank.banco.modelo;


/**
 * 
 * @author roquelaecio
 *
 */

public class CalculadorDeImposto {
	
	
	private double totalImposto;
	
	/**
	 * 
	 * @param t
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImporto();
		this.totalImposto += valor;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getTotalImposto() {
		return totalImposto;
	}
	

}
