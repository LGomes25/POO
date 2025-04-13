package grupoTrabalho;

public class Gp1Estado {

    //Atributos
    private String nomeEstado;
    private String sigla;
    
    //Construtor
    public Gp1Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    //toString
    @Override
    public String toString() {
        return nomeEstado;
    }

    //Getters
    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }

    
}
