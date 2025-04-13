package org.serratec;

public class UppercaseException {

	public static void main(String[] args) {

		String palavra = null;

		try { //Executa a ação que poderá ocorrer o evento contrário

			System.out.println(palavra);
			//palavra.toUpperCase(); <-- retirar o comentário
			System.out.println(palavra);
			

		} catch (NullPointerException e) { //informar o problema 

			System.out.println("não é possivel colocar em caixa alta");

		} finally { //Finaliza o codigo.

			System.out.println("Fim");
			

		}

	}

}
