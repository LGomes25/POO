package org.serratec.exemplo;

//Classe quando é final, não tem "filhos"
public class Policial {

	protected String nome;
	//protected final String LOTACAO = "Brasília"; // atributos quando tem final é uma constante
	protected final String LOTACAO; // vai receber o valor quando for instanciado pelo construtor
	
	public Policial(String nome, String lOTACAO) {
		super();
		this.nome = nome;
		LOTACAO = lOTACAO;
	}

	public final void imprimir() {//método com final não pode ser sobrescrito
		System.out.println("Dados do Policia");
	}

	public String getLOTACAO() {//Não permite a criação do Set LOTACAO
		return LOTACAO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
