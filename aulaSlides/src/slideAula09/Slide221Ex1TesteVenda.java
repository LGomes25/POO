package slideAula09;

import java.time.LocalDate;

public class Slide221Ex1TesteVenda {
    public static void main(String[] args) {

        // Criação dos produtos pelo construtor
        Slide221Ex1Produto pd1 = new Slide221Ex1Produto(1, "TV", 3000., Slide221Ex1Categoria.ELETRONICO);
        //Produto pd2 = new Produto(2, "Pneu", 800., Categoria.AUTOMOTIVO);
        Slide221Ex1Produto pd3 = new Slide221Ex1Produto(3, "Celular", 2500., Slide221Ex1Categoria.ELETRONICO);
        //Produto pd4 = new Produto(4, "Jeans", 90., Categoria.ROUPAS);
        Slide221Ex1Produto pd5 = new Slide221Ex1Produto(5, "Açaí", 30., Slide221Ex1Categoria.ALIMENTO);
        //Produto pd6 = new Produto(6, "Epocler", 15., Categoria.FARMACEUTICO);

        // Criação da venda
        Slide221Ex1Venda venda = new Slide221Ex1Venda(LocalDate.now());

        // Adicionando vários produtos e suas quantidades
        venda.adicionarProduto(pd1, 2); // 2 TVs
        venda.adicionarProduto(pd3, 1); // 1 Celular
        venda.adicionarProduto(pd5, 5); // 5 Açaís

        // Aplicação dos métodos
        venda.calcularVenda();
        venda.mostrarVenda();
    }
}