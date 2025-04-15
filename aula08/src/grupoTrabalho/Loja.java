package grupoTrabalho;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Animal {

	//Atributos
	private String nomeLoja;
	private List<Animal> animais;
	
	//Construtor
	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
		this.animais = new ArrayList<Animal>();
	}
	
	//toString
	@Override
	public String toString() {
		return "Loja [nomeLoja=" + nomeLoja + ", animal=" + animais + "]";
	}

	//Metodo adicionar animal
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	//Metodos Interface - listar animal
	@Override
	public void Imprimir() {
		System.out.println("\n===== Lista de Pets =====");
		int cont = 1;
		for (Animal pet : getAnimal()) {
			System.out.println(cont + " - " +pet);
			cont++;
		}
		System.out.println("=========================\n");
	}

	//Metodo adicionar animal
	public void adotarAnimal(int index) {
		if (index<=0 || index >= animais.size()) {//compara se o indice existe na lista
			throw new AnimalException("N° do Pet não existe, gostaria de escolher outro?\n");
		}
		//Linha 47 cria um objeto utiliando o metodo casting.
		AnimalDeEstimacao escolha = (AnimalDeEstimacao) animais.get(index);		
		System.out.println(escolha);
		if (escolha.adotado) {//Verifica se o campo é verdadeiro.
			throw new AnimalException("Este Pet já foi adotado, gostaria de escolher outro?\n");
		}else {
		escolha.setAdotado(true);
		System.out.println("Parabéns pela Adoção!!!\n");
		}
	}
	
	
	//Getters
	public String getNomeLoja() {
		return nomeLoja;
	}

	public List<Animal> getAnimal() {
		return animais;
	}
	
	 public void exibirMenu() {
	        System.out.println("========= MENU =========");
	        System.out.println("1 - Adicionar um pet");
	        System.out.println("2 - Listar pets");
	        System.out.println("3 - Adotar pet");
	        System.out.println("4 - Sair");
	        System.out.println("========================");
	        System.out.print("Escolha uma opção: ");
	    }

	
}
