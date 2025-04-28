package friburgoExtras;

public class Alimento extends Produto {

	private int quantidadePorItem;
	private String unidadeMedida;
	
	//Construtor
	public Alimento(String nome, Double preco, int estoque, int quantidadePorItem, String unidadeMedida) {
		super(nome, preco, estoque);
		this.quantidadePorItem = quantidadePorItem;
		this.unidadeMedida = unidadeMedida;
	}

	//toString
	@Override
	public String toString() {
		return "Quantidade Por Item: " + quantidadePorItem + "\tUnidade de Medida: " + unidadeMedida;
	}

	//metodo herança
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: "+ nome + "\tQtd por Item: "+ quantidadePorItem + "\tEstoque: "+estoque+"\tPreço: "+preco);
	}

	//Getters
	public int getQuantidadePorItem() {
		return quantidadePorItem;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	
	
	
}
