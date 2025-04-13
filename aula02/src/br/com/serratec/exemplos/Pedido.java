package br.com.serratec.exemplos;

import java.time.LocalDate;

public class Pedido {
	private Integer numero;
	private LocalDate data;
	private Double valor;
	private Integer quantidade;
	private Double total;
	
	public Pedido(Integer numero, LocalDate data, Double valor, Integer quantidade) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.quantidade = quantidade;
		this.total = quantidade * valor;
	}
			
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public Double getTotal() {
		return total;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
			
}