package org.serratec.exemplos;

public class Generico<T> {//<T> - tipo type

	private T valor;
	
	//Construtor
	public Generico(T valor) {
	this.valor = valor;
	}

	//Getters Setters
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
	
}
