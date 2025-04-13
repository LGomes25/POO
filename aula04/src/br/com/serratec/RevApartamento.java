package br.com.serratec;

public class RevApartamento extends RevImovel{

	//Atributo
	private Integer andar;
	
	//Construtor
	public RevApartamento(String local, Double valor, RevProprietario proprietario, Integer andar) {
		super(local, valor, proprietario);
		this.andar = andar;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "Andar: " + andar;
	}
	
	//Getters
	public Integer getAndar() {
		return andar;
	}
	
	
	
}
