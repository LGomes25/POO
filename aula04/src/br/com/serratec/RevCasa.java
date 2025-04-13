package br.com.serratec;

public class RevCasa extends RevImovel {

	//Atributos
	private Boolean garagem;
	
	//Construtor
	public RevCasa(String local, Double valor, RevProprietario proprietario, Boolean garagem) {
		super(local, valor, proprietario);
		this.garagem = garagem;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+ "\tTem Garagem: " + (garagem ? "Sim" : "Não") ;
	}
	
	//Getters
	public Boolean getGaragem() {
		return garagem;
	}
	
	
	
}
