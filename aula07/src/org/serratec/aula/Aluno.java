package org.serratec.aula;

public class Aluno {

	private String nome;
	private Integer idade;
	private String email;
	
	//Construtor
	public Aluno(String nome, Integer idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	//toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\tIdade: " + idade + "\temail: " + email;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}
	
		
	
	
}
