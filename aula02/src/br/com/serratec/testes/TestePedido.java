package br.com.serratec.testes;

import java.time.LocalDate;

import br.com.serratec.exemplos.Pedido;

public class TestePedido {

	public static void main(String[] args) {

		Pedido pedido1= new Pedido(1,LocalDate.of(2025,04,01),1523.20,5);
		
		System.out.println("N° Pedido: "+pedido1.getNumero()+" Total: "+pedido1.getTotal());
	}

}
