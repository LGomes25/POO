package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {
		List<String> times = new ArrayList<>();

		times.add("Flamengo");
		times.add("Vasco");
		times.add("Fluminense");
		times.add("Botafogo");
		// System.out.println(times.size());
		times.set(3, "Bangu");
		System.out.println("A lista está vazia:" + (times.isEmpty() ? "Sim" : "Não"));
		System.out.println("A lista tem Botafogo?" + (times.contains("Botafogo") ? "Sim" : "Não"));

		// Collections.sort(times);
//		Collections.shuffle(times);
//		for (String time : times) {
//			System.out.println(time);
//		}

		Aluno a1 = new Aluno("Adriana", 33, "a@gmail.com");
		Aluno a2 = new Aluno("Adriano", 31, "ad@gmail.com");
		Aluno a3 = new Aluno("José", 18, "j@gmail.com");

		List<Aluno> alunos = Arrays.asList(a1, a2);// Array asList aceita a troca
		for (Aluno xx : alunos) {// Listar array
			System.out.println(xx);
		}

		alunos.set(0, a3); // Altera a lista

		for (Aluno xx : alunos) { // Listar array
			System.out.println(xx);
		}

		System.out.println("*****************OF*************");

		List<Aluno> alunosOf = List.of(a1, a2); // List.of não aceita mudança

		alunosOf.set(0, a3);

		System.out.println(alunosOf);

	}

}