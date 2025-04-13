package exemplos;

public class Modificadores {
	private String nome;
	private double peso;
	private double altura;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
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

	//Métodos
	public double calcularImc() {
		return peso / (altura*altura);
	}
	
	public String resultado() {
		double imc = calcularImc();
		if (imc<18.5) {
			return "Abaixo do Peso";
		}else if (imc<24.9) {
			return "Peso Normal";
		}else {
			return "Acima do Peso";
		}
	}
}