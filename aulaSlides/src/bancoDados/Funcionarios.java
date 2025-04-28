package bancoDados;

public class Funcionarios {

	private Integer id;
	private String nome;
	private String profissao;
	private Double salario;
	
	//Construtor
	public Funcionarios(Integer id, String nome, String profissao, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	
	//Getters
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public Double getSalario() {
		return salario;
	}
	
	
	
	
}
