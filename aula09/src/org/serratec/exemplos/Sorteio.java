package org.serratec.exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {

	private List<T> lista;
	private Random random;

	// Construtor
	public Sorteio() {
		lista = new ArrayList<>();
		random = new Random();
	}

	// método para criar lista adiciona um
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	@SuppressWarnings("unchecked")
	public void adicionarVarios (T... elementos) {
		lista.addAll(Arrays.asList(elementos));
	}

	// metodo para remover
	public void remover(T elemento) {
		lista.remove(elemento);
	}

	// metodo para sortear
	public T sorteio() {
		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}

}
