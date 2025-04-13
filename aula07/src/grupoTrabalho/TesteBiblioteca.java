package grupoTrabalho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca("Responsável da Biblioteca");
		int op = 0;
		boolean opValido;// Garantir loop enquanto valor correto não existir

		do {// Menu de apresentação
			System.out.println("----- Menu da Biblioteca -----");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Apresentar todos os livros");
			System.out.println("3 - Pesquisar por faixa de preço");
			System.out.println("4 - Valor total dos livros");
			System.out.println("5 - Sair");

			opValido = false;// garantir estado false antes do loop
			while (!opValido) {// trata entradas diferentes do esperado
				try {
					System.out.print("Escolha a operação: ");
					op = sc.nextInt();
					sc.nextLine();// Limpar o buffer, evita capturas erradas
					opValido = true;// reinicia variavel
				} catch (InputMismatchException e) {
					System.out.println("Entrada Inválida, digite apenas números (1-5)");
					sc.nextLine();// Limpar o buffer, evita loop infinito
				}
			}

			switch (op) {
			case 1:// Adicionar livro
				opValido = false;// garantir estado false antes do loop
				while (!opValido) {// trata entradas diferentes do esperado
					try {
						System.out.print("\nDigite o título do livro: ");
						String titulo = sc.nextLine();
						System.out.print("Digite o autor do livro: ");
						String autor = sc.nextLine();
						System.out.print("Digite o preço do livro: ");
						Double preco = sc.nextDouble();
						sc.nextLine(); // Limpar o buffer
						biblioteca.adicionar(new Livro(titulo, autor, preco));
						System.out.println("\nLivro adicionado com sucesso!\n");
						System.out.println("Título: " + titulo + "\tAutor: " + autor + "\tPreço: " + preco + "\n");
						opValido = true;// reinicia variavel
					} catch (InputMismatchException e) {
						System.out.println("\nEntrada do valor invalido.\nUtilize somente "
								+ "números e virgula conforme exemplo: 0,00\n");
						sc.nextLine();// Limpar o buffer, evita loop infinito
					}
				}
				break;

			case 2:// Apresentar todos os livros
				biblioteca.listar();
				System.out.println();
				break;

			case 3:// Pesquisar por faixa de preço
				opValido = false;// garantir estado false antes do loop
				while (!opValido) {// trata entradas diferentes do esperado
					try {
						System.out.print("\nDigite o valor inicial: ");
						double inicial = sc.nextDouble();
						System.out.print("Digite o valor final: ");
						double final1 = sc.nextDouble();
						sc.nextLine(); // Limpar o buffer
						int qtd = biblioteca.pesquisarFaixaDePreco(inicial, final1);
						System.out.println("\nQuantidade de livros encontrados: " + qtd + "\n");
						opValido = true;// reinicia variavel
					} catch (InputMismatchException e) {
						System.out.println("\nEntrada do valor invalido.\nUtilize somente "
								+ "números e virgula conforme exemplo: 0,00\n");
						sc.nextLine();// Limpar o buffer, evita loop infinito
					}
				}

				break;

			case 4:// Valor total dos livros
				double total = biblioteca.calcularTotalLivros();
				System.out.println("\nValor total dos livros: R$ " + total + "\n");
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
