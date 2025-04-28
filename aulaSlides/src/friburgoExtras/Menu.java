package friburgoExtras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	@SuppressWarnings("unused")
	private String nome;
	private List<Produto> produtos;
	

	public Menu(String nome) {
		this.nome = nome;
		produtos = new ArrayList<>();
	}

	public void adicionarProdutos(Produto produto) {
		produtos.add(produto);
	}
	

	public void iniciar() {
		System.out.println("=============== E-commerce POO ===============");
		System.out.println("1 - Cadastrar produto (Alimento ou Eletrônico)");
		System.out.println("2 - Listar todos os produtos");
		System.out.println("3 - Realizar venda (não funcional)");
		System.out.println("4 - Aumentar estoque (não funcional)");
		System.out.println("5 - Sair");
		System.out.println("==============================================");
		System.out.println("Opção escolhida: ");
	}

	public void cadastrarProduto(Scanner sc) {
		System.out.println("\n========== E-commerce POO - Cadastrar Novos Produtos ==========\n");
		System.out.println("Selecione 1 para Alimentos ou 2 para Eletronicos: ");
		int op = sc.nextInt();
		sc.nextLine();//limpar buffer
		if (op == 1) {
			System.out.println("Digite o nome do alimento: ");
			String al = sc.nextLine();
			System.out.println("Digite o preço: ");
			Double pr = sc.nextDouble();
			sc.nextLine();//limpar buffer
			System.out.println("Digite a quantidade para estoque: ");
			int qtEst = sc.nextInt();
			sc.nextLine();//limpar buffer
			System.out.println("Digite a quantidade por item: ");
			int qtItem = sc.nextInt();
			sc.nextLine();//limpar buffer
			System.out.println("Digite a unidade de medida: ");
			String unMedida = sc.nextLine();
			adicionarProdutos(new Alimento(al, pr, qtEst, qtItem, unMedida));
			System.out.println("---- Alimento Cadastrado com Sucesso!!! ---");
		}else if (op == 2) {
			System.out.println("Digite o nome do Eletrônico: ");
			String al = sc.nextLine();
			System.out.println("Digite o preço: ");
			Double pr = sc.nextDouble();
			sc.nextLine();//limpar buffer
			System.out.println("Digite a quantidade para estoque: ");
			int qtEst = sc.nextInt();
			sc.nextLine();//limpar buffer
			System.out.println("Digite a Marca: ");
			String mark = sc.nextLine();
			System.out.println("Digite a quantidade de meses de gatantia: ");
			int mesGar = sc.nextInt();
			sc.nextLine();//limpar buffer
			adicionarProdutos(new Eletronico(al, pr, qtEst, mark, mesGar));
			System.out.println("---- Eletrônico Cadastrado com Sucesso!!! ---");
		}
		System.out.println("\n===============================================================\n");
	}

	public void listarProdutos() {
		System.out.println("\n========== E-commerce POO - Listar todos os produtos ==========\n");
		for (Produto pires : produtos) {
			pires.exibirInformacoes();
			
		}
		System.out.println("\n===============================================================\n");
	}

	public void realizarVenda() {
		System.out.println("3 - Realizar venda");

	}

	public void aumentarEstoque() {
		System.out.println("4 - Aumentar estoque");

	}

}
