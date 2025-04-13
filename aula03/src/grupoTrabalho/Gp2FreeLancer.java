package grupoTrabalho;

public class Gp2FreeLancer extends Gp2Vendedor{

//Atributos
private int diasTrabalhados;
private Double valorDia;

//Construtor
public Gp2FreeLancer(String nome, String cpf, int diasTrabalhados, Double valorDia) {
    super(nome, cpf);
    this.diasTrabalhados = diasTrabalhados;
    this.valorDia = valorDia;
}

//toString
@Override
public String toString() {
    return super.toString() + "\n--FreeLancer--\nDias Trabalhados: " + diasTrabalhados + "\nValor Dia: " + valorDia + "\nTotal: "+ (diasTrabalhados*valorDia);
}

//Getters e Setters
public int getDiasTrabalhados() {
    return diasTrabalhados;
}

public void setDiasTrabalhados(int diasTrabalhados) {
    this.diasTrabalhados = diasTrabalhados;
}

public Double getValorDia() {
    return valorDia;
}

public void setValorDia(Double valorDia) {
    this.valorDia = valorDia;
}



}
