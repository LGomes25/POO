package br.com.serratec;

public class Imovel {

    private String tipo;
    private Double valor;
    private Proprietario proprietario;
    
    //Construtor
    public Imovel(String tipo, Double valor, Proprietario proprietario) {
        this.tipo = tipo;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    //toString
    @Override
    public String toString() {
        return "Imovel tipo: " + tipo + ", valor: " + valor + ", proprietario: " + proprietario;
    }
    //Getters
    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    



}
