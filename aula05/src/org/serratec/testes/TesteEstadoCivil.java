package org.serratec.testes;

import org.serratec.exemplo.EstadoCivil;
import org.serratec.exemplo.Pessoa;

public class TesteEstadoCivil {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Mildco", 1000.0);

		pessoa.setEstadoCivil(EstadoCivil.DIVORCIADO);

		System.out.println(pessoa.getEstadoCivil());
		System.out.println(pessoa.getEstadoCivil().getSigla());
		System.out.println(pessoa.getEstadoCivil().ordinal());

		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}

	}

}
