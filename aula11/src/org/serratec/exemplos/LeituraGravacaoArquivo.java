package org.serratec.exemplos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraGravacaoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = sc.next();

			FileReader file = new FileReader(nomeArquivo);
			Scanner sc2 = new Scanner(file);

			List<Empregados> empregados = new ArrayList<>();

			while (sc2.hasNext()) {
				String linha = sc2.nextLine();
				if (!linha.isEmpty()) {
					String[] dados = linha.split(";");
					System.out.println(dados[0] + " - " + dados[1] + " - " + dados[2]);
					//empregados.add(new Empregados(dados[0], dados[1], Double.parseDouble(dados[2])));
				}
			}
			sc2.close();
			System.out.println("--------------------- Dados Importados do Arquivo ---------------------");
//			for (Empregados empregados2 : empregados) {
//				System.out.println(empregados2);
//			}
			// Forma resumida de fazer um for each!!!
			empregados.forEach(empregados2 -> System.out.println(empregados2));

			// Gravação dos dados da lista em um outro arquivo
			FileWriter fw = new FileWriter("/serratec-2025-1/curso/processado.csv");
			PrintWriter pw = new PrintWriter(fw);

			for (Empregados empregados3 : empregados) {
				String linha = empregados3.getNome() + " ; " + empregados3.getProfissao() + " ; "
						+ empregados3.getSalario() + "\n";
				pw.printf(linha);
			}
			pw.close();

		} catch (Exception e) {
			System.err.println("Arquivo não encontrado!");
		}

		sc.close();
	}

}
//https://jdbc.postgresql.org/download/