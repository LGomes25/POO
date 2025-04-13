package slideAula04;

import java.util.Scanner;

public class Slide119Ex2ProdutoTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Slide119Ex2Produto prod1 = new Slide119Ex2Produto("Arroz",25,2);
		char op = 'N';
		
		System.out.println("Produto:\n"+prod1.getDescricao()
				+"\nValor:\n"+prod1.getValor()+"\nQuantidade:\n"
				+prod1.getQuantidade()+"\nDescrição: "+prod1.getDescricao()
				+"\nValor: "+prod1.getValor()+"\nTotal: "
				+(prod1.getQuantidade()*prod1.getValor())+"\nICMS: "
				+prod1.getIcms());
		
		do {
			System.out.println("\nDeseja encerrar o programa? (S/N)");
			op = sc.next().toUpperCase().charAt(0);
			if (op == 'S') {
				System.out.println("\n\nPrograma Encerrado");
				
			}else if (op == 'N') {
				System.out.println("Informe o nome do Prduto:");
				prod1.setDescricao(sc.next());
				System.out.println("Informe o valor:");
				prod1.setValor(Double.parseDouble(sc.next()));
				System.out.println("Informe a quantidade:");
				prod1.setQuantidade((Integer.parseInt(sc.next())));
				System.out.println("\n\nProduto:\n"+prod1.getDescricao()
					+"\nValor:\n"+prod1.getValor()+"\nQuantidade:\n"
					+prod1.getQuantidade()+"\nDescrição: "+prod1.getDescricao()
					+"\nValor: "+prod1.getValor()+"\nTotal: "
					+(prod1.getQuantidade()*prod1.getValor())+"\nICMS: "
					+prod1.getIcms());
			}else {
				System.out.println("\nOpção Inválida! Por favor, digite 'S'"
						+"para encerrar ou 'N' para continuar.");
				op = 'N';
			}
			
		} while (op == 'N');
		sc.close();
	}
}
