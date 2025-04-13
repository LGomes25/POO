package exemplos;

import java.util.Scanner;
import java.time.LocalDate;


public class LeituraScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;//Poderia ser declarado diretamente onde será lido.
		
		System.out.println("Qual o seu nome?  ");
		
		nome = sc.next();
		System.out.println("\nOlá "+nome+"!\nQual a sua idade?");
		
		int idade = sc.nextInt();//Declaração diretamente na execução
		System.out.println("\nVocê nasceu em "+ (LocalDate.now().getYear()-idade-1)
				+" ou em "+(LocalDate.now().getYear()-idade));
	
		sc.close();
	}
	
}
