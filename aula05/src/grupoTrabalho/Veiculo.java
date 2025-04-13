package grupoTrabalho;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {

	protected String modelo;
	protected Double valorCobrado=0.;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	// Construtor
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	// toString
	@Override
	public String toString() {
		return "Modelo: " + modelo + ", valorCobrado: " + valorCobrado + ", dataConserto: " + dataConserto
				+ ", proprietario: " + proprietario;
	}

	// Interface
	@Override
	public Double lavarVeiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double trocarOleo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double revisao() {
		// TODO Auto-generated method stub
		return null;
	}

	// Getters
	public Double getValorCobrado() {
		return valorCobrado;
	}

}
