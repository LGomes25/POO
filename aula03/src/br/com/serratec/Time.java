package br.com.serratec;

import java.util.Arrays;

public class Time {

    private String nome;
    private String tecnico;
    private Atleta[] atletas;
    
    //Construtor
    public Time(String nome, String tecnico, Atleta[] atletas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
    }

    //metodo
    public void adicionarAtleta(Atleta atleta){
        for (int i = 0; i < atletas.length; i++) {
            if(atletas[i]==null){
                atletas[i]=atleta;
                break;
            }
        }
    }

    public void imprimirElenco(){
        for (Atleta i : atletas) {
        	System.out.println(i);
        }
    }


    //toString
    @Override
    public String toString() {
        return "Time: " + nome + ", Tecnico: " + tecnico + ", Atletas: " + Arrays.toString(atletas);
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    
    

}
