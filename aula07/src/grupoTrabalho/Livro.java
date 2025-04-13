package grupoTrabalho;

public class Livro {

	private String titulo;
	private String autor;
	private Double preco;

	//Construtor
	public Livro(String titulo, String autor, Double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	//toString
	@Override
	public String toString() {
		return "Título: " + titulo + "\tAutor: " + autor + "\tPreço: " + preco;
	}

	//Getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Double getPreco() {
		return preco;
	}
	
	
	
	
}
