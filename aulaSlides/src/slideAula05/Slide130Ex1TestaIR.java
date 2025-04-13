package slideAula05;

public class Slide130Ex1TestaIR {

	public static void main(String[] args) {
		
		Slide130Ex1PessoaFisica fisica = new Slide130Ex1PessoaFisica("Leo",1000.,"123","321");
		Slide130Ex1PessoaJuridica juri = new Slide130Ex1PessoaJuridica("MiCakes",1000.,"456","654");
		
		System.out.println(fisica.impostoPagar());
		System.out.println("\n"+juri.impostoPagar());
	}
}