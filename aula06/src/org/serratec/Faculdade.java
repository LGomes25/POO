package org.serratec;

public abstract class Faculdade extends Universidade {

	protected String nome;
	protected int bloco;
	
	//Construtor	
	public Faculdade(String nome, String nome2, int bloco) {
		super(nome);
		nome = nome2;
		this.bloco = bloco;
	}

	//toString
	@Override
	public String toString() {
		return "Faculdade [nome=" + nome + ", bloco=" + bloco + "]";
	}

	//Heranca - metodo
	@Override
	public abstract void fazerMatricula();

	//metodo abstrato
	public abstract String matrizCurricular();

	//Getters
	public String getNome() {
		return nome;
	}

	public int getBloco() {
		return bloco;
	}
	
	
	
}
