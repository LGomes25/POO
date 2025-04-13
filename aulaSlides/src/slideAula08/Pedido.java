package slideAula08;

import java.time.LocalDate;

public class Pedido {

	//Atributos
	private LocalDate dataPedido;
	private Bebidas bebidas;
	private Sanduiches sanduiches;
	
	//Construtor
	public Pedido(LocalDate dataPedido, Bebidas bebidas, Sanduiches sanduiches) {
		super();
		this.dataPedido = dataPedido;
		this.bebidas = bebidas;
		this.sanduiches = sanduiches;
	}
	
	//toString
	@Override
	public String toString() {
		return "Data do Pedido: " + dataPedido + "Valor Bebidas " + bebidas + "Valor Sanduiches " + sanduiches;
	}

	//Métodos
	public void menu() {
		System.out.println("-----Menu-----");
		System.out.println("----Bebidas----");
		for (Bebidas bebida : Bebidas.values()) {
			System.out.println(bebida+" - R$ "+bebida.getValorBebida());
		}
		for (Sanduiches sanduiches : Sanduiches.values()) {
			System.out.println(sanduiches+" - R$ "+sanduiches.getValorSanduiche());
		}
	}
	
	
	//Getters
	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Bebidas getBebidas() {
		return bebidas;
	}

	public Sanduiches getSanduiches() {
		return sanduiches;
	}
	
	
	
	
	
}
