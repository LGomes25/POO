package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Time {

	//Atributos
	private String nome;
	private List<Atleta> atletas;
	
	//Construtor
	public Time(String nome) {
		this.nome = nome;
		atletas = new ArrayList<>();
	}

	//toString
	@Override
	public String toString() {
		return "Time "+ nome;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	//Metodo para adicionar
	public void adicionarAtleta(Atleta... atletas) {
		//atletas.add(atleta);
		this.atletas.addAll(Arrays.asList(atletas));
	}
	
	
}
