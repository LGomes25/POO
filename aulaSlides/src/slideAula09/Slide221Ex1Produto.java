package slideAula09;


public class Slide221Ex1Produto {

	//Atributos
	private int codigo;
	private String descricao;
	private Double valor;
	private Slide221Ex1Categoria categoria;

	//Construtor
	public Slide221Ex1Produto(int codigo, String descricao, Double valor, Slide221Ex1Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\tDescricao: " + descricao 
				+ "    \tValor: " + valor + "\tCategoria: "+ categoria;
	}

	//Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public Slide221Ex1Categoria getCategoria() {
		return categoria;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setCategoria(Slide221Ex1Categoria categoria) {
		this.categoria = categoria;
	}

	
	

	
	
	
	
	
}
