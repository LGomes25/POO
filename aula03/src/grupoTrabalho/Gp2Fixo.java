package grupoTrabalho;

public class Gp2Fixo extends Gp2Vendedor{

    //Atributos
    private Double salarioBase;
    private Double comissao;
    private Double salarioBruto;
    
    //Construtor
    public Gp2Fixo(String nome, String cpf, Double salarioBase, Double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.salarioBruto = salarioBase;
    }
    //toString
    @Override
    public String toString() {
        return super.toString() + "\nSalário Base: " + salarioBase + "\nComissão=" + comissao + "\nSalário Bruto: " + salarioBruto;
    }

    //Metodo - Calcular e add comissoa por venda
    public void calcularSalario(Double valorVenda){
        salarioBruto += valorVenda * comissao;
    } 
    //Metodo - Apresentar salario vendedores
    public String menuSalario(){
        return "nome: " + nome + "\nSalário Bruto: " + salarioBruto;
    }

    //Getters e Setters
    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissa) {
        this.comissao = comissa;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    
}
