package grupoTrabalho;

public class Cliente {

	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;

	// Contrutor
	public Cliente(Integer id, String nome, Integer idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	// toString
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}

	// Getters
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getTelefone() {
		return telefone;
	}

}
