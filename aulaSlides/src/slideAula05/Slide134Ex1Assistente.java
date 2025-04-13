package slideAula05;

public class Slide134Ex1Assistente extends Slide134Ex1Funcionario{

	//Atributos
	private double adicional;
	
	//Construtor
	public Slide134Ex1Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}
	public double aumentoSalario() {
		return super.aumentoSalario()*adicional;
	}
}
