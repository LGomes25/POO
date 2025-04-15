package grupoTrabalho;

import java.util.Scanner;

public class TestePetshop {

	public static void main(String[] args) {

		Loja loja = new Loja("Pulguinha");

		Cachorro dog1 = new Cachorro("Dub", 2, "Caramelo");
		Cachorro dog2 = new Cachorro("Flor", 1, "Yorkshire");
		Gato cat1 = new Gato("Prin", 3, "Amarelo");
		Gato cat2 = new Gato("Reinz", 7, "Preto");
		loja.adicionarAnimal(dog1);
		loja.adicionarAnimal(cat1);
		loja.adicionarAnimal(dog2);
		loja.adicionarAnimal(cat2);

		Scanner sc = new Scanner(System.in);
		int op = 0;

		do {
			loja.exibirMenu();
			try {
				op = sc.nextInt();
				sc.nextLine();// limpar buffer
			} catch (Exception e) {
				System.out.println("\nOpção inválida\n");
				op=0;
				sc.nextLine();// limpar buffer
				continue;//Reiicia o bloco
			}
			switch (op) {
			case 1:// Adiciona novos Pets
				System.out.println("\n=== Cadastro de Pets ====");
				System.out.println("Digite '1' para Gato ou '2' para Cachorros");
				int tipo = sc.nextInt();
				sc.nextLine();// limpar buffer
				if (tipo !=1 & tipo != 2) {
					System.out.println("Escolha inexistente, refaça o cadastro.");
				}else if (tipo == 1) {//adiciona gatos
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					System.out.println("Idade: ");
					int idade = sc.nextInt();
					sc.nextLine();// limpar buffer
					System.out.println("Cor: ");
					String cor = sc.nextLine();
					loja.adicionarAnimal(new Gato(nome, idade, cor));
					System.out.println("==== Pet Cadastrado! ====\n");
				} else if (tipo == 2) {//adiciona cachorros
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					System.out.println("Idade: ");
					int idade = sc.nextInt();
					sc.nextLine();// limpar buffer
					System.out.println("Raça: ");
					String raca = sc.nextLine();
					loja.adicionarAnimal(new Cachorro(nome, idade, raca));
					System.out.println("==== Pet Cadastrado! ====\n");
				}
				System.out.println("=========================\n");
				
				break;

			case 2:// Apresenta a lista de todos os pets da loja
				loja.Imprimir();
				break;

			case 3:// Adotar animal
				loja.Imprimir();
				System.out.println("**************************************************************");
				System.out.println("Informe o n° do Pet escolhido: ");
				int escolha = sc.nextInt();
				try {
					loja.adotarAnimal(escolha - 1);
				} catch (AnimalException e) {
					System.out.println(e.getMessage());
				}
				
				break;

			case 4:// Sai do programa
				System.out.println("\n===== Volte Sempre =====");
				break;

			default:
				System.out.println("\nOpção inválida\n");
				break;
			}
		} while (op != 4);

		sc.close();
	}

}
