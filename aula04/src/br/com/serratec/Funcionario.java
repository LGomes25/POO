package br.com.serratec;

public abstract class Funcionario {

	//Atributos
	protected String cpf;
	protected String nome;
	protected Double salario;
	
	//Construtor
	public Funcionario(String cpf, String nome, Double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	//toString
	@Override
	public String toString() {
		return "CPF: " + cpf + ", Nome: " + nome + ", Salario: " + salario;
	}
	//Assinatura de método na qual os filhos terão que implementar
	public abstract void reajusteSalarial(Double valor);
	
	
	//Getters
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	
	
	
}
