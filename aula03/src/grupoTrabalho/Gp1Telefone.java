package grupoTrabalho;

public class Gp1Telefone {

    //Atributos
    private String numero;

    //Construtor
    public Gp1Telefone(String numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return numero;
    }

    //Getters
    public String getNumero() {
        return numero;
    }

   
}
