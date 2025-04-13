package slideAula04;

public class Slide119Ex2Produto {

	//Atributos
	private String descricao;
	private double valor;
	private int quantidade;
	private double icms;
	
	//Construtor
	public Slide119Ex2Produto(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	//Métodos
	public double calcularIcms() {
		this.icms=(valor*quantidade)*0.12;
		return icms;
	}
		
	//Getters e Setters
	public double getIcms() {
		calcularIcms();
		return icms;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
