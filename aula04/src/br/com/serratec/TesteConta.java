package br.com.serratec;

import br.com.serratec.exception.ContaCorrenteException;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrete cc1 = new ContaCorrete("Fifo", 5500.);

		try {
			cc1.saque(2000.);
			cc1.deposito(-15.);
			System.out.println("Saldo Atual " + cc1.getSaldo());

		} catch (ContaCorrenteException ex) {
			System.out.println(ex.getMessage());

		} finally {
			System.out.println("Saldo Atual " + cc1.getSaldo());
		}

		System.out.println("Total de Movimentações: " + (cc1.getMovsaq() + cc1.getMovdep()) + "\nTotal de Saques: "
				+ cc1.getMovsaq() + "\nTotal de Depósitos: " + cc1.getMovdep());

	}

}
