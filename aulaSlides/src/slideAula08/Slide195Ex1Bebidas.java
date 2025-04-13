package slideAula08;

public enum Slide195Ex1Bebidas {

	//Constantes
	REFRI("Refrigerante", 5.), AGUA("Água", 2.5), SUCO("Suco", 6.);

	//Atributo
	private String tipo;
	private Double valorBebida;

	//Construtor
	private Slide195Ex1Bebidas(String tipo, Double valorBebida) {
		this.tipo = tipo;
		this.valorBebida = valorBebida;
	}

	//Getters
	public Double getValorBebida() {
		return valorBebida;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
	
	
	
	
	
}
