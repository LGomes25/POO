package slideAula09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Slide221Ex1Venda implements Slide221Ex1FinalizarVenda {

    // Atributos
    private List<Slide221Ex1Produto> produtos; // Lista de produtos
    private List<Integer> quantidades; // Lista de quantidades
    private LocalDate dataCompra;
    private static Double totalVendas;

    // Construtor
    public Slide221Ex1Venda(LocalDate dataCompra) {
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
        this.dataCompra = dataCompra;
    }

    // Método para adicionar um produto e sua quantidade
    public void adicionarProduto(Slide221Ex1Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    // Getters
    public List<Slide221Ex1Produto> getProdutos() {
        return produtos;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public static Double getTotalVendas() {
        return totalVendas;
    }

    // Método Interface
    @Override
    public void calcularVenda() {
        totalVendas = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Slide221Ex1Produto produto = produtos.get(i);
            Integer quantidade = quantidades.get(i);
            totalVendas += produto.getValor() * quantidade;
        }
    }

    // Método para exibir os detalhes da venda
    public void mostrarVenda() {
        System.out.println("Detalhes da Venda:");
        System.out.println("-----------------------------");
        for (int i = 0; i < produtos.size(); i++) {
            Slide221Ex1Produto produto = produtos.get(i);
            Integer quantidade = quantidades.get(i);
            System.out.println(produto.getDescricao() + " - R$ " + produto.getValor() + " x " + quantidade);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Geral Venda: R$ " + totalVendas);
    }

    // toString atualizado
    @Override
    public String toString() {
        return "Data da Compra: " + dataCompra + "\tTotal Venda: R$ " + totalVendas;
    }
}