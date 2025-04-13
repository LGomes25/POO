package slideAula03;

//Criar uma classe com o método main para execução.
//Construir duas conta e atribuirvalores para teste.

public class Slide079Ex1Conta {
	
		int numero;
		double saldo;
		
		public void depositar(double valor) {
			this.saldo +=valor;
			System.out.println("Deposito Efetuado");
		}
		
		public String sacar(double valor) {
			if (saldo>valor) {
				saldo-=valor;
				return "Saque Efetuado";
			}
				return "Saldo Insuficiente";
		}
		
	}