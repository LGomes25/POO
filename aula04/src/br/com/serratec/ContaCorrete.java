package br.com.serratec;

import br.com.serratec.exception.ContaCorrenteException;

public class ContaCorrete implements Conta {

	private String titular;
	private Double saldo;
	private static int movsaq;
	private static int movdep;

	// Construtor
	public ContaCorrete(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	// toString
	@Override
	public String toString() {
		return "ContaCorrete [titular=" + titular + ", saldo=" + saldo + "]";
	}

	// Interface
	@Override
	public Boolean saque(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			movsaq++;
			return true;
		}
		// return false;
		throw new ContaCorrenteException("Saldo Insuficiente para Saque!");
	}

	@Override
	public void deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
			movdep++;
			System.out.println("Saldo atual: " + saldo);
		} else {
			// System.out.println("Valor Inválido");
			throw new ContaCorrenteException("Valor Depósito Inválido!");
		}
	}

	public void investimento(Double valor) throws ContaCorrenteException {
		saldo -= valor;
	}

	// Getters
	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Integer getMovsaq() {
		return movsaq;
	}

	public Integer getMovdep() {
		return movdep;
	}

}
