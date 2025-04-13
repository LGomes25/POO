package slideAula05;

public class Slide134Ex1Funcionario {

	//Atributos
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	//Construtor
	public Slide134Ex1Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//Metodos
	public String toString() {
		return "Nome: "+ nome + "\tSalário: " + salario;
	}
	public double aumentoSalario() {
		return salario = salario + salario*0.02;
	}
	
}
