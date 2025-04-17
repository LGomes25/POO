package br.serratec.exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeituraArquivo {

	public static void main(String[] args) {

		File arquivo = new File("/serratec-2025-1/curso/aula.txt");
		
		try {
			Scanner sc = new Scanner(arquivo);
			System.out.println("Arquivo encontrado");
			
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}sc.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
			e.printStackTrace();
		}
		
	}

}
