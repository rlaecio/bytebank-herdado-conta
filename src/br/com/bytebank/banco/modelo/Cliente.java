package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * @author Roque  Laecio
 * 
 */
public class Cliente implements Serializable {

	private String nome;
	private String cpf;
	private String profissao;

	
	 
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * 
	 * @param profissao
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}