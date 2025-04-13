package slideAula08;

import java.time.LocalDate;

public class Slide195Ex1Pedido {

	//Atributos
	private LocalDate dataPedido;
	private Slide195Ex1Bebidas bebidas;
	private Slide195Ex1Sanduiches sanduiches;
	
	//Construtor
	public Slide195Ex1Pedido(LocalDate dataPedido, Slide195Ex1Bebidas bebidas, Slide195Ex1Sanduiches sanduiches) {
		this.dataPedido = dataPedido;
		this.bebidas = bebidas;
		this.sanduiches = sanduiches;
	}
	
	//toString
	@Override
	public String toString() {
		return "Data do Pedido: " + dataPedido + "Valor Bebidas " + bebidas + "Valor Sanduiches " + sanduiches;
	}

	//Métodos - Imprimir menu
	public static void menu() {
		System.out.println("---------Menu----------");
		System.out.println("--------Bebidas--------");
		int seq = 1;
		for (Slide195Ex1Bebidas bebida : Slide195Ex1Bebidas.values()) {
			System.out.println(seq+" - "+bebida+"     \tR$ "+bebida.getValorBebida());
			seq++;
		}
		System.out.println("-------Sanduiches------");
		for (Slide195Ex1Sanduiches sanduiches : Slide195Ex1Sanduiches.values()) {
			System.out.println(seq+" - "+sanduiches+"   \tR$ "+sanduiches.getValorSanduiche());
			seq++;
		}
		System.out.println("-----------------------");
	}
	
	//Metodo para calcular pedido
	public double pedidoFeito() {
		return bebidas.getValorBebida()+sanduiches.getValorSanduiche();
	}
	
	//Getters
	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Slide195Ex1Bebidas getBebidas() {
		return bebidas;
	}

	public Slide195Ex1Sanduiches getSanduiches() {
		return sanduiches;
	}
	
	
	
	
	
}
