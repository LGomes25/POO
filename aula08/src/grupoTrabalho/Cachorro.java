package grupoTrabalho;

public class Cachorro extends AnimalDeEstimacao {

	//Atributos
	private String raca;

	//Construtor
	public Cachorro(String nome, Integer idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	//toString
	@Override
	public String toString() {
		return "Cachorro - Nome: " + nome + "\tIdade: "+ idade + "\tRaça: "+  raca + "\tSituação: " + (!adotado ? "Disponivel" : "Adotado");
	}

	//Getter Setters
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
		// TODO Auto-generated method stub
		super.Imprimir();
	}

	
	
}
