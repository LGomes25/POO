package grupoTrabalho;

public class Gp1Cidade {

    //atributos
    private String nomeCidade;
    private Gp1Estado estado;
    
    //Construtor
    public Gp1Cidade(String nomeCidade, Gp1Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return nomeCidade + " " + estado;
    }

    //Getters
    public String getNomeCidade() {
        return nomeCidade;
    }

    public Gp1Estado getEstado() {
        return estado;
    }
    
    
    
    
}
