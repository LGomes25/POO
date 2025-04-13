package org.serratec;

public final class EnsinoMedio extends ColegioAplicacao {

	private int numeroAlunos;
	
	//Construtor	
	public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}

	@Override
	public void fazerMatricula() {
		
		super.fazerMatricula();
	}


	@Override
	public void reuniaoDePais() {
		// TODO Auto-generated method stub

	}

	//Getters
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	

}
