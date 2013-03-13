package com.example.opcao;

/**
 * 
 * @author leonardocosta
 * @date 14/02/2013
 *
 */
public class Baladas {
	
	private String nome;
	private String endereco;
	private int fotoBalada;
	
	public Baladas(String nome, String endereco, int fotoBalada){
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.fotoBalada = fotoBalada;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the fotoBalada
	 */
	public int getFotoBalada() {
		return fotoBalada;
	}

	/**
	 * @param fotoBalada the fotoBalada to set
	 */
	public void setFotoBalada(int fotoBalada) {
		this.fotoBalada = fotoBalada;
	}
	
	

}
