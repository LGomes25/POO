package br.com.serratec;

public class Gerente extends Funcionario{

	private String nivel;
	
	//Construtor
	public Gerente(String cpf, String nome, Double salario, String nivel) {
		super(cpf, nome, salario);
		this.nivel = nivel;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "Nivel: " + nivel;
	}
	
	@Override
	public void reajusteSalarial(Double valor) {
		salario += salario*valor/100;
	}

	//Getters
	public String getNivel() {
		return nivel;
	}
	
	
	
}
