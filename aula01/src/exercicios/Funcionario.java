package exercicios;

public class Funcionario {
	private String nome;
	private double salario;
	//Quando a variavel estiver static, ela Pertence a classe
	private static int cont = 0;//variavel de classe
		
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		cont++;
	}

	public String getNome() {
		return nome;
	}


	public double getSalario() {
		return salario;
	}
	
	public static int getCont() {
		return cont;
	}
		
}