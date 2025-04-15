package grupoTrabalho;

public abstract class AnimalDeEstimacao implements Animal {

	// Atributos
	protected String nome;
	protected Integer idade;
	protected Boolean adotado;

	// Construtor
	public AnimalDeEstimacao(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
		this.adotado = false;
	}

	// toString
	@Override
	public String toString() {
		return "Nome: " + nome + ", idade: " + idade + ", Situação: " + (!adotado ? "Disponivel" : "Adotado");
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Boolean getAdotado() {
		return adotado;
	}

	public void setAdotado(Boolean adotado) {
		this.adotado = adotado;
	}

	// Metodo da interface
	@Override
	public void Imprimir() {
		// TODO Auto-generated method stub

	}

}
