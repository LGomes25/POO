package br.com.serratec;

public class Assistente extends Funcionario{

	
	protected Double adicional;

	public Assistente(String cpf, String nome, Double salario, Double adicional) {
		super(cpf, nome, salario);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return super.toString() + "Adicional: " + adicional;
	}
	
	@Override
	public void reajusteSalarial(Double valor) {
		salario += salario*valor/100 + adicional; 
	}

	public double getAdicional() {
		return adicional;
	}
	
	
	
}
