package exercicios;

public class Pessoa {
	//modificador d acesso padrão
	private int id;
	private String nome;
	//tipo primitivo - armazenam valores
	private double peso, altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		if (peso>=0) {
			return peso;// Retorna o valor de 'peso' se for válido.
		}else {
			System.out.println("Voce digitou um valor inválido!");
			return 0.0; // Retorna um valor padrão em caso de erro.

		}
		
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calcularIMC() {
		return peso/(altura*altura);
	}
	
	public String resultado() {
		//Se o resultado < 18.5 - Abaixo do Peso
		//entre 18.5 e 24.9 - Peso Ideal
		//Acima do Peso
		
		if (calcularIMC() < 18.5) {
			return "Abaixo do Peso";
		}else if (calcularIMC() <= 24.9) {
			return "Peso Ideal";
		}else {
			return "Acima do peso";
		}
	}
}
