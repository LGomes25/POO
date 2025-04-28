package friburgoExtras;

public class Eletronico extends Produto {

	private String marca;
	private Integer mesesGarantia;

	//Construtor
	public Eletronico(String nome, Double preco, int estoque, String marca, Integer mesesGarantia) {
		super(nome, preco, estoque);
		this.marca = marca;
		this.mesesGarantia = mesesGarantia;
	}
	
	//toString
	@Override
	public String toString() {
		return "\tMarca: " + marca + "\tMeses de Garantia: " + mesesGarantia;
	}

	//Método Herdado
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: "+ nome + "\tMarca: "+ marca + "\tEstoque: "+estoque+"\tPreço: "+preco);
	}

	//Getters
	public String getMarca() {
		return marca;
	}

	public Integer getMesesGarantia() {
		return mesesGarantia;
	}

}
