package friburgoExtras;

import java.util.Scanner;

public class EcommerceApp {

	public static void main(String[] args) {

		Menu loja = new Menu("Comercial");
		
		// Instâncias da classe Alimento
		Alimento ali1 = new Alimento("Arroz", 5.99, 100, 1, "kg");
		Alimento ali2 = new Alimento("Feijão", 7.49, 50, 1, "kg");

		// Instâncias da classe Eletronico
		Eletronico ele1 = new Eletronico("Celular", 1999.90, 10, "Samsung", 24);
		Eletronico ele2 = new Eletronico("Laptop", 3499.00, 5, "Dell", 12);
		
		
		loja.adicionarProdutos(ali2);
		loja.adicionarProdutos(ali1);
		loja.adicionarProdutos(ele1);
		loja.adicionarProdutos(ele2);
		
		Scanner sc = new Scanner(System.in);
		int op=0;
		
		do {
			loja.iniciar();;
			op = sc.nextInt();
			sc.nextLine();//limpar buffer
				switch (op) {
				case 1 ->loja.cadastrarProduto(sc);
				case 2 ->loja.listarProdutos();
				case 3 ->loja.realizarVenda();
				case 4 ->loja.aumentarEstoque();
				case 5 ->System.out.println("\n========= E-commerce POO Finalizado ==========");
				default ->System.out.println("Opção Inválida! Escolha um n° de acordo com as opções.");
				}
		} while (op !=5);
		sc.close();
	}

}
