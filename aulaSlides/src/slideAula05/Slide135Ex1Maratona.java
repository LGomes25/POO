package slideAula05;

public class Slide135Ex1Maratona {

	// Atributos
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;
	protected String situacao;

	// Construtor
	public Slide135Ex1Maratona(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	// toString
	public String toString() {
		return "Nome: " + nome + "\tIdade: " + idade + "\tAltura: " + altura;
	}

	// Metodo
	public String verificaStuacao() {
		return "";
	};

	// Getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

}
