package slideAula08;

import java.time.LocalDate;

public class Slide195Ex1TesteLanchonete {

	public static void main(String[] args) {

		Slide195Ex1Pedido.menu();// Apresenta o metodo menu na tela (static void)

		Slide195Ex1Bebidas bb1 = Slide195Ex1Bebidas.REFRI;
		Slide195Ex1Sanduiches sd1 = Slide195Ex1Sanduiches.MIXTO;

		Slide195Ex1Pedido pd1 = new Slide195Ex1Pedido(LocalDate.now(), bb1, sd1);

		System.out.println("\nDetalhes do Pedido:");
		System.out.println("Data: " + pd1.getDataPedido());
		System.out.println("Bebida: " + pd1.getBebidas().ordinal());
		System.out.println("Sanduíche: " + pd1.getSanduiches());
		System.out.println("Total: R$ " + pd1.pedidoFeito());
	}

}
