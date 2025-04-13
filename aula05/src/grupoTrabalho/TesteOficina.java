package grupoTrabalho;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {

		Proprietario dono1 = new Proprietario("Joca");
		Proprietario dono2 = new Proprietario("Jó");
		Proprietario dono3 = new Proprietario("José");
		Carro car1 = new Carro("VW", LocalDate.of(2025, 4, 5), dono1, "Utilitário");
		Carro car2 = new Carro("GM", LocalDate.of(2025, 4, 4), dono2, "Utilitário");
		Carro car3 = new Carro("GM", LocalDate.of(2024, 8, 4), dono2, "Utilitário");
		Carro car4 = new Carro("Ford", LocalDate.of(2024, 8, 17), dono2, "Utilitário");
		Moto bike = new Moto("Honda", LocalDate.of(2025, 4, 4), dono3, 1100);

		car1.trocarOleo();
		car1.revisao();
		car2.trocarOleo();
		car2.revisao();
		car3.trocarOleo();
		car3.revisao();
		car4.trocarOleo();
		car4.revisao();
		bike.lavarVeiculo();

		System.out.println("Carro Óleo e Rev normal.\n" + car2.toString());
		System.out.println("\nCarro Rev normal e Óleo com R$50.00 off - sábado.\n" + car1.toString());
		System.out.println("\nCarro Óleo normal e Rev com 10% off em agosto.\n" + car3.toString());
		System.out.println("\nCarro Óleo com 50.00 off no sábado e Rev com 10% off em agosto.\n" + car4.toString());
		System.out.println("\nMoto Lavar\n" + bike.toString());

	}

}
