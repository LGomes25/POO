package slideAula05;

public class Slide130Ex1PessoaFisica extends Slide130Ex1ImpostoDeRenda{

	private String cpf;
	private String rg;
	
	//Construtor
	public Slide130Ex1PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Metodos
	public double impostoRenda(Double rendimentos) {
			return imposto = rendimentos*0.12;
	}
	
	public String impostoPagar() {
		return "Pessoa Fisica: "+super.nome+" CPF: "+cpf+" RG: "+rg
				+"Rendimentos: R$"+super.rendimentos+"Valor Imposto: R$"
				+impostoRenda(rendimentos);
	}
}