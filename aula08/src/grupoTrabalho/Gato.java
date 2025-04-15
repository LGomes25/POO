package grupoTrabalho;

public class Gato extends AnimalDeEstimacao {

	//Atributo
	private String cor;

	//Construtor
	public Gato(String nome, Integer idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	//toString
	@Override
	public String toString() {
		return "Gato     - Nome: " + nome + "\tIdade: "+ idade + "\tCor: "+  cor + "\tSituação: " + (!adotado ? "Disponivel" : "Adotado");
	}

	//Getters Setters
	public String getCor() {
		return cor;
	}

	public void setCom(String cor) {
		this.cor = cor;
	}
	
	//Getter Setter de Herança
	@Override
	public Boolean getAdotado() {
		// TODO Auto-generated method stub
		return super.getAdotado();
	}
	
	@Override
	public void setAdotado(Boolean adotado) {
		// TODO Auto-generated method stub
		super.setAdotado(adotado);
	}
	
	//Metodo interface
	@Override
	public void Imprimir() {
		super.Imprimir();
	}
	
}



