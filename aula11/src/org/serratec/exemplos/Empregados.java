package org.serratec.exemplos;

public class Empregados {

	private Integer id;
	private String nome;
	private String profissao;
	private Double salario;
	
	//Construtor
	public Empregados(Integer id, String nome, String profissao, Double salario) {
		this.id=id;
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	
	//toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\tProfissao: " + profissao + "\tSalário: " + salario;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public Double getSalario() {
		return salario;
	}

	public Integer getId() {
		return id;
	}
	
	
	
}
