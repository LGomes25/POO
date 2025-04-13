package br.com.serratec;

public class RevProprietario {
	
	//Atributo
	private String nome;
	
	//Construtor
	public RevProprietario(String nome) {
		this.nome = nome;
	}
	
	//toString
	@Override
	public String toString() {
		return "\tNome: " + nome;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
}
