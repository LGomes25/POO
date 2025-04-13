package slideAula08;

public enum Bebidas {

	//Constantes
	REFRI(5.), AGUA(2.5), SUCO(6.);

	//Atributo
	private Double valorBebida;

	//Construtor
	private Bebidas(Double valorBebida) {
		this.valorBebida = valorBebida;
	}

	//Getters e Setters
	public Double getValorBebida() {
		return valorBebida;
	}

	public void setValorBebida(Double valorBebida) {
		this.valorBebida = valorBebida;
	}
	
	
	
	
	
	
	
	
}
