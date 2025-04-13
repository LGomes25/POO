package slideAula08;

public enum Slide195Ex1Sanduiches {

	// Constantes
	MIXTO("Mixto", 10.), XBURGUER("Xburguer", 15.), MATAFOME("Mata Fome", 25.);

	// Atributos
	private String tipo;
	private Double valorSanduiche;

	// Construtor
	private Slide195Ex1Sanduiches(String tipo, Double valorSanduiche) {
		this.tipo = tipo;
		this.valorSanduiche = valorSanduiche;
	}

	public Double getValorSanduiche() {
		return valorSanduiche;
	}

	public String getTipo() {
		return tipo;
	}

}
