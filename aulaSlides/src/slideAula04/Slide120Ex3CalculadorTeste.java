package slideAula04;

import java.util.Scanner;

public class Slide120Ex3CalculadorTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Slide120Ex3Calculador cal = new Slide120Ex3Calculador();
		int op;//deve ser declarado fora do loop para poder ser executado
		
		do {
			System.out.println("Digite o primeiro numero: ");
			String num1 = sc.next();
			cal.setNum1(Double.parseDouble(num1));
					
			System.out.println("\nDigite o segundo numero: ");
			String num2 = sc.next();
			cal.setNum2(Double.parseDouble(num2));
			
			System.out.println("\nEscolha a Operação:\n1-Soma\n2-subtração"
					+"\n3-multiplicação\n4-divisão\n5-sair");
			String operacao = sc.next();
			op = Integer.parseInt(operacao);
			cal.setOperador(op);
			
			if (0 >= op || op > 5) {
				System.out.println("\nOperação Inválida!\n\n");
			}else if(op==5){
				System.out.println("\nCalculadora Encerrada!");
			}else {
				System.out.println("\nCalculo Escolhido:");
				System.out.println(cal.getNum1()+" "+cal.opesc()
					+" "+cal.getNum2()+" = "+cal.getResp()+"\n\n");
			}
		} while (op != 5);
		
		sc.close();
	}
}