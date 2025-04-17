package br.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ExercicioData {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Solicita a data ao usuário no formato dd/MM/yyyy
        System.out.print("Digite a data no formato dd/MM/yyyy: ");
        String dataEntrada = scanner.nextLine();

        // Define o formatador para o formato de entrada (dd/MM/yyyy)
        DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Define o formatador para o formato de saída (yyyyMMdd)
        DateTimeFormatter formatterSaida = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        // Converte a entrada do usuário para um objeto LocalDate
        LocalDate data = LocalDate.parse(dataEntrada, formatterEntrada);

        // Converte a data para o formato de saída
        String dataFormatada = data.format(formatterSaida);

        // Exibe a data formatada
        System.out.println("Data no formato yyyyMMdd: " + dataFormatada);

        scanner.close();

	}

}
