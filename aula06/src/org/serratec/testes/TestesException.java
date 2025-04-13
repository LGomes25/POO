package org.serratec.testes;

//import java.io.FileNotFoundException;
//import java.io.FileReader;

public class TestesException {

	public static void main(String[] args) {

		try {
			System.out.println("Resultado: " + divisao(10,5));
			System.out.println("Passou aqui");//nao é executado devido ao erro
			//FileReader file = new FileReader("c:\temp\teste");
			
		} catch (ArithmeticException e) {
			System.out.println("Divisão por 0 não permitida");
			e.printStackTrace();
			
		//}catch (FileNotFoundException ex) {
		//	System.out.println("Arquivo não encontrado!");
		}
		finally {
			System.out.println("Finalizando o Programa");
		}
		
	}

	public static int divisao (int a , int b) throws ArithmeticException {
		/*if (b == 0) {
			throw new ArithmeticException("Divisão por 0 não permitida");
		}
		return a / b;*/
		return a / b;
	}
	
	
}
