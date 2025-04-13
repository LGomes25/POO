package exemplos;

import java.util.Scanner;

public class Ternario2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu dia da semana favorito?");
		System.out.println("Escolha de 1 a 7: ");
		
		int num = sc.nextInt();
		
		String dia = (num == 2) ? "segunda":
					(num == 3) ? "terça":
					(num == 4) ? "quarta":
					(num == 5) ? "quinta":
					(num == 6) ? "sexta":
					(num == 7) ? "sabado":
					(num == 1) ? "domingo" : "dia inválido";
		System.out.println("Dia escolhido: "+dia);
		sc.close();
	}

}
