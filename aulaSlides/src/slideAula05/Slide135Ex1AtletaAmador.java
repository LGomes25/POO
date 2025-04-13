package slideAula05;

public class Slide135Ex1AtletaAmador extends Slide135Ex1Maratona{

	//Atributos
	private boolean atestado;
	
	//Construtor
	public Slide135Ex1AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}
	
	//toString
	public String toString() {
		return super.toString()+"\tAtestado: "+ (atestado ? "Sim" : "Não") + "\tSituação: " + situacao;
	}
	
	@Override
	public String verificaStuacao() {
		situacao = (idade > 18 ) ? "Participa da Maratona!!!" :
			  (altura >= 1.8 ) ? "Participa da Maratona!!!" :
			  "Não Participa";
		return situacao;
	}
}
