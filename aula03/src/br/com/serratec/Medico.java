package br.com.serratec;

public class Medico {

    protected String crm;
    protected String nome;
    protected Double salario;
    
    //construtor
    public Medico(String crm, String nome, Double salario) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
    }

    //Método
    public Double calcularSalario(){
        return salario = salario + salario * 1.05;
    }

    //Overload mesmo nome do método com antrada de valores
    public Double calcularSalario(Double valor){
        return salario = salario + salario * valor/100;
    }

    //toString
    @Override
    public String toString() {
        return "CRM: " + crm + ", Nome: " + nome + ", Salário: " + salario;
    }

    //Getters
    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    
    
    

}
