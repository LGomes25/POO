package exemplos;

public class ConstrutorTeste {

	public static void main(String[] args) {
		
		//com o construtor, é necessário passar o 
	    //parametro na crição do objeto
		Construtor prod1 = new Construtor("Celular",2500.);
		Construtor prod2 = new Construtor("TV",4500.);
		
		System.out.println("Produtos comprados: "+prod1.getNome()
			+", "+prod2.getNome());
		
		System.out.println("Total de produtos: "+Construtor.getTotalProdutos());
	}
}