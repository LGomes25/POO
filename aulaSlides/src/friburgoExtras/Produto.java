package friburgoExtras;

public abstract class Produto {

	protected String nome;
	protected Double preco;
	protected int estoque;
	protected Boolean verifica;

	//Construtor
	public Produto(String nome, Double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		verifica = false;
	}

	//toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\tPreco: " + preco + "\tEstoque: " + estoque;
	}

	//Metodo abstrato
	public abstract void exibirInformacoes();
	
	//Metodo booleano - Verificar estoque
	public Boolean vender(int quantidade) {
		if (quantidade <= estoque) {
			verifica = true;
		}else {
			verifica = false;
		}
		return verifica;
	}
	
	//Getters Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Boolean getVerifica() {
		return verifica;
	}
	
}
