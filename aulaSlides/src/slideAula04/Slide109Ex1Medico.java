package slideAula04;

public class Slide109Ex1Medico {
	private String crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	private static int totalMedicos;
	
	public Slide109Ex1Medico(String crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Slide109Ex1Medico.totalMedicos ++;
	}

	public double pagamentoDinheiro() {
		return salario = valorConsulta;
	}
	
	public double pagamentoPlano() {
		return salario = valorConsulta*0.7;
	}

	public static int getTotalMedicos() {
		return totalMedicos;
	}
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
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

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

}
