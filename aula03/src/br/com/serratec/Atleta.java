package br.com.serratec;

public class Atleta {

    //Atributos
    private String nome;
    private Integer idade;
    
    //Construtor
    public Atleta(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }


    public Integer getIdade() {
        return idade;
    }
    
    

}
