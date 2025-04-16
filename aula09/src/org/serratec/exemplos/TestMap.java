package org.serratec.exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class TestMap {

	public static void main(String[] args) {
		
		//LinkedHashMap (mantém ordem de entrada)
		//HashMap (imprimi desorganizado)
		//TreeMap (ordena a lista)
		Map<Integer, String> mapa = new TreeMap<>();
		mapa.put(4, "Joca");
		mapa.put(2, "Lock");
		mapa.put(3, "Kind");
		mapa.put(3, "José");
		
		System.out.println(mapa);
		
		TreeMap<Aluno, Integer> mapa2 = new TreeMap<>();
		mapa2.put(new Aluno("Maria", 25), 1);
		mapa2.put(new Aluno("Sergio", 34), 200);
		mapa2.put(new Aluno("Carlos", 22), 300);

		System.out.println(mapa2);
		
	}

}
