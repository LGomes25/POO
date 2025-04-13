package org.serratec.exemplo;

public class TV {

	private String modelo;
	private Marca marca;

	// Constritor
	public TV(String modelo, Marca marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	// toString
	@Override
	public String toString() {
		return "TV [modelo=" + modelo + ", marca=" + marca + "]";
	}

	// Getters
	public String getModelo() {
		return modelo;
	}

	public Marca getMarca() {
		return marca;
	}

}
