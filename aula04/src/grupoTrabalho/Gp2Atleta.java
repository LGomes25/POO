package grupoTrabalho;

public class Gp2Atleta implements Gp2Olimpiadas {

	//Atributos
	private String nome;
	private Double peso;
	private String modalidade;
	private Gp2Pais pais;
	protected static int totalParticipante;
	
	public Gp2Atleta(String nome, Double peso, Gp2Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso>90.) {
			totalParticipante++;
			return "Paticipará";
		}else if (peso>=60) {
			totalParticipante++;
			return "Paticipará";
		}
		return "Não Participará!!!";
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public Gp2Pais getPais() {
		return pais;
	}

	public static Integer getTotalParticipante() {
		return totalParticipante;
	}




	

	
	
}
