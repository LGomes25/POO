package slideAula09;

public enum Slide221Ex1Categoria {

	// Constantes
	ELETRONICO("Eletronico"), ALIMENTO("Alimento"), AUTOMOTIVO("Automotivo"), ROUPAS("Roupas"),
	FARMACEUTICO("Farmaceutico");

	// Atributos
	String categoria;

	// Contrutor
	private Slide221Ex1Categoria(String categoria) {
		this.categoria = categoria;
	}

	//Getters
	public String getCategoria() {
		return categoria;
	}

}
