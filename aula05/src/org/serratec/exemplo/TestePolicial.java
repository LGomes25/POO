package org.serratec.exemplo;

public class TestePolicial {

	public static void main(String[] args) {

		Policial policial = new Policial("João", "Rio");
		
		//Não permite alterar a constante após o instanciamento.
		
		System.out.println(policial.getNome());
		
	}

}
