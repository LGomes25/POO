package grupoTrabalho;

import java.util.Scanner;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca("Responsável da Biblioteca");
		int op;

		do {
			System.out.println("----- Menu da Biblioteca -----");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Apresentar todos os livros");
			System.out.println("3 - Pesquisar por faixa de preço");
			System.out.println("4 - Valor total dos livros");
			System.out.println("5 - Sair");
			System.out.print("Escolha a operação: ");

			op = sc.nextInt();
			//sc.nextLine(); // Consumir o "\n" após o nextInt()

			switch (op) {
			case 1:// Adicionar livro
				System.out.print("\nDigite o título do livro: ");
				String titulo = sc.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = sc.nextLine();
				System.out.print("Digite o preço do livro: ");
				double preco = sc.nextDouble();
				//sc.nextLine(); // Consumir o "\n"
				biblioteca.adicionar(new Livro(titulo, autor, preco));
				System.out.println("\nLivro adicionado com sucesso!\n");
				break;

			case 2:// Apresentar todos os livros
				biblioteca.listar();
				System.out.println();
				break;

			case 3:// Pesquisar por faixa de preço
				System.out.print("\nDigite o valor inicial: ");
				double inicial = sc.nextDouble();
				System.out.print("Digite o valor final: ");
				double final1 = sc.nextDouble();
				int qtd = biblioteca.pesquisarFaixaDePreco(inicial, final1);
				System.out.println("\nQuantidade de livros encontrados: " + qtd+"\n");
				break;

			case 4:// Valor total dos livros
				double total = biblioteca.calcularTotalLivros();
				System.out.println("\nValor total dos livros: R$ " + total+"\n");
				break;

			case 5:// Sair do menu
				System.out.println("\nEncerrando o programa...");
				break;

			default:
				System.out.println("\nOpção inválida! Tente novamente.\n");
				break;
			}
		} while (op != 5);

		sc.close();

	}

}
