package slideAula05;

public class Slide134Ex1Gerente extends Slide134Ex1Funcionario{

	//Atributos
	private String setor;
	
	//Construtor
	public Slide134Ex1Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}
	public double aumentoSalario() {
		return super.aumentoSalario()+200.;
	}
	public String toString() {
		return super.toString()+ "\tSetor: "+ setor;
	}
}
