package org.serratec;

public abstract class ColegioAplicacao extends Universidade {

	protected String nomeCoordenador;
	
	//Construtor	
	public ColegioAplicacao(String nome, String nomeCoordenador) {
		super(nome);
		this.nomeCoordenador = nomeCoordenador;
	}

	//metodo heranca
	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}
	
	//metodo abstrato
	public abstract void reuniaoDePais();

}
