package org.serratec;

public final class Direito extends Faculdade implements Oab, Eventos {

	private int tempoDuracao;
	
	//Construtor	
	public Direito(String nome, String nome2, int bloco, int tempoDuracao) {
		super(nome, nome2, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	//toString	
	@Override
	public String toString() {
		return "TempoDuracao: " + tempoDuracao;
	}

	//Metodos de heranca e de Interfaces
	@Override
	public String programacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean realizarProva() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	//Getters e Setters
	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	
	
	
	
}
