package grupoTrabalho;

public class Gp1Operacao implements Gp1Livraria {

	//Atributos
	private String tipo;
	private Double valorOperacao;
	private Gp1Livro livro;
	
	//Construtor
	public Gp1Operacao(String tipo, Gp1Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}
	
	//toString
	@Override
	public String toString() {
		return "Tipo: " + tipo + "\tValor: "+ valorOperacao + livro;
	}

	//Métodos Interface
	@Override
	public void emprestarLivro() {
		double x = 0.02 *livro.getValor() + taxaEmprestimo;
		valorOperacao = Math.round(x*1000.0)/1000.0;
	}

	@Override
	public void venderLivro() {
		double x = 0.09 * livro.getValor() + livro.getValor();
		valorOperacao = Math.round(x*1000.0)/1000.0;
	}
	
	//Getters e Setters
	public Gp1Livro getLivro() {
		return livro;
	}

	public void setLivro(Gp1Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	
	
	
	
}
