package br.com.serratec;

public abstract class RevImovel {
	
	//Atributos
	protected String local;
	protected Double valor;
	protected RevProprietario proprietario;
	
	//Construtor
	public RevImovel(String local, Double valor, RevProprietario proprietario) {
		this.local = local;
		this.valor = valor;
		this.proprietario = proprietario;
	}
	
	//toString
	@Override
	public String toString() {
		return "Local: " + local + "\tValor:" + valor + proprietario;
	}
	
	//Metodo
	public Double calcularItbi() {
		return valor *3.5/100;
		
	}
	
	//Getters
	public String getLocal() {
		return local;
	}

	public Double getValor() {
		return valor;
	}

	public RevProprietario getProprietario() {
		return proprietario;
	}
	
	
	
}



