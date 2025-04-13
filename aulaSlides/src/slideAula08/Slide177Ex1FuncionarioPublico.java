package slideAula08;

public class Slide177Ex1FuncionarioPublico {

	private String nome;
	private Double salario;
	private final int anoConcurso;

	// Construtor
	public Slide177Ex1FuncionarioPublico(String nome, Double salario, int anoConcurso) {
		this.nome = nome;
		this.salario = salario;
		this.anoConcurso = anoConcurso;
	}

	// toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\tSalario: " + salario + "\tAno Concurso: " + anoConcurso;
	}

}
