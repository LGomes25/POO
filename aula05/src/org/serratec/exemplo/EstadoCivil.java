package org.serratec.exemplo;

public enum EstadoCivil {

	// Constantes de ENUM
	CASADO('C'), VIUVO('V'), SOLTEIRO('S'), DIVORCIADO('D');

	// Atributos (para organizar o valor que está dentro dos parenteses)
	private char sigla;

	// Costrutor
	private EstadoCivil(char sigla) {
		this.sigla = sigla;
	}

	// Getters
	public char getSigla() {
		return sigla;
	}

}
