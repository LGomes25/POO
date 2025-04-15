package org.serratec.exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
	
		//Não permite elementos iguais, ordem aleatória
		Set <String> times = new HashSet<>();

		times.add("Fla");
		times.add("Vasco");
		times.add("Flu");
		times.add("Botafogo");
		times.add("Fla");
		times.add("Flu");
		
		for (String x : times) {
			System.out.println(x);
		}System.out.println("\n");
		
		//Não permite elementos iguais, mantem ordem de entrada
		Set <String> times2 = new LinkedHashSet<>();

		times2.add("Fla");
		times2.add("Vasco");
		times2.add("Flu");
		times2.add("Botafogo");
		times2.add("Fla");
		times2.add("Flu");
		
		for (String xx : times2) {
			System.out.println(xx);
		}System.out.println("\n");
		
		
		//Não permite elementos iguais, ordena alfabetico
		Set <String> times3 = new TreeSet<>();
		
		times3.add("Fla");
		times3.add("Vasco");
		times3.add("Flu");
		times3.add("Botafogo");
		times3.add("Fla");
		times3.add("Flu");
		
		for (String xxx : times3) {
			System.out.println(xxx);
		}System.out.println("\n");
		
		//Toda classe predefina já tem o equals implementado
		Set<Integer> numeros = new HashSet<>();
		numeros.add(20);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		System.out.println(numeros);
		
		
	}

}
