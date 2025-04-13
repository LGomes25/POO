package grupoTrabalho;

import java.time.LocalDate;

public class Carro extends Veiculo {

	private String categoria;

	// Constructor
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
		//return super.lavarVeiculo(); 
	}

	@Override
	public Double trocarOleo() {
		//if (dataConserto.getDayOfWeek().getValue() == 7){ "pega o dia da semana como inteiro seg = 1,...
		if (dataConserto.getDayOfWeek().equals("SATURDAY")) {
			valorCobrado += TipoServico.OLEO.getValorPorServico() - 50.;
		} else {
			valorCobrado += TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
		//return super.trocarOleo();
	}

	@Override
	public Double revisao() {
		if (dataConserto.getMonthValue() == 8) {
			valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			valorCobrado += TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
		//return super.revisao();
	}

	// Getters
	public String getCategoria() {
		return categoria;
	}

}
