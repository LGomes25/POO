package br.com.serratec;

public class RevTesteImovel {

	public static void main(String[] args) {

		RevProprietario p1 = new RevProprietario("José");
		RevCasa casa = new RevCasa("Centro",200000., p1, true);
						
		System.out.println(casa);
		System.out.println("Valor do ITBI: "+casa.calcularItbi());
		
	}

}
