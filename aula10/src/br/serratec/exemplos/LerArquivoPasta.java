package br.serratec.exemplos;

import java.io.File;
import java.util.Scanner;

public class LerArquivoPasta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o caminho da pasta ou do arquivo: ");
		String nome = sc.nextLine();

		File file = new File(nome);

		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho %d bytes", file.getName(), file.length());
			} else {
				System.out.println("\nConteudo da Pasta: ");
				for (File arquivo : file.listFiles()) {
					System.out.println(arquivo);
				}
			}
		} else {
			System.out.println("Arquivo ou pasta não encontrado");
		}
		sc.close();
	}

}
