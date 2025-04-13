package slideAula05;

public class Slide135Ex1AtletaProfissional extends Slide135Ex1Maratona{

	//Atributos
	private double peso;
	
	//Construtor
	public Slide135Ex1AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	//toString
	public String toString() {
		return super.toString()+ "\tPeso: "+peso + "\tSituação: " + situacao;
	}
	
	@Override
	public String verificaStuacao() {
		situacao = (idade > 18 ) ? "Participa da Maratona!!!" :
			  (altura >= 1.8 ) ? "Participa da Maratona!!!" :
			  "Não Participa";
		return situacao;
	}
	
	//Getters
	public double getPeso() {
		return peso;
	}
	
	
	
}
