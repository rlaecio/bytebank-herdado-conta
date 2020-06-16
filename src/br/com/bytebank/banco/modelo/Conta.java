package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

    protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * 
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é : " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta: " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	/**
	 * 
	 * 
	 * @param valor
	 * @throws SaldoException
	 */	
	public void saca(double valor) throws SaldoException {
		if (this.saldo < valor) {
			throw new SaldoException("Saldo: "+this.saldo+ ", Valor: "+ valor);		
		} else {
			this.saldo -= valor;
			
		}
	}

	
	/**
	 * Gerencia a transferencia bancaria, lançando SaldoException em caso de erro
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoException
	 */
	public void transfere(double valor, Conta destino) throws SaldoException {
		this.saca(valor);		
			destino.deposita(valor);		
	}
	

	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	
	
	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	

	/**
	 * 
	 * @return
	 */
	public int getAgencia() {
		return this.agencia;
	}

	
	/**
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	/**
	 * 
	 * @param titular
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * 
	 * @return
	 */
	public Cliente getTitular() {
		return this.titular;
	}

	/**
	 * 
	 * @return
	 */
	public static int getTotal() {
		return Conta.total;
	}
	
	
	/**
	 * 
	 *  @return
	 */
	public String toString() {	
		return  "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
	
	/**
	 * verifica a igualdade entre parametros das contas
	 */
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}

}