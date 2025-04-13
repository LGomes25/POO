package org.serratec;

public class TecnicoConcomitante extends ColegioAplicacao {

	private String nomeCurso;

	// Construtor
	public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	// metodo heranca
	@Override
	public void reuniaoDePais() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub
		super.fazerMatricula();
	}

	// Getters
	public String getNomeCurso() {
		return nomeCurso;
	}

}
