package org.serratec.exercicios;

public class Atleta {

	//Atributo
	private String nome;
	private Double altura;

	//Construtor
	public Atleta(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	//toString
	@Override
	public String toString() {
		return "Atleta: " + nome + "\tAltura: " + altura;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public Double getAltura() {
		return altura;
	}
	
	
	
	
}
