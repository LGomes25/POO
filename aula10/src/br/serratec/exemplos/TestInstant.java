package br.serratec.exemplos;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestInstant {

	public static void main(String[] args) {

		Instant dataHoje = Instant.now();
		System.out.println(dataHoje);

		// Variavel global
		Instant dataNova = Instant.parse("2025-04-16T01:00:00z");// Data imaginaria, passada para teste de zona

		// Variaval local
		LocalDateTime dataHoje2 = LocalDateTime.ofInstant(dataNova, ZoneId.systemDefault());// puxa data imaginaria e
																							// muda para a zona local
																							// -3UTC

		System.out.println(dataHoje2);
	}

}
