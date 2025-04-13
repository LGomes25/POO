package grupoTrabalho;

public class Proprietario {

	private String nome;

	// Construtor
	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	// toString
	@Override
	public String toString() {
		return "Nome " + nome;
	}

	// Getters
	public String getNome() {
		return nome;
	}

}
