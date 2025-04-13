package slideAula03;

import java.util.Scanner;

public class Slide084Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = sc.next();
		System.out.println("Qual o sua idade?");
		int idade = sc.nextInt();
		System.out.println("Qual a sua altura?");
		double altura = sc.nextDouble();//A resposta de entrada no teclado deverá usar "virgula"		
		
		System.out.println("\n"+nome+" tem "+idade+" de idade e "+altura+"m de altura.");
	
		sc.close();
	}

}
