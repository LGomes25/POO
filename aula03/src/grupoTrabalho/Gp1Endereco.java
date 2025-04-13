package grupoTrabalho;

public class Gp1Endereco {

    //Atributos
    private String rua;
    private String bairro;
    private String cep;
    private Gp1Cidade cidade;
    
    //Construtor
    public Gp1Endereco(String rua, String bairro, String cep, Gp1Cidade cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    //toString
    @Override
    public String toString() {
        return rua + " " + bairro + " " + cidade;
    }

    //Getters
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public Gp1Cidade getCidade() {
        return cidade;
    }

    

    



}
