package exemplos;

public class Construtor {

	private String nome;
	private double valor;
	private static int totalProdutos;
	
	//Construtor - deve ter sempre o mesmo nome da classe
	public Construtor(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		Construtor.totalProdutos +=1;
	}
	
	//Getters e Setters
	public static int getTotalProdutos() {
		return totalProdutos;
	}
	
	public void setTotalProdutos(int totalProdutos) {
		Construtor.totalProdutos = totalProdutos;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
