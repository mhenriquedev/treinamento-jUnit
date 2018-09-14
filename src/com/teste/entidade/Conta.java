package com.teste.entidade;

public class Conta {

	private Pessoa pessoa;
	
	private String numAgencia;
	
	private String numConta;
	
	/**
	 * Tipos de conta: C = Conta corrente; P = Poupança
	 */
	private Character tipoConta;
	
	private Integer saldo;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Character getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(Character tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	
}