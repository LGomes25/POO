package org.serratec;

public abstract class Universidade {

	protected String nome;

	// Construtor
	public Universidade(String nome) {
		this.nome = nome;
	}

	// toString
	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	// Método - abstrato
	public abstract void fazerMatricula();

	// Getters
	public String getNome() {
		return nome;
	}

}
