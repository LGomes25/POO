package grupoTrabalho;

public enum TipoServico {

	// Constantes
	OLEO(100.), LAVAGEM(50.), REVISAO(200.);

	// Atributos
	private Double valorPorServico;

	// Construtor
	private TipoServico(Double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	// Getters
	public Double getValorPorServico() {
		return valorPorServico;
	}

}
