package slideAula08;

public enum Sanduiches {

	//Constantes
	MIXTO(10.), XBURGUER(15.), MATAFOME(25.);
	
	//Atributos
	private Double valorSanduiche;

	//Construtor
	private Sanduiches(Double valorSanduiche) {
		this.valorSanduiche = valorSanduiche;
	}

	public Double getValorSanduiche() {
		return valorSanduiche;
	}

	public void setValorSanduiche(Double valorSanduiche) {
		this.valorSanduiche = valorSanduiche;
	}
	
	
	
	
	
}
