package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevisaoLista {

	public static void main(String[] args) {

		//Lista livre
		List<String> cores = new ArrayList<>();
		cores.add("branco");
		
		//Lista mutavel mas não aumenta
		List<Integer> numeros = Arrays.asList(10, 20, 30, 40);
		numeros.add(60);//não aceita adicionar, poderá substituir 
		numeros.set(0, 15);//aceita substituição
		
		//Lista imutavel
		List<String> times = List.of("Fla","Flu");
		times.add("Bota");//não aceita adicionar
		times.set(0, "vasco");//não aceita mudar

	}

}
