package grupoTrabalho;

public class Gp1Contato {

    //Atributos
    private String nome;
    private Gp1Telefone[] telefones;
    private Gp1Endereco endereco;
    
    //Construtor - iniciar o array telefone no construtor
    public Gp1Contato(String nome, Gp1Telefone[] telefones, Gp1Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }
    
    //toString
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + endereco;
    }
    
    //Metodo
    public void mostrarTelefones() {
        for (Gp1Telefone x : telefones) {
            System.out.println( "Telefone: "+ x );
        }
    }

    public void adicionarTelefone(Gp1Telefone telefone) {
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i]==null) {
                telefones[i]=telefone;
                break;
            }
        }
           
    }

    //Getter
    public String getNome() {
        return nome;
    }

    public Gp1Telefone[] getTelefones() {
        return telefones;
    }

    public Gp1Endereco getEndereco() {
        return endereco;
    }

    public void setTelefones(Gp1Telefone[] telefones) {
        this.telefones = telefones;
    }
    
    
    

}
