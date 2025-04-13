package br.com.serratec;

//Interface ja é abstract, só contem assinaturas, tudo é public
public interface Conta {

	public static final Double TAXAS = 10.; //(public static final) são implicitos, não necessario explicitar
	
	public Boolean saque(Double valor);
	
	public void deposito(Double valor);
	
	
}
