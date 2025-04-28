package org.serratec.entity;

public class Fornecedor {

	private String nome;
	private String cnpj;
	
	public Fornecedor(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", cnpj=" + cnpj + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
	
	
}
