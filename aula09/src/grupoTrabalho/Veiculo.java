package grupoTrabalho;

public class Veiculo {

	private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // toString 
    @Override
    public String toString() {
    	return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
 
    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

}
