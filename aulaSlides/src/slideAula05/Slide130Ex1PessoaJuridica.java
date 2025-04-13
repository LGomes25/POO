package slideAula05;

public class Slide130Ex1PessoaJuridica extends Slide130Ex1ImpostoDeRenda{
	
	private String cnpj;
	private String inscEstadual;
	
	//Construtor
	public Slide130Ex1PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	//Metodos
	public double impostoRenda(Double rendimentos) {
		return imposto = rendimentos*0.15;
	}
	public String impostoPagar() {
		return "Pessoa Juridica: "+super.nome+" CNPJ: "+cnpj+" Insc.Estadual: "+inscEstadual
				+"Rendimentos: R$"+super.rendimentos+"Valor Imposto: R$"
				+impostoRenda(rendimentos);
	}
}