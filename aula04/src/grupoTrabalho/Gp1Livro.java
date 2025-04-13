package grupoTrabalho;

public class Gp1Livro {

	//Atributos
	private String autor;
	private String titulo;
	private double valor;
	
	//Construtor
	public Gp1Livro(String autor, String titulo, double valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	//toString
	@Override
	public String toString() {
		return "\tAutor:" + autor + "\tTitulo=" + titulo;
	}
	
	//Método
	public void reajuste (double taxaReajuste) {
		valor += valor * taxaReajuste;
	}

	//Getters
	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}
	
	
	
	
	
	
	
}
