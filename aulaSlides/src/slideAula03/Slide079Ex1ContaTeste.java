package slideAula03;

//Criar uma classe com o método main para execução.
//Construir duas conta e atribuirvalores para teste.

public class Slide079Ex1ContaTeste {

	public static void main(String[] args) {
		
		Slide079Ex1Conta c1 = new Slide079Ex1Conta();
		Slide079Ex1Conta c2 = new Slide079Ex1Conta();
		
		c1.numero = 1;
		c1.saldo=5000.;
		c2.numero = 2;
		c2.saldo=10000.;
		
		System.out.println("Conta N°: "+c1.numero+"\tSaldo: R$"+c1.saldo);
		System.out.println("Conta N°: "+c2.numero+"\tSaldo: R$"+c2.saldo);
		
		//Método "Depositar" que retorna diretamente "void"
		c1.depositar(1000.); 
		c2.depositar(1000.);
		
		System.out.println("Conta N°: "+c1.numero+"\tSaldo: R$"+c1.saldo);
		System.out.println("Conta N°: "+c2.numero+"\tSaldo: R$"+c2.saldo);
		
		
		//Método "Sacar" executa e armazena informações para serem usadas em conjunto.
		System.out.println("Conta N°: "+c1.numero+"\t"+c1.sacar(6500.));
		System.out.println("Conta N°: "+c2.numero+"\t"+c2.sacar(6500.));
	
		System.out.println("Conta N°: "+c1.numero+"\tSaldo: R$"+c1.saldo);
		System.out.println("Conta N°: "+c2.numero+"\tSaldo: R$"+c2.saldo);
		
	}

}
