package br.com.serratec.heranca;

public class Gerente extends Empregado{

	private Integer numEmpregadoGerenciado;
	
	//Construtor de Gerente
	public Gerente(String nome, String email, String telefone, Double salario, Integer numEmpregadoGerenciado) {
		super(nome, email, telefone,salario);
		this.numEmpregadoGerenciado = numEmpregadoGerenciado;
	}
	//Getter de Gerente
	public Integer getNumEmpregadoGerenciado() {
		return numEmpregadoGerenciado;
	}
	
	@Override
	public Double aumentarSalario(Double valor) {
		return salario = super.aumentarSalario(valor) + 1000.;
	}
	
	@Override
	public String toString() {
		return super.toString()+" n° de empregados: "+numEmpregadoGerenciado;
	}
	
}
