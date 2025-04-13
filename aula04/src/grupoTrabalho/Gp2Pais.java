package grupoTrabalho;

public class Gp2Pais {

	//Atributos
	private String nome;

	//Construtor
	public Gp2Pais(String nome) {
		super();
		this.nome = nome;
	}

	//toString
	@Override
	public String toString() {
		return "Pais [nome=" + nome + "]";
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
