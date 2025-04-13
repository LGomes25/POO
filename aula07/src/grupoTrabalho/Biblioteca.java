package grupoTrabalho;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String responsavel;
    private List<Livro> listaLivros;
	
    //Construtor
    public Biblioteca(String responsavel) {
		this.responsavel = responsavel;
		this.listaLivros = new ArrayList<>(); // inicia a lista no construtor
	}

    //Metodos Adiciona o livro
    public void adicionar(Livro livro) {
        listaLivros.add(livro); 
    }
    
    //Metodos Apresenta todos os Livro
    public void listar() {
        System.out.println("\n----- Lista de Livros -----");
        for (Livro titulo : listaLivros) {
            System.out.println(titulo);
        }
    }
    
    //Metodo Procura e Apresenta Livro em faixa
    public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
        int qtd = 0;

        System.out.println("\n----- Livros na faixa de preço -----");
        for (Livro titulo : listaLivros) {
            if (titulo.getPreco() >= valorInicial && titulo.getPreco() <= valorFinal) {
                System.out.println(titulo);
                qtd++;
            }
        }
        return qtd; // Retorna a quantidade de livros encontrados
    }
    
    //Metodo Soma total em dinheiro
    public double calcularTotalLivros() {
        double total = 0;

        for (Livro titulo : listaLivros) {
            total += titulo.getPreco();
        }

        return total;
    }
    
    //Getters
	public String getResponsavel() {
		return responsavel;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}
    
    
    
}
    

