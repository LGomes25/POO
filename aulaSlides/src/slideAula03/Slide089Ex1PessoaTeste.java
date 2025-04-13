package slideAula03;
//Faça um programa para ler os dados de 2 pessoas contendo nome,
//peso e altura.Calcule e escreva: - nome da pessoa com maior peso
//- nome da pessoa com maior altura - média de peso - média de altura

import java.util.Scanner;

public class Slide089Ex1PessoaTeste {

	public static void main(String[] args) {
		
		Double mediaPeso;
		Double mediaAltura;
		Scanner sc = new Scanner(System.in);
		Slide089Ex1Pessoa p1 = new Slide089Ex1Pessoa();
		Slide089Ex1Pessoa p2 = new Slide089Ex1Pessoa();
		
		System.out.println("Preencher Dados");
		p1.preencherDados(sc);
		p2.preencherDados(sc);
		
		System.out.println("Exibir Dados");
		p1.exibirDados();
		p2.exibirDados();
		
		
		if (p1.peso.equals(p2.peso)) {
			System.out.println("Pesos Iguais");
		}else if (p1.peso>p2.peso) {
			System.out.println("\n"+p1.nome+" tem o maior peso");
		}else {
			System.out.println("\n"+p2.nome+" tem o maior peso");
		}
		
		if (p1.altura.equals(p2.altura)) {
			System.out.println("Alturas Iguais");
		}else if (p1.altura>p2.altura) {
			System.out.println(p1.nome+" tem a maior altura");
		}else {
			System.out.println(p2.nome+" tem a maior altura");
		}
		
		mediaPeso = (p1.peso+p2.peso)/2;
		System.out.println("\nA média dos pesos é de "+mediaPeso+"Kg");
		mediaAltura = (p1.altura+p2.altura)/2;
		System.out.println("A média das altura é de "+mediaAltura+"m");
		
		sc.close();
	}
}
