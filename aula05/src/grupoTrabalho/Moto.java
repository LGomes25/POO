package grupoTrabalho;

import java.time.LocalDate;

public class Moto extends Veiculo {

	private int cilindradas;

	// Constructor
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	// Interface
	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return super.lavarVeiculo();
	}

	@Override
	public Double trocarOleo() {
		valorCobrado += TipoServico.OLEO.getValorPorServico();
		return super.trocarOleo();
	}

	@Override
	public Double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return super.revisao();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	
}
