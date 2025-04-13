package slideAula04;

public class Slide118Ex1Funcionario {

	private String nome;
	private double salario;
	private double inss;
	private double vale;
	
	//Construtor
	public Slide118Ex1Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//Metodos
	public double calcularInss () {
		//this.inss = salario*0.11;
		return inss = salario*0.11 ;
	}
	public double calcularValeTransporte() {
		return vale = salario*0.06;
	}
		
	//Getters e Setters
	public double getInss() {
		return inss;
	}

	public double getVale() {
		return vale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}