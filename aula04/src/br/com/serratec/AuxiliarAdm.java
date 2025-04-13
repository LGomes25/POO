package br.com.serratec;

public class AuxiliarAdm extends Auxiliar {

	//Não tem atributos, usar construtor do pai	
	public AuxiliarAdm(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario, categoria);
		// TODO Auto-generated constructor stub
	}
	
	//Obrigado a usar o reajuste do "avô"
	@Override
	public void reajusteSalarial(Double valor) {
		// TODO Auto-generated method stub

	}

}
