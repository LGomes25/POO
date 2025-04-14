package slideAula09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Slide219Ex2TratamentoErro {

	public static void main(String[] args) {

		Integer num;

		do {
			num = 0;
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite um numero Inteiro: ");
				num = sc.nextInt();
				sc.close();
				System.out.println("Número digitado: " + num);
			} catch (InputMismatchException e) {
				System.out.println("Falha ao ler o número");
			}

		} while (num.equals(0));

	}

}
