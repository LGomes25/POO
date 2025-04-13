package br.com.serratec;

public abstract class Auxiliar extends Funcionario {

	protected String categoria;
	
	//Contrutor
	public Auxiliar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}

	//toString
	@Override
	public String toString() {
		return super.toString()+ "Categoria: " + categoria;
	}

		
	//Getters
	public String getCategoria() {
		return categoria;
	}

}
