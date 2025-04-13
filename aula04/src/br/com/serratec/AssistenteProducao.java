package br.com.serratec;

public class AssistenteProducao extends Assistente {

	private Integer meta;
	
	//Construtor
	public AssistenteProducao(String cpf, String nome, Double salario, Double adicional, Integer meta) {
		super(cpf, nome, salario, adicional);
		this.meta = meta;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+ "Meta: " + meta;
	}
	
	//Getters
	public Integer getMeta() {
		return meta;
	}
	
	
	
}
