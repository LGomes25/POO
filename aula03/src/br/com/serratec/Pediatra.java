package br.com.serratec;

public class Pediatra extends Medico {

    private String especializacao;

    public Pediatra(String crm, String nome, Double salario, String especializacao) {
        super(crm, nome, salario);
        this.especializacao = especializacao;
    }    
    
    @Override
    public Double calcularSalario() {
        return salario = salario + salario * 1.15;
    }


    public String getEspecializacao() {
        return especializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "Especializacao: "+ especializacao;
    }

    

}
